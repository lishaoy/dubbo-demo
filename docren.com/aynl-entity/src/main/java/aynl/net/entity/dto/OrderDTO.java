package aynl.net.entity.dto;

import java.io.Serializable;
import java.util.Map;

/**
 * Created by lishaoyong on 17/10/27.
 */
public class OrderDTO implements Serializable {

    private static final long serialVersionUID = -3625481754728556939L;
    /**
     * 主商品,如果用户购买了多个,逻辑后端来处理
     */
    private Map<Integer,Integer> commodityId;

    /**
     * 用户ID
     */
    private Integer userId;

    /**
     * 发票信息
     */
    private Integer invoiceId;

    private Integer receiverId;


    public Map<Integer, Integer> getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(Map<Integer, Integer> commodityId) {
        this.commodityId = commodityId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
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
}
