package docren.com.web.aop;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


@Component()
@Aspect
public class PointCutsHttp {

    /**
     * 切面(在用户请求接口最外层使用，打印LOG)
     */
    @Pointcut("this(docren.com.comm.FacadeController)")
    public void httpLog() {
    }

}
