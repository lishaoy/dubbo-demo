package aynl.net.entity.dto;

import java.io.Serializable;

/**
 * Created by lishaoyong on 17/10/26.
 */
public class AdvSearchDTO implements Serializable {

    private static final long serialVersionUID = 1352698986046282524L;
    /**
     * 频道:1:主页2:商品页
     * @Author  lishaoyong
     **/
    private Integer channel;


    /**
     * 位置:1:top,2:bottom,3:sidebar
     * @Author  lishaoyong
     **/
    private Integer place;

    /**
     * 广告状态
     */
    private Integer state;


    public Integer getChannel() {
        return channel;
    }

    public void setChannel(Integer channel) {
        this.channel = channel;
    }

    public Integer getPlace() {
        return place;
    }

    public void setPlace(Integer place) {
        this.place = place;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}
