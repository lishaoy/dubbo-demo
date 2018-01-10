package docren.com.utils.encrypt;

import org.springframework.util.DefaultPropertiesPersister;

import java.io.*;
import java.util.Properties;

/**
 * Created by lishaoyong on 17/6/28.
 */
public class EncryptPropertiesPersist extends DefaultPropertiesPersister {

    private static String regEx = ".*jdbc.*\\.(url|username|usrname|password)";


    public void load(Properties props, InputStream is) throws IOException{

        Properties properties = new Properties();
        properties.load(is);

        for(Object key :properties.keySet()){
            String keyStr = key.toString();
            if ( keyStr.matches(regEx)){
			        /*这里通过解密算法，得到你的真实密码，然后写入到properties中*/
                String decryptStr = OnlineDESUtils.getDecryptString(properties.getProperty(keyStr));
                properties.setProperty(keyStr , decryptStr);
            }
        }

        OutputStream outputStream = null;
        try {
            outputStream = new ByteArrayOutputStream();
            properties.store(outputStream, "");
            is = outStream2InputStream(outputStream);
            super.load(props, is);
        }catch(IOException e) {
            throw e;
        }finally {
            outputStream.close();
        }
    }


    private InputStream outStream2InputStream(OutputStream out){
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        bos = (ByteArrayOutputStream) out ;
        ByteArrayInputStream swapStream = new ByteArrayInputStream(bos.toByteArray());
        return swapStream;
    }

}

