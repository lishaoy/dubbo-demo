package docren.com.entity.dto;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by lishaoyong on 17/10/27.
 */
public class PayOrderDTO implements Serializable {


    private static final long serialVersionUID = 4652243905061897880L;
    /**
     * 主商品,如果用户购买了多个,逻辑后端来处理
     */
    private Integer orderId;

    /**
     * 支付完成时间
     */
    private Integer finishPayAt;

    /**
     * 支付金额
     */
    private BigDecimal amount;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getFinishPayAt() {
        return finishPayAt;
    }

    public void setFinishPayAt(Integer finishPayAt) {
        this.finishPayAt = finishPayAt;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
