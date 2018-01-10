package aynl.net.entity.enums;

/**
 * Created by lishaoyong on 17/10/24.
 * 类目
 */
public enum Category {

    //1:top,2:bottom,3:sidebar

    /**
     * 医疗用品
     */
    medicalSupplies(1),

    /**
     * 文具
     */
    stationery(2),

    /**
     * 图书
     */
    books(3),

    /**
     * 畅学卡
     */
    learningCard(4),

    /**
     * 创意礼品
     */
    ideaGift(5),;

    private final int value;

    private Category(int value) {
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
    public static Category findByValue(int value) {
        switch (value) {
            case 1:
                return medicalSupplies;
            case 2:
                return stationery;
            case 3:
                return books;
            case 4:
                return learningCard;
            case 5:
                return ideaGift;
            default:
                return null;
        }
    }
}
