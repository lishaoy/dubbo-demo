package docren.com.entity.vo;

import java.io.Serializable;

/**
 * Created by lishaoyong on 10/7/17.
 */
public class AdvertisImgVO implements Serializable {
    /**
     * 广告位信息
     */
    private static final long serialVersionUID = 4584095414521067546L;

    /**
     * 广告图片地址,七牛云地址
     */
    private String imgUrl;

    /**
     * 跳转url地址
     */
    private String toUrl;

    /**
     * 图片高度
     */
    private double high;

    /**
     * 图片宽度
     */
    private double wide;

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getToUrl() {
        return toUrl;
    }

    public void setToUrl(String toUrl) {
        this.toUrl = toUrl;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public double getWide() {
        return wide;
    }

    public void setWide(double wide) {
        this.wide = wide;
    }
}
