package docren.com.biz.annotations;

import java.lang.annotation.*;

/**
 * Created by lishaoyong on 17/5/19.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface SystemTypeAnnotation {

    public SystemType value() default SystemType.Medicen;

    public enum SystemType {

        /**
         * biz库
         */
        Medicen,

    }
}
