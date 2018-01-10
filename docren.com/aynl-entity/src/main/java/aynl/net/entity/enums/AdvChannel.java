package aynl.net.entity.enums;

/**
 * Created by lishaoyong on 10/7/17.
 * 广告类型
 */
public enum AdvChannel {

    //广告类型:0:轮播图,1:单图

    /**
     * 轮播
     */
    CAROUSEL(0),

    /**
     * 图片
     */
    IMG(1),

    /**
     * 文字
     */
    TEXT(2),

    /**
     * 链接
     */
    LINK(3),;

    private final int value;

    private AdvChannel(int value) {
        this.value = value;
    }

    /**
     * Get the integer value of this enum value, as defined in the Thrift IDL.
     */
    public int getValue() {
        return value;
    }

    /**
     * Find a the enum type by its integer value, as defined in the Thrift IDL.
     *
     * @return null if the value is not found.
     */
    public static AdvChannel findByValue(int value) {
        switch (value) {
            case 0:
                return CAROUSEL;
            case 1:
                return IMG;
            case 2:
                return TEXT;
            case 3:
                return LINK;
            default:
                return null;
        }
    }

}
