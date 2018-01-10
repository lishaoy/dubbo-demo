package aynl.net.biz.aop;

import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import docren.com.entity.domain.AppException;
import docren.com.utils.util.LogUtil;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


/**
 * 这是使用了gson的序列化转化
 */
@Component
@Aspect
@Order(2)
public class RequestLogAspect {

    private static org.slf4j.Logger log = LoggerFactory.getLogger(RequestLogAspect.class);

    private static final Gson gson = new GsonBuilder().setExclusionStrategies(new ExclusionStrategy() {
        @Override
        public boolean shouldSkipField(FieldAttributes fieldAttributes) {
            return fieldAttributes.getName().startsWith("__");
        }

        @Override
        public boolean shouldSkipClass(Class<?> aClass) {
            return false;
        }
    }).create();

    /**
     * 在服务接口执行前后计算，最后输出请求日志
     * @param pj
     * @return
     * @throws
     */
    @Around("aynl.net.biz.aop.PointCuts.serviceLog()")
    public Object logProcessInfo(ProceedingJoinPoint pj) throws Throwable {
        long start = System.currentTimeMillis();
        Object[] args = pj.getArgs();
        //获取类信息
        Class<? extends Object> targetClass = pj.getTarget().getClass();


        MethodSignature signature = (MethodSignature) pj.getSignature();
        try {
            Object ret = pj.proceed();
            //gson.toJson(ret)
            log(start, signature.getName(), targetClass.getName(), gson.toJson(args), true, null);
            return ret;

        } catch (AppException e){
            log(start, signature.getName(),targetClass.getName(), gson.toJson(args), false, null);
            throw e;
        } catch (Throwable e) {
            log(start, signature.getName(),targetClass.getName(), gson.toJson(args), false, null);
            throw e;
        }
    }

    private void log(long start, String interfaceName,String className, String paramInfo, boolean isNormal, String msg) {
        LogUtil.REQUEST_LOGGER.info(String.format("%s %s %s %s %s %s", interfaceName,className, System.currentTimeMillis() - start, isNormal ? "OK" : "ERROR", paramInfo, msg));
    }
}
