package aynl.net.utils.util;

import org.apache.log4j.Logger;

/**
 * Created by lishaoyong on 17/5/3.
 */
public interface LogUtil {

    /**
     * 接口统一请求日志rpc
     */
    public final static Logger REQUEST_LOGGER = Logger.getLogger("rpcRequestLogger");


    /**
     * 接口统一请求日志rpc
     */
    public final static Logger HTTPREQUEST_LOGGER = Logger.getLogger("httpRequestLogger");

    public final static Logger SQL_LOGGER = Logger.getLogger("rpcSqlLog");

}
