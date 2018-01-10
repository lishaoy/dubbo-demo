package aynl.net.entity.dto;

import java.io.Serializable;

/**
 * Created by lishaoyong on 17/10/28.
 */
public class PartnerDTO implements Serializable {

    private static final long serialVersionUID = -4687257143774396251L;

    /**
     * 厂商名称
     */
    private String name;

    /**
     * 账户名称
     */
    private String accountName;

    /**
     * 账户
     */
    private String accountNo;

    /**
     * 开户行
     */
    private String openingBank;

    /**
     * 销售名称
     */
    private String saleName;

    /**
     * 营业执照
     */
    private String businessLicense;

    /**
     * 生产许可证
     */
    private String productionCertificate;

    /**
     * 注册证
     */
    private String registrationCertificate;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getOpeningBank() {
        return openingBank;
    }

    public void setOpeningBank(String openingBank) {
        this.openingBank = openingBank;
    }

    public String getSaleName() {
        return saleName;
    }

    public void setSaleName(String saleName) {
        this.saleName = saleName;
    }

    public String getBusinessLicense() {
        return businessLicense;
    }

    public void setBusinessLicense(String businessLicense) {
        this.businessLicense = businessLicense;
    }

    public String getProductionCertificate() {
        return productionCertificate;
    }

    public void setProductionCertificate(String productionCertificate) {
        this.productionCertificate = productionCertificate;
    }

    public String getRegistrationCertificate() {
        return registrationCertificate;
    }

    public void setRegistrationCertificate(String registrationCertificate) {
        this.registrationCertificate = registrationCertificate;
    }
}
