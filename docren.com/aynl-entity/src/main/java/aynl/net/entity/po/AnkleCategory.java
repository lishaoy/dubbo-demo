package aynl.net.entity.po;

import java.io.Serializable;

public class AnkleCategory implements Serializable {
    private static final long serialVersionUID = 7843121080741434676L;
    /**
     * 一级分类ID
     * @Author  lishaoyong
    **/
    private Integer id;

    /** 
     * 分类名称
     * @Author  lishaoyong
    **/
    private String categoryName;

    /** 
     * 创建时间
     * @Author  lishaoyong
    **/
    private Integer createAt;

    /** 
     * 创建人
     * @Author  lishaoyong
    **/
    private Integer createId;

    /** 
     * 修改时间
     * @Author  lishaoyong
    **/
    private Integer updateAt;

    /** 
     * 修改人
     * @Author  lishaoyong
    **/
    private Integer updateId;

    /** 
     * 状态:0:删除,1:未删除
     * @Author  lishaoyong
    **/
    private Integer state;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName == null ? null : categoryName.trim();
    }

    public Integer getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Integer createAt) {
        this.createAt = createAt;
    }

    public Integer getCreateId() {
        return createId;
    }

    public void setCreateId(Integer createId) {
        this.createId = createId;
    }

    public Integer getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Integer updateAt) {
        this.updateAt = updateAt;
    }

    public Integer getUpdateId() {
        return updateId;
    }

    public void setUpdateId(Integer updateId) {
        this.updateId = updateId;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}