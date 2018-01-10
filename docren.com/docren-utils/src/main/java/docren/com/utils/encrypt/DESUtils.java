package docren.com.utils.encrypt;

import org.apache.log4j.Logger;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import java.io.IOException;
import java.net.URL;
import java.security.Key;
import java.security.SecureRandom;
import java.util.Enumeration;
import java.util.Properties;

/**
 * Created by lishaoyong on 17/6/28.
 */
public class DESUtils {
    private static Logger log = Logger.getLogger(DESUtils.class);
    private static Properties ENCRYPT_PROPERTIES;

    private static String KEY_PARAM = "-key";
    private static String HELP_PARAM = "-h";
    private static String ENCYPT_PARAM = "-e";
    private static String DECYPT_PARAM = "-d";

    public static void init() {
        try {

            Enumeration<URL> urls = DESUtils.class.getClassLoader().getResources("encrypt.properties");

            while(urls.hasMoreElements()){
                URL url = urls.nextElement();
                log.info("find encrypt properties from :"+url);
            }

            ENCRYPT_PROPERTIES = new Properties();
            urls = DESUtils.class.getClassLoader().getResources("encrypt.properties");

            if(urls.hasMoreElements()){
                URL url = urls.nextElement();
                System.out.println("will load encrypt properties from :"+url);
                ENCRYPT_PROPERTIES.load(url.openStream());

            }else{
                log.info("not find encrypt.properties in jar or classpath!!");
            }


        } catch (IOException e) {
            log.info("not find encrypt.properties in jar or classpath!!");
            e.printStackTrace();
        }
    }


    private static Key generateKey(String key) {
        try {
            KeyGenerator generator = KeyGenerator.getInstance("DES");
            SecureRandom secureRandom = SecureRandom.getInstance("SHA1PRNG");
            secureRandom.setSeed(key.getBytes("UTF-8"));
            generator.init(56,secureRandom);
            Key KEY_KEY = generator.generateKey();
            generator = null;
            return KEY_KEY;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 对字符串进行加密，返回BASE64的加密字符串
     *
     * @param str
     * @param key
     * @return
     */
    public static String getEncryptString(String str, String key) {
        //找不到秘钥就不做加密
        if(null == key || key.trim().isEmpty()){
            log.info("decrypt key is empty, return input string ");
            return str;
        }

        BASE64Encoder base64Encoder = new BASE64Encoder();

        try {
            byte[] strBytes = str.getBytes("UTF-8");
            Cipher cipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
            cipher.init(Cipher.ENCRYPT_MODE, generateKey(key));
            byte[] encryptStrBytes = cipher.doFinal(strBytes);
            String result = base64Encoder.encode(encryptStrBytes);
            return result.replaceAll("\r|\n","");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    public static String getEncryptString(String str) {
        return getEncryptString(str, ENCRYPT_PROPERTIES.getProperty("key"));
    }

    /**
     * 对BASE64加密字符串进行解密
     *
     * @param str
     * @param key
     * @return
     */
    public static String getDecryptString(String str, String key) {

        //找不到秘钥就不做解密
        if(null == key || key.trim().isEmpty()){
            log.info("decrypt key is empty, return input string ");
            return str;
        }
        BASE64Decoder base64Decoder = new BASE64Decoder();
        try {
            byte[] strBytes = base64Decoder.decodeBuffer(str);
            Cipher cipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
            cipher.init(Cipher.DECRYPT_MODE, generateKey(key));
            byte[] encryptStrBytes = cipher.doFinal(strBytes);
            return new String(encryptStrBytes, "UTF-8");

        } catch (Exception e) {

            throw new RuntimeException(String.format("error when decrypt string:%s ",str),e);
        }

    }

    public static String getDecryptString(String str) {
        return getDecryptString(str, ENCRYPT_PROPERTIES.getProperty("key"));
    }

    public static void main(String[] args) {
        String commands = "";
        String key = null;
        if (null != args && args.length > 0) {
            for (String tmpStr : args) {
                commands = commands.concat(" ").concat(tmpStr);
            }
        }

        if (commands.contains("-h")) {
            log.info("-h	get help info\n" + "-e	encrypt string\n" + "-d	decrypt string"
                    + "-key	encrypt key,empty use default key");
            return;
        }

        if (commands.contains(ENCYPT_PARAM) && commands.contains(DECYPT_PARAM)) {
            log.info("error ！！！ \"-e\" \"-d\" ");
            return;
        }

        if (!commands.contains(ENCYPT_PARAM) && !commands.contains(DECYPT_PARAM) && args.length == 1) {
            log.info(getEncryptString(args[0]));
            return;
        }

        for (int i = 0; i < args.length; ++i) {
            if (args[i].equals(KEY_PARAM)) {
                commands = commands.replace(KEY_PARAM, "");

                if ((++i) < args.length) {
                    key = args[i];
                    commands = commands.replace(key, "");
                }
                break;
            }
        }

        init();

        if (commands.contains(ENCYPT_PARAM)) {
            commands = commands.replace(ENCYPT_PARAM, "").trim();
            String encryptStr = null;
            System.out.println(commands);
            if(null != key && !key.trim().isEmpty()){
                encryptStr=getEncryptString(commands,key);
            }else{
                encryptStr=getEncryptString(commands);
            }

            log.info(String.format("encrypt %s result is :%s", commands, encryptStr));
            return;
        }

        if (commands.contains(DECYPT_PARAM)) {
            commands = commands.replace(DECYPT_PARAM, "").trim();
            String decryptStr = null;
            System.out.println(commands);

            if(null != key && !key.trim().isEmpty()){
                decryptStr = getDecryptString(commands,key);
            }else{
                decryptStr = getDecryptString(commands);
            }
            log.info(String.format("decrypt %s result is :%s",commands,decryptStr));
            return;
        }
    }
}
