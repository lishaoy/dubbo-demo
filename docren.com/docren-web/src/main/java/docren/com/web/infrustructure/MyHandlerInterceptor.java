package docren.com.web.infrustructure;

import docren.com.utils.RedixUtil;
import org.apache.log4j.Logger;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

/**
 * 拦截HTTP请求
 * Created by lishaoyong
 */
public class MyHandlerInterceptor extends HandlerInterceptorAdapter {

    Logger logger = Logger.getLogger(MyHandlerInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        try {
            //PermissionMeta
            HandlerMethod method = (HandlerMethod) handler;
            System.out.println(method);
            String token = request.getHeader("Authentication");

            logger.info("+++++++++++++++++++++++++++");
            logger.info("Authentication=" + token);
            logger.info(method.getMethod().getName());
            logger.info("+++++++++++++++++++++++++++");
            logger.info("=====================" + request.getRequestURI());

            //获取TOKEN，不添加入权限
            if ("/ankle/getToken".equals(request.getRequestURI())) {
                return true;
            }

            if (token == null || "".equals(token)) {
                response.setContentType("application/json;charset=UTF-8");
                PrintWriter out = response.getWriter();
                out.write("{" +
                        "\"success\": false," +
                        "\"errorCode\": 1000," +
                        "\"errorMessage\":\"非法请求\"" +
                        "}");
                out.flush();
                out.close();
                return false;
            }

            String php = RedixUtil.getString("e1bfd762321e409cee4ac0b6e841963c");
            boolean exits = (token.equals(php));
            if (!exits) {
                response.setContentType("application/json;charset=UTF-8");
                PrintWriter out = response.getWriter();
                out.write("{" +
                        "\"success\": false," +
                        "\"errorCode\": 1000," +
                        "\"errorMessage\":\"非法请求\"" +
                        "}");
                out.flush();
                out.close();
                return false;
            }

            Map<String, String> map = new HashMap<String, String>();
            Enumeration headerNames = request.getHeaderNames();
            while (headerNames.hasMoreElements()) {
                String key = (String) headerNames.nextElement();
                String value = request.getHeader(key);
                map.put(key, value);

                logger.info(key + " :  " + value);

            }
            System.out.println("++++++++++++++++++++++++++++++++");

            logger.info(request.getRemoteAddr());//得到来访者IP
            logger.info(request.getRemoteHost());
            logger.info(request.getRequestURI());//得到请求URL地址
        } catch (Exception e) {
            logger.error("发生异常", e);//
            return false;
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request,
                           HttpServletResponse response, Object handler,
                           ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("afterCompletion");
    }

}
