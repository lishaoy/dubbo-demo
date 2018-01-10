package docren.com.entity.dto;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by lishaoyong on 17/10/28.
 */
public class CommodityDTO implements Serializable {
    private static final long serialVersionUID = -7188065723709765935L;

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
     * 合作方客户ID
     * @Author  lishaoyong
     **/
    private Integer partnerId;

    /**
     * 是否开启积分兑换
     * @Author  lishaoyong
     **/
    private Integer isPoint;

    /**
     * 积分兑换价格
     * @Author  lishaoyong
     **/
    private Integer pointPrice;

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    public String getCommodityCode() {
        return commodityCode;
    }

    public void setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
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
        this.productCategory = productCategory;
    }

    public String getTexture() {
        return texture;
    }

    public void setTexture(String texture) {
        this.texture = texture;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getExt() {
        return ext;
    }

    public void setExt(String ext) {
        this.ext = ext;
    }

    public String getCommodityDetail() {
        return commodityDetail;
    }

    public void setCommodityDetail(String commodityDetail) {
        this.commodityDetail = commodityDetail;
    }

    public Integer getPartnerId() {
        return partnerId;
    }

    public void setPartnerId(Integer partnerId) {
        this.partnerId = partnerId;
    }

    public Integer getIsPoint() {
        return isPoint;
    }

    public void setIsPoint(Integer isPoint) {
        this.isPoint = isPoint;
    }

    public Integer getPointPrice() {
        return pointPrice;
    }

    public void setPointPrice(Integer pointPrice) {
        this.pointPrice = pointPrice;
    }
}
