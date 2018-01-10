package docren.com.entity.dto;

import java.io.Serializable;

/**
 * Created by lishaoyong on 17/10/27.
 */
public class ReceiverDTO implements Serializable {


    private static final long serialVersionUID = -4989506654032831971L;
    /**
     * 用户ID
     */
    private Integer userId;

    private String provinceName;

    private String cityName;

    private String receiverName;

    private String receiverAddress;

    private String iphone;


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
        this.provinceName = provinceName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getReceiverAddress() {
        return receiverAddress;
    }

    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress;
    }

    public String getIphone() {
        return iphone;
    }

    public void setIphone(String iphone) {
        this.iphone = iphone;
    }
}
