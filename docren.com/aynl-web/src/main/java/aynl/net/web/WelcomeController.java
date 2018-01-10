package aynl.net.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by lishaoyong on 17/5/23.
 */
@RestController()
public class WelcomeController {

    @RequestMapping("/")
    public String index(HttpServletRequest request){
        return "index";
    }
}
