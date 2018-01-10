package aynl.net.biz.aop;


import aynl.net.biz.annotations.DataSourceSelect;
import aynl.net.biz.annotations.DbContextHolder;
import aynl.net.biz.annotations.SystemTypeAnnotation;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


/**
 * Spring如果使用同一AOP实现，如@Aspect（且处于同一切入点PointCut），需要设置Order先后顺序；
 * 数越小越靠前执行，使用AOP建议执行顺序保持 @Before @Around @After
 */
@Component("dataSourceAspect")
@Aspect
@Order(3)
public class DataSourceAspect {

    private static Logger log = LoggerFactory.getLogger(DataSourceAspect.class);

    /**
     * 在 biz业务,所有的service都要重载 commService ，来实现动态数据源切换
     * @param point
     * @throws Exception
     */
    @Before(value = "execution(public * aynl.net.biz.service..*.*(..))")
    public void beforeBiz(JoinPoint point) throws Exception{


        Class<? extends Object> targetClass = point.getTarget().getClass();
        log.info("datasource will be set , before method  : {}.{}", targetClass.getName(), targetClass.getAnnotations());

        try {
            if (targetClass.isAnnotationPresent(DataSourceSelect.class)) {
                //获取方法前主从注解,及系统的注解
                DataSourceSelect data = targetClass.getAnnotation(DataSourceSelect.class);
                if (targetClass.isAnnotationPresent(SystemTypeAnnotation.class)){
                    SystemTypeAnnotation systemTypeAnnotation = targetClass.getAnnotation(SystemTypeAnnotation.class);
                    DbContextHolder.setDbType(systemTypeAnnotation.value(), data.value());

                    log.info("current datasource is [{}]", systemTypeAnnotation.value().name() + "-" + data.value().name());
                }else{
                    DbContextHolder.setDbType(SystemTypeAnnotation.SystemType.Medicen, data.value());
                }

            }

        } catch (Exception e) {
            log.error("no such method when set datasource", e);
            throw new Exception("动态切换数据库异常", e);
        }
    }

}
