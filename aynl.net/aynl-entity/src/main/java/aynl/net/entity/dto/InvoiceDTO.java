package aynl.net.entity.dto;

import java.io.Serializable;

/**
 * Created by lishaoyong on 17/10/28.
 */
public class InvoiceDTO implements Serializable {

    private static final long serialVersionUID = -5751700225652174134L;
    private String invoiceRise;

    private String taxpayerNo;

    private String invoiceType;

    private Integer userId;


    public String getInvoiceRise() {
        return invoiceRise;
    }

    public void setInvoiceRise(String invoiceRise) {
        this.invoiceRise = invoiceRise;
    }

    public String getTaxpayerNo() {
        return taxpayerNo;
    }

    public void setTaxpayerNo(String taxpayerNo) {
        this.taxpayerNo = taxpayerNo;
    }

    public String getInvoiceType() {
        return invoiceType;
    }

    public void setInvoiceType(String invoiceType) {
        this.invoiceType = invoiceType;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
