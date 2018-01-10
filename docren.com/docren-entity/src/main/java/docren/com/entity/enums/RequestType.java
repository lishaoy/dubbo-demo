package docren.com.entity.enums;

/**
 * Created by lishaoyong on 17/10/25.
 */
public enum RequestType {

    //1:top,2:bottom,3:sidebar

    /**
     * 对象
     */
    OBJECT(1),

    /**
     * list
     */
    LIST(2),
    ;

    private final int value;

    private RequestType(int value) {
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
    public static RequestType findByValue(int value) {
        switch (value) {
            case 1:
                return OBJECT;
            case 2:
                return LIST;
            default:
                return null;
        }
    }

}
