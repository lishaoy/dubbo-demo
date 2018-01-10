package docren.com.biz.facade;


import com.alibaba.dubbo.config.annotation.Service;
import docren.com.biz.service.IUploadService;
import docren.com.facade.CommFacade;

import javax.annotation.Resource;


/**
 * Created by lishaoyong on 17/12/17.
 */
@Service
public class UploadFacade implements CommFacade {

    @Resource
    IUploadService uploadService;


    @Override
    public String upload(byte[] uploadBytes, String bucket, String fileName, Integer updloadType) {
        return uploadService.upload(uploadBytes,bucket,fileName,updloadType);
    }
}
