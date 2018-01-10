package aynl.net.entity.po;

import java.io.Serializable;

public class AnkleReceiver implements Serializable {
    private static final long serialVersionUID = -5194781807766937619L;
    /**
     * @Author lishaoyong
     **/
    private Integer id;

    /**
     * 用户ID
     *
     * @Author lishaoyong
     **/
    private Integer userId;

    /**
     * 省份名称
     *
     * @Author lishaoyong
     **/
    private String provinceName;

    /**
     * 城市名称
     *
     * @Author lishaoyong
     **/
    private String cityName;

    /**
     * 收货人名称
     *
     * @Author lishaoyong
     **/
    private String receiverName;

    /**
     * 收货地址
     *
     * @Author lishaoyong
     **/
    private String receiverAddress;

    /**
     * 电话
     *
     * @Author lishaoyong
     **/
    private String iphone;

    /**
     * 是否默认,0否1:是
     *
     * @Author lishaoyong
     **/
    private Integer isDefault;

    /**
     * 状态,0:删除,1:未删除
     *
     * @Author lishaoyong
     **/
    private Integer state;

    /**
     * 创建时间
     *
     * @Author lishaoyong
     **/
    private Integer createAt;

    /**
     * 修改时间
     *
     * @Author lishaoyong
     **/
    private Integer updateAt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName == null ? null : provinceName.trim();
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName == null ? null : cityName.trim();
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName == null ? null : receiverName.trim();
    }

    public String getReceiverAddress() {
        return receiverAddress;
    }

    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress == null ? null : receiverAddress.trim();
    }

    public String getIphone() {
        return iphone;
    }

    public void setIphone(String iphone) {
        this.iphone = iphone == null ? null : iphone.trim();
    }

    public Integer getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Integer isDefault) {
        this.isDefault = isDefault;
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