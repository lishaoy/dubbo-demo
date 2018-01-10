package aynl.net.utils.util;

import java.io.File;
import java.io.IOException;
import java.net.URL;

/**
 * Created by lisy on 2017/2/23.
 */
public class PathUtil {

    private PathUtil() {
    }

    /**
     * 获取 参数cls 所在目录的路径 string
     *
     * @param cls
     * @return
     */
    public static String getClassHomePath(Class<?> cls) {
        String path = cls.getProtectionDomain().getCodeSource().getLocation().getPath();
        path = path.replaceFirst("file:/", "");
        path = path.replaceAll("!/", "");
        if (path.lastIndexOf(File.separator) >= 0) {
            path = path.substring(0, path.lastIndexOf(File.separator));
        }
        if (path.substring(0, 1).equalsIgnoreCase("/")) {
            String osName = System.getProperty("os.name").toLowerCase();
            if (osName.indexOf("window") >= 0) {
                path = path.substring(1);
            }
        }
        return path;
    }

    /**
     * 查找配置文件路径
     * @param cls
     * @param propertieName encrypt.properties
     * @return
     * @throws IOException
     */
    public static String getResource(Class<?> cls,String propertieName){

        String s = "" ;
        URL fileURL = cls.getClass().getResource(propertieName);
        if (fileURL != null){
            s = fileURL.getFile();
        }
        return s;
    }

}
