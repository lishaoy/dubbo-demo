package docren.com.entity.po;

import java.io.Serializable;
import java.math.BigDecimal;

public class AnkleCommodity implements Serializable {
    private static final long serialVersionUID = 5505626099359624267L;
    /**
     * 主键
     * @Author  lishaoyong
    **/
    private Integer id;

    /** 
     * 商品名称
     * @Author  lishaoyong
    **/
    private String commodityName;

    /** 
     * 商品编号
     * @Author  lishaoyong
    **/
    private String commodityCode;

    /** 
     * 商品一级分类
     * @Author  lishaoyong
    **/
    private Integer categoryId;

    /** 
     * 医疗器械产品的分类:I,II III,枚举区分
     * @Author  lishaoyong
    **/
    private String productCategory;

    /** 
     * 产品材质
     * @Author  lishaoyong
    **/
    private String texture;

    /** 
     * 标准名称
     * @Author  lishaoyong
    **/
    private String standard;

    /** 
     * 产地
     * @Author  lishaoyong
    **/
    private String origin;

    /** 
     * 品牌
     * @Author  lishaoyong
    **/
    private String brand;

    /** 
     * 售卖价格
     * @Author  lishaoyong
    **/
    private BigDecimal price;

    /** 
     * 积分兑换价格
     * @Author  lishaoyong
    **/
    private Integer pointPrice;

    /** 
     * 合作方客户ID
     * @Author  lishaoyong
    **/
    private Integer partnerId;

    /** 
     * 是否启用会员福利,0:否,1是
     * @Author  lishaoyong
    **/
    private Integer isWelfare;

    /** 
     * 是否开启积分兑换
     * @Author  lishaoyong
    **/
    private Integer isPoint;

    /** 
     * 扩展信息
     * @Author  lishaoyong
    **/
    private String ext;

    /** 
     * 商品详情页
     * @Author  lishaoyong
    **/
    private String commodityDetail;

    /** 
     * 是否删除0:删除1:未删除
     * @Author  lishaoyong
    **/
    private Integer state;

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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName == null ? null : commodityName.trim();
    }

    public String getCommodityCode() {
        return commodityCode;
    }

    public void setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode == null ? null : commodityCode.trim();
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory == null ? null : productCategory.trim();
    }

    public String getTexture() {
        return texture;
    }

    public void setTexture(String texture) {
        this.texture = texture == null ? null : texture.trim();
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard == null ? null : standard.trim();
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin == null ? null : origin.trim();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand == null ? null : brand.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getPointPrice() {
        return pointPrice;
    }

    public void setPointPrice(Integer pointPrice) {
        this.pointPrice = pointPrice;
    }

    public Integer getPartnerId() {
        return partnerId;
    }

    public void setPartnerId(Integer partnerId) {
        this.partnerId = partnerId;
    }

    public Integer getIsWelfare() {
        return isWelfare;
    }

    public void setIsWelfare(Integer isWelfare) {
        this.isWelfare = isWelfare;
    }

    public Integer getIsPoint() {
        return isPoint;
    }

    public void setIsPoint(Integer isPoint) {
        this.isPoint = isPoint;
    }

    public String getExt() {
        return ext;
    }

    public void setExt(String ext) {
        this.ext = ext == null ? null : ext.trim();
    }

    public String getCommodityDetail() {
        return commodityDetail;
    }

    public void setCommodityDetail(String commodityDetail) {
        this.commodityDetail = commodityDetail == null ? null : commodityDetail.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
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
}