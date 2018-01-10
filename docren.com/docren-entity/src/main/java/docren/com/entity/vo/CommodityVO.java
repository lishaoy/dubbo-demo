package docren.com.entity.vo;

import docren.com.entity.po.AnkleCommodity;
import docren.com.entity.po.AnkleCommodityPic;

import java.io.Serializable;
import java.util.List;

/**
 * Created by lishaoyong on 17/10/28.
 */
public class CommodityVO extends AnkleCommodity implements Serializable {

    private static final long serialVersionUID = 8041266902518464514L;

    /**
     * 附加商品
     */
    private List<SublevelCommodityVO> sublevelCommodityVOs;

    /**
     * 商品图片
     */
    private List<AnkleCommodityPic> ankleCommodityPics;


    public List<SublevelCommodityVO> getSublevelCommodityVOs() {
        return sublevelCommodityVOs;
    }

    public void setSublevelCommodityVOs(List<SublevelCommodityVO> sublevelCommodityVOs) {
        this.sublevelCommodityVOs = sublevelCommodityVOs;
    }

    public List<AnkleCommodityPic> getAnkleCommodityPics() {
        return ankleCommodityPics;
    }

    public void setAnkleCommodityPics(List<AnkleCommodityPic> ankleCommodityPics) {
        this.ankleCommodityPics = ankleCommodityPics;
    }
}
