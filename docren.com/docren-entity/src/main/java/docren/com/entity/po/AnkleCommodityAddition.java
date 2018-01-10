package docren.com.entity.po;

import java.io.Serializable;

public class AnkleCommodityAddition implements Serializable {
    private static final long serialVersionUID = -272013673756626024L;
    /**
     * 主键
     * @Author  lishaoyong
    **/
    private Integer id;

    /** 
     * 商品ID
     * @Author  lishaoyong
    **/
    private Integer commodityId;

    /** 
     * 附加商品ID
     * @Author  lishaoyong
    **/
    private Integer additionCommodityId;

    /** 
     * 是否删除0:删除1:未删除
     * @Author  lishaoyong
    **/
    private Integer state;

    /** 
     * 创建人
     * @Author  lishaoyong
    **/
    private Integer createId;

    /** 
     * 创建时间
     * @Author  lishaoyong
    **/
    private Integer createAt;

    /** 
     * 修改人
     * @Author  lishaoyong
    **/
    private Integer updateId;

    /** 
     * 修改时间
     * @Author  lishaoyong
    **/
    private Integer updateAt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(Integer commodityId) {
        this.commodityId = commodityId;
    }

    public Integer getAdditionCommodityId() {
        return additionCommodityId;
    }

    public void setAdditionCommodityId(Integer additionCommodityId) {
        this.additionCommodityId = additionCommodityId;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
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
}