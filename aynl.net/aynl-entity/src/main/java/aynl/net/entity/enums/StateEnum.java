package aynl.net.entity.enums;

/**
 * Created by lishaoyong on 17/10/26.
 */
public enum StateEnum {

    //1:top,2:bottom,3:sidebar

    /**
     * 有效
     */
    VALID(1),

    /**
     * list
     */
    INVALID(0),
    ;

    private final int value;

    private StateEnum(int value) {
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
    public static StateEnum findByValue(int value) {
        switch (value) {
            case 1:
                return VALID;
            case 2:
                return INVALID;
            default:
                return null;
        }
    }
}
