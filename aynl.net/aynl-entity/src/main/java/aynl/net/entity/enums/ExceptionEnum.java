package aynl.net.entity.enums;


public enum ExceptionEnum {

    /**
     * 异常码定义
     * 1010010001
     * 第一组3位代表异常类型
     * [如:数据访问层异常101，业务逻辑层异常102，其他系统依赖系统异常103]
     * 第二组3位代表业务单元[如:定单001，库存002]
     * 第三组4位代表具体异常[]
     * 遵循约束逐一增1，进行定义
     *
     */

    /**
     * 数据库操作相关
     */
    DATABASE_ERROR(1010010000),

    /**
     * 正在操作
     */
    UNLOCK_ERROR(1010010001),

    //业务逻辑相关

    /**
     * 程序具体业务逻辑相关
     */
    SERVICE_ERROR(1020010000),

    /**
     * invokeToken认证失败
     */
    INVOKETOKEN_ERROR(1020010001),
    /**
     * 参数不符合要求
     */
    PARAMETER_ERROR(1020010002),
    /**
     * 访问时的uuid错误
     */
    UUID_ERROR(1020010003),

    /**
     * 调用方发起的时间不能为空
     */
    VISITIME_ERROR(1020010004),


    //第三方系统依赖相关
    /**
     * 调用三方系统相关
     */
    DEPENDENCY_ERROR(1030010000),

    ;

    private final int value;

    private ExceptionEnum(int value) {
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
     * @return null if the value is not found.
     */
    public static ExceptionEnum findByValue(int value) {
        switch (value) {
            case 1010010000:
                return DATABASE_ERROR;
            case 1030010000:
                return DEPENDENCY_ERROR;
            case 1020010000:
                return SERVICE_ERROR;
            case 1020010001:
                return INVOKETOKEN_ERROR;
            case 1020010002:
                return PARAMETER_ERROR;
            default:
                return null;
        }
    }
}
