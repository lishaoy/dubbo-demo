package docren.com.utils.encrypt;

import org.apache.commons.dbcp2.BasicDataSource;

/**
 * Created by lishaoyong on 17/6/28.
 */
public class EncryptDbcpBasicDataSource extends BasicDataSource {

    @Override
    public void setUrl(String url){
        String desUrl = OnlineDESUtils.getDecryptString(url);

        super.setUrl(desUrl);
    }

    @Override
    public void setUsername(String username){
        String desUsername = OnlineDESUtils.getDecryptString(username);

        super.setUsername(desUsername);
    }

    @Override
    public void setPassword(String password){
        String desPassword = OnlineDESUtils.getDecryptString(password);

        super.setPassword(desPassword);
    }

}
