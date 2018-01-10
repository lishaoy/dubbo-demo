package docren.com.utils.encrypt;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;

/**
 * Created by lishaoyong on 17/6/29.
 */
public class EncryptPropertyPlaceholderConfigurer extends PropertyPlaceholderConfigurer {

    private static Logger log = Logger.getLogger(EncryptPropertyPlaceholderConfigurer.class);

    //解密列表
    private String[] encryptPropNames = {
            "jdbc.rg.read.url",
            "jdbc.rg.read.username",
            "jdbc.rg.read.password",
            "jdbc.rg.write.url",
            "jdbc.rg.write.username",
            "jdbc.rg.write.password",
            "jdbc.activity.read.url",
            "jdbc.activity.read.username",
            "jdbc.activity.read.password",
            "jdbc.activity.write.url",
            "jdbc.activity.write.username",
            "jdbc.activity.write.password"
    };

    @Override
    protected String convertProperty(String propertyName, String propertyValue)
    {

        //如果在加密属性名单中发现该属性
        if (isEncryptProp(propertyName))
        {
            String decryptValue = OnlineDESUtils.getDecryptString(propertyValue);
            log.info("信息:" + decryptValue);
            return decryptValue;
        }else {
            return propertyValue;
        }

    }

    private boolean isEncryptProp(String propertyName)
    {
        for (String encryptName : encryptPropNames)
        {
            if (encryptName.equals(propertyName))
            {
                return true;
            }
        }
        return false;
    }
}