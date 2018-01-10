package aynl.net.entity.dto;

import java.io.Serializable;

/**
 * Created by lishaoyong on 17/10/28.
 */
public class AdvertisDto implements Serializable {
    private static final long serialVersionUID = -8890684630882594310L;


    /**
     * 广告标题
     *
     * @Author lishaoyong
     **/
    private String title;

    /**
     * 广告开始时间
     *
     * @Author lishaoyong
     **/
    private Integer startAt;

    /**
     * 广告结束时间
     *
     * @Author lishaoyong
     **/
    private Integer endAt;

    /**
     * 详细信息
     *
     * @Author lishaoyong
     **/
    private String detail;

    /**
     * 排名
     *
     * @Author lishaoyong
     **/
    private Integer ranking;

    /**
     * 位置:1:top,2:bottom,3:sidebar
     *
     * @Author lishaoyong
     **/
    private Integer place;

    /**
     * 频道:1:主页2:商品页
     *
     * @Author lishaoyong
     **/
    private Integer channel;

    /**
     * 广告类型:0:轮播图,1:单图
     *
     * @Author lishaoyong
     **/
    private Integer advType;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getStartAt() {
        return startAt;
    }

    public void setStartAt(Integer startAt) {
        this.startAt = startAt;
    }

    public Integer getEndAt() {
        return endAt;
    }

    public void setEndAt(Integer endAt) {
        this.endAt = endAt;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Integer getRanking() {
        return ranking;
    }

    public void setRanking(Integer ranking) {
        this.ranking = ranking;
    }

    public Integer getPlace() {
        return place;
    }

    public void setPlace(Integer place) {
        this.place = place;
    }

    public Integer getChannel() {
        return channel;
    }

    public void setChannel(Integer channel) {
        this.channel = channel;
    }

    public Integer getAdvType() {
        return advType;
    }

    public void setAdvType(Integer advType) {
        this.advType = advType;
    }
}
