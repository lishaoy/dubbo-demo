package aynl.net.entity.dto;

import java.io.Serializable;

/**
 * Created by lishaoyong on 17/10/25.
 */
public class CommoditySearchDTO implements Serializable {

    private static final long serialVersionUID = -5897027411556413415L;

    /**
     * 商品ID
     */
    private Integer commodityId;

    /**
     * 类目
     */
    private Integer categoryId;

    /**
     * 1:对象，2:List<对象>
     */
    private Integer type;

    /**
     * 状态 0:删除 1：未删除
     */
    private Integer state = 1;

    public CommoditySearchDTO() {

    }

    public CommoditySearchDTO(Integer commodityId, Integer categoryId, Integer type, Integer state) {
        this.commodityId = commodityId;
        this.categoryId = categoryId;
        this.type = type;
        this.state = state;
    }

    public Integer getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(Integer commodityId) {
        this.commodityId = commodityId;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}
