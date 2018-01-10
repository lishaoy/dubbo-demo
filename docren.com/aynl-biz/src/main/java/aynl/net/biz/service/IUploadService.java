package aynl.net.biz.service;


import docren.com.comm.FacadeService;

/**
 * Created by lishaoyong on 17/12/17.
 */
public interface IUploadService extends FacadeService {


    String upload(byte[] uploadBytes, String bucket, String fileName, Integer updloadType);
}
