package docren.com.entity.po;

import java.io.Serializable;

public class AnkleAdvertis implements Serializable{
    private static final long serialVersionUID = -8840101484792755295L;
    /**
     * 主键
     * @Author  lishaoyong
    **/
    private Integer id;

    /** 
     * 广告标题
     * @Author  lishaoyong
    **/
    private String title;

    /** 
     * 广告开始时间
     * @Author  lishaoyong
    **/
    private Integer startAt;

    /** 
     * 广告结束时间
     * @Author  lishaoyong
    **/
    private Integer endAt;

    /** 
     * 一级分类
     * @Author  lishaoyong
    **/
    private Integer categoryId;

    /** 
     * 二级分类
     * @Author  lishaoyong
    **/
    private Integer categoryMajorId;

    /** 
     * 详细信息
     * @Author  lishaoyong
    **/
    private String detail;

    /** 
     * 是否启用0:禁用,1:启用
     * @Author  lishaoyong
    **/
    private Integer state;

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
     * 排名
     * @Author  lishaoyong
    **/
    private Integer ranking;

    /** 
     * 位置:1:top,2:bottom,3:sidebar
     * @Author  lishaoyong
    **/
    private Integer place;

    /** 
     * 频道:1:主页2:商品页
     * @Author  lishaoyong
    **/
    private Integer channel;

    /** 
     * 广告类型:0:轮播图,1:单图
     * @Author  lishaoyong
    **/
    private Integer advType;

    /** 
     * 虚拟广告位ID
     * @Author  lishaoyong
    **/
    private Integer positionId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Integer getStartAt() {
        return startAt;
    }

    public void setStartAt(Integer startAt) {
        this.startAt = startAt;
    }

    public Integer getEndAt() {
        return endAt;
    }

    public void setEndAt(Integer endAt) {
        this.endAt = endAt;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getCategoryMajorId() {
        return categoryMajorId;
    }

    public void setCategoryMajorId(Integer categoryMajorId) {
        this.categoryMajorId = categoryMajorId;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
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

    public Integer getRanking() {
        return ranking;
    }

    public void setRanking(Integer ranking) {
        this.ranking = ranking;
    }

    public Integer getPlace() {
        return place;
    }

    public void setPlace(Integer place) {
        this.place = place;
    }

    public Integer getChannel() {
        return channel;
    }

    public void setChannel(Integer channel) {
        this.channel = channel;
    }

    public Integer getAdvType() {
        return advType;
    }

    public void setAdvType(Integer advType) {
        this.advType = advType;
    }

    public Integer getPositionId() {
        return positionId;
    }

    public void setPositionId(Integer positionId) {
        this.positionId = positionId;
    }
}