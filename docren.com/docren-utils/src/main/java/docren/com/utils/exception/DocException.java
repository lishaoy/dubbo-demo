package docren.com.utils.exception;

/**
 * 定义全局异常类 继承RuntimeException
 * 在使用spring管理事务时 service层只有抛出运行时异常事务才会回滚
 * @author lpf
 */
public class DocException extends RuntimeException{

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

    public DocException(){
        super();
    }

    public DocException(String message){
        super(message);
    }


    public DocException(Throwable cause){
        super(cause);
    }

    public DocException(String message, Throwable cause){
        super(message, cause);
    }

    public DocException(int errorCode, String message){
        super(message);
        this.errorCode = errorCode;
    }

    public DocException(int errorCode, Throwable cause){
        super(cause);
        this.errorCode = errorCode;
    }

    public DocException(int errorCode, String message, Throwable cause){
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