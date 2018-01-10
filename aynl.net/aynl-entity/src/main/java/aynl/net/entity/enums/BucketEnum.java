package aynl.net.entity.enums;

/**
 * Created by lishaoyong on 17/11/7.
 */
public enum BucketEnum {

    //1:top,2:bottom,3:sidebar

    /**
     * 广告
     */
    adv("docren-advertising"),

    /**
     * 商品
     */
    commodity("docren-commodity"),

    /**
     * 头像
     */
    head("docren-head"),

    /**
     * 文库
     */
    library("docren-library"),

    default_bucket("ankle-public");
    ;

    private final String value;

    private BucketEnum(String value) {
        this.value = value;
    }

    /**
     * Get the integer value of this enum value, as defined in the Thrift IDL.
     */
    public String getValue() {
        return value;
    }

    /**
     * Find a the enum type by its integer value, as defined in the Thrift IDL.
     *
     * @return null if the value is not found.
     */
    public static BucketEnum findByValue(String value) {
        switch (value) {
            case "adv":
                return adv;
            case "commodity":
                return commodity;
            case "head":
                return head;
            case "library":
                return library;
            default:
                return default_bucket;
        }
    }
}
