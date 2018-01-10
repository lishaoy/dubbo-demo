package docren.com.entity.po;

import java.io.Serializable;
import java.math.BigDecimal;

public class AnkleOrder implements Serializable {
    private static final long serialVersionUID = -7409626015547444772L;
    /**
     * @Author lishaoyong
     **/
    private Integer id;

    /**
     * 订单编号,用于展示
     *
     * @Author lishaoyong
     **/
    private String orderCode;

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
     * 订单完成时间
     *
     * @Author lishaoyong
     **/
    private Integer finishAt;

    /**
     * 是否需要发票
     *
     * @Author lishaoyong
     **/
    private Integer isInvoice;

    /**
     * 发票信息ID
     *
     * @Author lishaoyong
     **/
    private Integer invoiceId;

    /**
     * 收件地址信息ID
     *
     * @Author lishaoyong
     **/
    private Integer receiverId;

    /**
     * 订单状态;0:取消,1:完成
     *
     * @Author lishaoyong
     **/
    private Integer state;

    /**
     * 实际付款
     *
     * @Author lishaoyong
     **/
    private BigDecimal amount;

    /**
     * 订单售卖价
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
     * 备注信息
     *
     * @Author lishaoyong
     **/
    private String remarks;

    /**
     * 修改时间
     *
     * @Author lishaoyong
     **/
    private Integer updateAt;

    /**
     * 支付
     */
    private Integer finishPayAt;

    /**
     * 支付状态
     */
    private Integer payState;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode == null ? null : orderCode.trim();
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

    public Integer getFinishAt() {
        return finishAt;
    }

    public void setFinishAt(Integer finishAt) {
        this.finishAt = finishAt;
    }

    public Integer getIsInvoice() {
        return isInvoice;
    }

    public void setIsInvoice(Integer isInvoice) {
        this.isInvoice = isInvoice;
    }

    public Integer getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(Integer invoiceId) {
        this.invoiceId = invoiceId;
    }

    public Integer getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(Integer receiverId) {
        this.receiverId = receiverId;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
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

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public Integer getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Integer updateAt) {
        this.updateAt = updateAt;
    }

    public Integer getFinishPayAt() {
        return finishPayAt;
    }

    public void setFinishPayAt(Integer finishPayAt) {
        this.finishPayAt = finishPayAt;
    }

    public Integer getPayState() {
        return payState;
    }

    public void setPayState(Integer payState) {
        this.payState = payState;
    }
}