package docren.com.entity.po;

import java.io.Serializable;

public class AnklePartner implements Serializable {
    private static final long serialVersionUID = -1432268860188903148L;
    /**
     * 客户ID
     *
     * @Author lishaoyong
     **/
    private Integer id;

    /**
     * 厂商名称
     *
     * @Author lishaoyong
     **/
    private String name;

    /**
     * 账户名称
     *
     * @Author lishaoyong
     **/
    private String accountName;

    /**
     * 账户
     *
     * @Author lishaoyong
     **/
    private String accountNo;

    /**
     * 开户行
     *
     * @Author lishaoyong
     **/
    private String openingBank;

    /**
     * 销售人员名称
     *
     * @Author lishaoyong
     **/
    private String saleName;

    /**
     * 营业执照
     *
     * @Author lishaoyong
     **/
    private String businessLicense;

    /**
     * 生产许可证
     *
     * @Author lishaoyong
     **/
    private String productionCertificate;

    /**
     * 注册证
     *
     * @Author lishaoyong
     **/
    private String registrationCertificate;

    /**
     * 创建人
     *
     * @Author lishaoyong
     **/
    private Integer createId;

    /**
     * 创建时间
     *
     * @Author lishaoyong
     **/
    private Integer createAt;

    /**
     * 修改ID
     *
     * @Author lishaoyong
     **/
    private Integer updateId;

    /**
     * 修改时间
     *
     * @Author lishaoyong
     **/
    private Integer updateAt;

    /**
     * 状态:0:删除,1未删除
     *
     * @Author lishaoyong
     **/
    private Integer state;

    private String saleProtocol;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName == null ? null : accountName.trim();
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo == null ? null : accountNo.trim();
    }

    public String getOpeningBank() {
        return openingBank;
    }

    public void setOpeningBank(String openingBank) {
        this.openingBank = openingBank == null ? null : openingBank.trim();
    }

    public String getSaleName() {
        return saleName;
    }

    public void setSaleName(String saleName) {
        this.saleName = saleName == null ? null : saleName.trim();
    }

    public String getBusinessLicense() {
        return businessLicense;
    }

    public void setBusinessLicense(String businessLicense) {
        this.businessLicense = businessLicense == null ? null : businessLicense.trim();
    }

    public String getProductionCertificate() {
        return productionCertificate;
    }

    public void setProductionCertificate(String productionCertificate) {
        this.productionCertificate = productionCertificate == null ? null : productionCertificate.trim();
    }

    public String getRegistrationCertificate() {
        return registrationCertificate;
    }

    public void setRegistrationCertificate(String registrationCertificate) {
        this.registrationCertificate = registrationCertificate == null ? null : registrationCertificate.trim();
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

    public String getSaleProtocol() {
        return saleProtocol;
    }

    public void setSaleProtocol(String saleProtocol) {
        this.saleProtocol = saleProtocol;
    }
}