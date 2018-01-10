package aynl.net.entity.po;

import java.io.Serializable;

public class AnkleCommodityPic implements Serializable {
    private static final long serialVersionUID = -947558812978241680L;
    /**
     * 主键
     * @Author  lishaoyong
    **/
    private Integer id;

    /** 
     * 商品ID
     * @Author  lishaoyong
    **/
    private Integer commodityId;

    /** 
     * 图片排序
     * @Author  lishaoyong
    **/
    private Integer picRank;

    /** 
     * 七牛云图片地址
     * @Author  lishaoyong
    **/
    private String address;

    /** 
     * 创建人
     * @Author  lishaoyong
    **/
    private Integer createId;

    /** 
     * 创建时间
     * @Author  lishaoyong
    **/
    private Integer createAt;

    /** 
     * 修改人
     * @Author  lishaoyong
    **/
    private Integer updateId;

    /** 
     * 修改时间
     * @Author  lishaoyong
    **/
    private Integer updateAt;

    /** 
     * 是否启用:0:禁用,1:启用
     * @Author  lishaoyong
    **/
    private Integer state;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(Integer commodityId) {
        this.commodityId = commodityId;
    }

    public Integer getPicRank() {
        return picRank;
    }

    public void setPicRank(Integer picRank) {
        this.picRank = picRank;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Integer getCreateId() {
        return createId;
    }

    public void setCreateId(Integer createId) {
        this.createId = createId;
    }

    public Integer getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Integer createAt) {
        this.createAt = createAt;
    }

    public Integer getUpdateId() {
        return updateId;
    }

    public void setUpdateId(Integer updateId) {
        this.updateId = updateId;
    }

    public Integer getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Integer updateAt) {
        this.updateAt = updateAt;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}