package docren.com.entity.po;

import java.io.Serializable;

public class AnkleInvoice implements Serializable {
    private static final long serialVersionUID = 8787785187742518362L;
    /**
     * 主键
     * @Author  lishaoyong
    **/
    private Integer id;

    /** 
     * 发票抬头
     * @Author  lishaoyong
    **/
    private String invoiceRise;

    /** 
     * 纳税人识别号
     * @Author  lishaoyong
    **/
    private String taxpayerNo;

    /** 
     * 发票类型:1:个人,2:企业
     * @Author  lishaoyong
    **/
    private Integer invoiceType;

    /** 
     * 用户ID
     * @Author  lishaoyong
    **/
    private Integer userId;

    /** 
     * 状态,0:删除,1:未删除
     * @Author  lishaoyong
    **/
    private Integer state;

    /** 
     * 创建时间
     * @Author  lishaoyong
    **/
    private Integer createAt;

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

    public String getInvoiceRise() {
        return invoiceRise;
    }

    public void setInvoiceRise(String invoiceRise) {
        this.invoiceRise = invoiceRise == null ? null : invoiceRise.trim();
    }

    public String getTaxpayerNo() {
        return taxpayerNo;
    }

    public void setTaxpayerNo(String taxpayerNo) {
        this.taxpayerNo = taxpayerNo == null ? null : taxpayerNo.trim();
    }

    public Integer getInvoiceType() {
        return invoiceType;
    }

    public void setInvoiceType(Integer invoiceType) {
        this.invoiceType = invoiceType;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
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

    public Integer getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Integer updateAt) {
        this.updateAt = updateAt;
    }
}