package docren.com.biz.service.impl;

import docren.com.biz.service.IUploadService;
import com.google.gson.Gson;
import com.qiniu.common.QiniuException;
import com.qiniu.common.Zone;
import com.qiniu.http.Response;
import com.qiniu.storage.Configuration;
import com.qiniu.storage.UploadManager;
import com.qiniu.storage.model.DefaultPutRet;
import com.qiniu.util.Auth;
import com.qiniu.util.StringMap;
import docren.com.biz.dao.docren.AnkleUploadLogDao;
import docren.com.entity.enums.BucketEnum;
import docren.com.entity.enums.UploadTypeEnum;
import docren.com.entity.po.AnkleUploadLog;
import docren.com.utils.util.MD5;
import docren.com.utils.util.timeUtil.UnixTimeUtils;
import org.springframework.beans.factory.annotation.Value;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.ByteArrayInputStream;

/**
 * Created by lishaoyong on 17/12/17.
 */
@Service
public class UploadService implements IUploadService {
    private static org.slf4j.Logger log = LoggerFactory.getLogger(UploadService.class);

    @Value("${cdn.access.key}")
    private String cdnAccess;

    @Value("${cdn.secret.key}")
    private String cdnSeret;


    @Resource
    AnkleUploadLogDao ankleUploadLogDao;


    @Override
    public String upload(byte[] uploadBytes, String bucket, String fileName, Integer updloadType) {

        String request = "";
        //指定机房
        Configuration cfg = new Configuration(Zone.zone0());
        String key = getPath(fileName, updloadType,bucket);

        String bucketName = BucketEnum.findByValue(bucket).getValue();

        UploadManager uploadManager = new UploadManager(cfg);
        ByteArrayInputStream byteInputStream = new ByteArrayInputStream(uploadBytes);
        Auth auth = Auth.create(cdnAccess, cdnSeret);
        //覆盖上传
        String upToken = auth.uploadToken(bucketName, key, 3600, new StringMap().put("insertOnly", 0));
        try {
            Response response = uploadManager.put(byteInputStream, key, upToken, null, null);
            //解析上传成功的结果
            DefaultPutRet putRet = new Gson().fromJson(response.bodyString(), DefaultPutRet.class);
            request = putRet.key;
            log.info("七牛CDN图片上传,图片名称:" + fileName + ",上传时间:" + UnixTimeUtils.now() + ",hashcode:" + request);
        } catch (QiniuException ex) {
            Response r = ex.response;
            log.info("七牛CDN图片上传,错误日志." + r.toString() + ",时间:" + UnixTimeUtils.now());
            System.err.println(r.toString());
            try {
                log.info("七牛CDN图片上传,错误日志." + r.bodyString() + ",时间:" + UnixTimeUtils.now());
                System.err.println(r.bodyString());
            } catch (QiniuException ex2) {
                log.info("七牛CDN图片上传,错误日志." + ex2.getMessage() + ",时间:" + UnixTimeUtils.now());
            }
        }

        return request;
    }


    public String getPath(String fileName, Integer updloadType, String bucket) {


        AnkleUploadLog ankleUploadLog = ankleUploadLogDao.getUploadLog(fileName);
        String bucketName = BucketEnum.findByValue(bucket).getValue();

        String key = "";
        if (ankleUploadLog != null) {
            key = ankleUploadLog.getUploadName();
            ankleUploadLog.setCreateAt(UnixTimeUtils.now());
            ankleUploadLog.setBucketName(bucketName);
            ankleUploadLog.setId(null);
            ankleUploadLogDao.insertUploadLog(ankleUploadLog);
        } else {
            if (fileName.lastIndexOf(".") <= 0){
                key = MD5.enCode(fileName + UnixTimeUtils.now()) + fileName + ".jpg";
            }else{
                key = MD5.enCode(fileName + UnixTimeUtils.now()) + fileName.substring(fileName.lastIndexOf("."));
            }

            AnkleUploadLog uploadLog = new AnkleUploadLog();

            uploadLog.setBucketName(bucketName);
            uploadLog.setCreateAt(UnixTimeUtils.now());
            uploadLog.setUploadName(key);
            uploadLog.setFileName(fileName);
            ankleUploadLogDao.insertUploadLog(uploadLog);
        }


        switch (UploadTypeEnum.findByValue(updloadType)) {
            case IMG:
                key = "static/img/" + key;
                break;
            case PDF:
                key = "static/pdf/" + key;
                break;
            case WORD:
                key = "static/word/" + key;
                break;
            case TEXT:
                key = "static/text/" + key;
                break;
            default:
                key = "static/" + key;
                break;
        }

        return key;
    }
}
