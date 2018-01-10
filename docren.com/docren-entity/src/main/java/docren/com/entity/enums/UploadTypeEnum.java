package docren.com.entity.enums;

/**
 * Created by lishaoyong on 17/11/7.
 */
public enum UploadTypeEnum {


    /**
     * 图片
     */
    IMG(1),

    /**
     * PDF
     */
    PDF(2),

    /**
     * Word
     */
    WORD(3),

    /**
     * Text
     */
    TEXT(4),;

    private final int value;

    private UploadTypeEnum(int value) {
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
    public static UploadTypeEnum findByValue(int value) {
        switch (value) {
            case 1:
                return IMG;
            case 2:
                return PDF;
            case 3:
                return WORD;
            case 4:
                return TEXT;
            default:
                return IMG;
        }
    }
}
