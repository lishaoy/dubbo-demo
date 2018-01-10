package aynl.net.entity.vo;


import aynl.net.entity.po.AnkleCommodity;

import java.io.Serializable;

/**
 * Created by lishaoyong on 17/10/28.
 */
public class SublevelCommodityVO extends AnkleCommodity implements Serializable {


    private static final long serialVersionUID = -5377867898995281327L;

    /**
     * 父级商品ID
     */
    private Integer parentCommodity;

    /**
     * 数量
     */
    private Integer quantity;

    public Integer getParentCommodity() {
        return parentCommodity;
    }

    public void setParentCommodity(Integer parentCommodity) {
        this.parentCommodity = parentCommodity;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
