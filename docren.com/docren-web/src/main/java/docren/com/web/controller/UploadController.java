package docren.com.web.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import docren.com.comm.FacadeController;
import docren.com.entity.domain.RequestMessage;
import docren.com.facade.CommFacade;
import docren.com.utils.util.LogUtil;
import docren.com.utils.util.jsonUtil.GsonUtils;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.*;

/**
 * Created by lishaoyong on 17/10/27.
 */
@Controller
@RequestMapping("/upload")
public class UploadController implements FacadeController {
    private static org.slf4j.Logger log = LoggerFactory.getLogger(UploadController.class);

    @Reference
    CommFacade uploadFacade;

    /**
     * 文件上传接口
     * @param request
     * @param response
     * @return
     * @throws IllegalStateException
     * @throws IOException
     */
    @RequestMapping("/cdn")
    public ResponseEntity<RequestMessage<Set<String>>> upload(HttpServletRequest request, HttpServletResponse response) throws IllegalStateException, IOException {

        String bucket = request.getParameter("bucket");
        String uploadType = request.getParameter("uploadType");

        //日志记录
        Map<String,String> map = new HashMap<>();
        map.put("bucket",bucket);
        map.put("uploadType",uploadType);
        log(0, "medical.ankle.http.controller.UploadController", "upload", GsonUtils.toJson(map), true, null);
        if (bucket == null || bucket.isEmpty()) {
            bucket = "public";
        }

        if (uploadType == null || uploadType.isEmpty()) {
            uploadType = "1";
        }


        Set<String> hashCode = new HashSet<>();

        CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver(request.getSession().getServletContext());

        if (multipartResolver.isMultipart(request)) {
            MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest) request;
            Iterator<String> iter = multiRequest.getFileNames();
            while (iter.hasNext()) {
                MultipartFile file = multiRequest.getFile(iter.next());
                if (file != null) {
                    String filename = file.getOriginalFilename();

                    byte[] bytes = file.getBytes();
                    hashCode.add(uploadFacade.upload(bytes, bucket, filename, Integer.valueOf(uploadType)));
                }
            }

        } else {
            return ResponseEntity.ok(new RequestMessage<Set<String>>(false, 0, "文件不能为空", null));
        }
        return ResponseEntity.ok(new RequestMessage<Set<String>>(true, 0, "成功", hashCode));
    }

    private void log(long start, String interfaceName,String className, String paramInfo, boolean isNormal, String msg) {
        LogUtil.REQUEST_LOGGER.info(String.format("%s %s %s %s %s %s", interfaceName,className, 0, "ok", paramInfo, ""));
    }
}
