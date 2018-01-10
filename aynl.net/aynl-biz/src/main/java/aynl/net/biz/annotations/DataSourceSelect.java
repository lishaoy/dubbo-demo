package aynl.net.biz.annotations;

import java.lang.annotation.*;

/**
 * Created by lishaoyong on 17/5/15.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DataSourceSelect {

    public MasterOrSlave value() default MasterOrSlave.MASTER;

    public enum MasterOrSlave {
        MASTER, SLAVE
    }
}