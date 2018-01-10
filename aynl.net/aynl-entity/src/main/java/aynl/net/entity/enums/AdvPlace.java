package aynl.net.entity.enums;

/**
 * Created by lishaoyong on 10/7/17.
 * 广告位置
 */
public enum  AdvPlace {

    //1:top,2:bottom,3:sidebar

    /**
     * 头部导航
     */
    TOP(1),

    /**
     * 底图
     */
    BOTTOM(2),

    /**
     * 侧边
     */
    SIDEBAR(3),;

    private final int value;

    private AdvPlace(int value) {
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
    public static AdvPlace findByValue(int value) {
        switch (value) {
            case 1:
                return TOP;
            case 2:
                return BOTTOM;
            case 3:
                return SIDEBAR;
            default:
                return null;
        }
    }
}
