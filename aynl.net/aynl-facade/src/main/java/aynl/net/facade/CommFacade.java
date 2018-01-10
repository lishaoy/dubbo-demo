package aynl.net.facade;



/**
 * Created by lishaoyong on 17/12/17.
 */
public interface CommFacade{

    /**
     * 文件上传
     * @param uploadBytes
     * @param bucket
     * @param fileName
     * @param updloadType
     * @return
     */
    String upload(byte[] uploadBytes, String bucket, String fileName,Integer updloadType);
}
