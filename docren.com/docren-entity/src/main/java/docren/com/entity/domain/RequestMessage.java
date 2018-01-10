package docren.com.entity.domain;

import java.io.Serializable;

/**
 * 统一返回结果
 * by lishaoyong
 */
public class RequestMessage<T> implements Serializable {

    /**
     * 请求是否成功
     */
    private boolean isSuccess;
    /**
     * 错误码
     */
    private int errorCode;

    /**
     * 错误信息
     */
    private String errorMessage;
    /**
     * 返回数据
     */
    private T data;

    public RequestMessage() {
    }

    public RequestMessage(boolean isSuccess, int errorCode, String errorMessage, T data) {
        this.isSuccess = isSuccess;
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
        this.data = data;
    }

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    @Override
    public String toString() {
        return "Message{" +
                "isSuccess=" + isSuccess +
                ", errorCode='" + errorCode + '\'' +
                ", errorMessage='" + errorMessage + '\'' +
                ", data=" + data +
                '}';
    }
}
