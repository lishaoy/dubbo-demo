package aynl.net.utils.util;


import java.util.UUID;

/**
 * Created by lisy on 2016/7/3.
 */
public class StringUtils {

    private StringUtils() {
    }

    /**
     * 判断字符串是否为空
     *
     * @param str
     * @return return true when string is null or empty string, else false.
     */
    public static boolean isNullOrEmpty(String str) {
        return null == str || str.equals("");
    }

    /**
     * 获取32位UUID
     *
     * @return
     */
    public static String getUuid() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }

    public static Boolean isEmpty(String str) {
        return str == null  ? false : str.isEmpty() ? false : true;
    }
}
