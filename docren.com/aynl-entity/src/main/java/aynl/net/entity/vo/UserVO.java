package aynl.net.entity.vo;



import aynl.net.entity.po.AnkleInvoice;
import aynl.net.entity.po.AnkleReceiver;

import java.io.Serializable;
import java.util.List;

/**
 * Created by lishaoyong on 17/10/29.
 */
public class UserVO implements Serializable{

    private Integer userId;

    private List<AnkleReceiver> ankleReceivers;

    private List<AnkleInvoice> ankleInvoices;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public List<AnkleReceiver> getAnkleReceivers() {
        return ankleReceivers;
    }

    public void setAnkleReceivers(List<AnkleReceiver> ankleReceivers) {
        this.ankleReceivers = ankleReceivers;
    }

    public List<AnkleInvoice> getAnkleInvoices() {
        return ankleInvoices;
    }

    public void setAnkleInvoices(List<AnkleInvoice> ankleInvoices) {
        this.ankleInvoices = ankleInvoices;
    }
}
