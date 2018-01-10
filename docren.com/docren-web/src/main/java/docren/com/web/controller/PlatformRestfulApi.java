package docren.com.web.controller;

import docren.com.comm.FacadeController;
import docren.com.entity.domain.RequestMessage;
import docren.com.utils.RedixUtil;
import docren.com.web.entity.dto.Token;
import org.apache.log4j.Logger;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * 服务平台
 * lishaoyong
 */
@RequestMapping("/ankle")
@RestController()
public class PlatformRestfulApi implements FacadeController {

    static List<String> appKeys = new ArrayList<String>();

    static {
        appKeys.add("e1bfd762321e409cee4ac0b6e841963c");
    }

    /**
     * 根据用户appkey获取Token
     *
     * @param appKey
     * @return
     */
    @RequestMapping(value = "getToken", method = RequestMethod.GET)
    public ResponseEntity<RequestMessage<Token>> getToken(String appKey) {
        //如果appKey非法，返回失败
        if (!appKeys.contains(appKey)) {
            return ResponseEntity.ok(new RequestMessage<Token>(false, 1000, "非法请求", null));
        }
        String access_token = null;
        Token token = null;
        try {
            if (RedixUtil.exits(appKey)) {
                access_token = RedixUtil.getString(appKey);
            } else {
                access_token = UUID.randomUUID().toString();
                RedixUtil.setString(appKey, access_token, 7200);
            }
            token = new Token(access_token, 7200);
        } catch (Exception e) {
            Logger logger = Logger.getLogger(PlatformRestfulApi.class);
            logger.fatal("**************************************");
            logger.fatal(appKey + "获取认证Token失败！", e);
            logger.fatal("**************************************");
        }
        return ResponseEntity.ok(new RequestMessage<Token>(true, 0, null, token));
    }
}
