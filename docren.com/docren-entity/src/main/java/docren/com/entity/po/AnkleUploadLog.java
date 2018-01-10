package docren.com.entity.po;

import java.io.Serializable;

/**
 * Created by lishaoyong on 17/10/30.
 */
public class AnkleUploadLog implements Serializable {


    private Integer id;

    /**
     * 文件名称
     */
    private String fileName;

    /**
     * cdn空间名称
     */
    private String uploadName;

    /**
     * 空间
     */
    private String bucketName;

    /**
     * 创建时间
     */
    private Integer createAt;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getUploadName() {
        return uploadName;
    }

    public void setUploadName(String uploadName) {
        this.uploadName = uploadName;
    }

    public String getBucketName() {
        return bucketName;
    }

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public Integer getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Integer createAt) {
        this.createAt = createAt;
    }
}
