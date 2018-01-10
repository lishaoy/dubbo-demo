package docren.com.entity.domain;

/**
 * 定义全局异常类 继承RuntimeException
 * 在使用spring管理事务时 service层只有抛出运行时异常事务才会回滚
 * @author lpf
 */
public class AppException extends RuntimeException{

    /**
     * 错误码
     */
    private int errorCode;

    /**
     * 错误描述
     */
    private String msg;

    public int getErrorCode() {
        return errorCode;
    }

    public AppException(){
        super();
    }

    public AppException(String message){
        super(message);
    }


    public AppException(Throwable cause){
        super(cause);
    }

    public AppException(String message, Throwable cause){
        super(message, cause);
    }

    public AppException(int errorCode, String message){
        super(message);
        this.errorCode = errorCode;
    }

    public AppException(int errorCode, Throwable cause){
        super(cause);
        this.errorCode = errorCode;
    }

    public AppException(int errorCode, String message, Throwable cause){
        super(message, cause);
        this.errorCode = errorCode;
    }

    @Override
    public String getMessage() {
        if (getCause() != null) {
            StringBuilder sb = new StringBuilder();
            if (super.getMessage() != null) {
                sb.append(super.getMessage()).append("; ");
            }
            sb.append("nested exception is ").append(getCause());
            return sb.toString();
        }else {
            return super.getMessage();
        }
    }

}