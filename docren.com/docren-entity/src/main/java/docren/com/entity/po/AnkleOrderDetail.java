package docren.com.entity.po;

import java.io.Serializable;
import java.math.BigDecimal;

public class AnkleOrderDetail implements Serializable {
    private static final long serialVersionUID = 7628042831720821967L;
    /**
     * @Author lishaoyong
     **/
    private Integer id;

    /**
     * 订单id
     *
     * @Author lishaoyong
     **/
    private Integer orderId;

    /**
     * 购买用户ID
     *
     * @Author lishaoyong
     **/
    private Integer userId;

    /**
     * 购买时间
     *
     * @Author lishaoyong
     **/
    private Integer createAt;

    /**
     * 商品ID
     *
     * @Author lishaoyong
     **/
    private Integer commodityId;

    /**
     * 商品名称
     *
     * @Author lishaoyong
     **/
    private String commodityName;

    /**
     * 商品定价
     *
     * @Author lishaoyong
     **/
    private BigDecimal price;

    /**
     * 优惠金额
     *
     * @Author lishaoyong
     **/
    private BigDecimal discountAmount;

    /**
     * 实际支付金额
     */
    private BigDecimal amount;

    /**
     * 购买数量
     */
    private Integer purchaseNum;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Integer createAt) {
        this.createAt = createAt;
    }

    public Integer getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(Integer commodityId) {
        this.commodityId = commodityId;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName == null ? null : commodityName.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(BigDecimal discountAmount) {
        this.discountAmount = discountAmount;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Integer getPurchaseNum() {
        return purchaseNum;
    }

    public void setPurchaseNum(Integer purchaseNum) {
        this.purchaseNum = purchaseNum;
    }
}