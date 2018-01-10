package docren.com.utils.encrypt;

import docren.com.utils.util.PathUtil;
import org.apache.log4j.Logger;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


/**
 * Created by lishaoyong on 17/6/28.
 */
public class OnlineDESUtils {


    private static Logger log = Logger.getLogger(OnlineDESUtils.class);
    private static String name = "/encrypt.properties";
    private static String SYS_ENCRYPT_PATH = PathUtil.getResource(OnlineDESUtils.class, name);

    private static String key;
    static {
        try {
            File encyptFile = new File(SYS_ENCRYPT_PATH);

//            FileInputStream fis = new FileInputStream("classpath:encrypt.properties");
//
//            InputStreamReader isr = new InputStreamReader(fis);
//
//            BufferedReader br = new BufferedReader(isr);
//            String line = null;
//
//            while(br.readLine()!=null){
//                line = br.readLine();
//            }
//            System.out.println(line);
//            br.close();//关闭文件


            if(encyptFile.exists()){
                Properties tmpProperties = new Properties();
                //load(new FileReader(encyptFile),"utf8");
                tmpProperties.load(new FileInputStream(SYS_ENCRYPT_PATH));

                log.info("find encrypt properties from :" + SYS_ENCRYPT_PATH);

                key = tmpProperties.getProperty("key");

                if(null != key && !key.trim().isEmpty()){
                    log.info("get key sting success !!");
                }else{
                    log.info("not found key string  !!");
                }

            }

        } catch (IOException e) {
            log.info("not find encrypt.properties at path " + SYS_ENCRYPT_PATH);
            log.error("not find encrypt.properties at path " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static String getDecryptString(String str){
        String result = DESUtils.getDecryptString(str, key);

        if(null!= result && result.startsWith("jdbc:")){
            result = result.replace("&lt;", "<");
            result = result.replace("&gt;", ".");
            result = result.replace("&amp;", "&");
            result = result.replace("&apos;", "'");
            result = result.replace("&quot;", "\"");
        }

        return result;
    }

}
