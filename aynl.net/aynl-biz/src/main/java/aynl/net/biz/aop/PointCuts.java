package aynl.net.biz.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.lang.annotation.Target;


@Component("pointCuts")
@Aspect
public class PointCuts {

    /**
     * 切面(在用户请求接口最外层使用，打印LOG)
     */
    @Pointcut("this(aynl.net.comm.FacadeService)")
    public void serviceLog() {
    }

}
