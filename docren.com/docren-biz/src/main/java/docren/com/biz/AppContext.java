package docren.com.biz;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lishaoyong on 17/12/13.
 */
public enum AppContext {
    INSTANCE(new String[] {"classpath:spring-context.xml"});

    private final ClassPathXmlApplicationContext context;

    private AppContext(String[] springConfigFiles) {
        this.context = new ClassPathXmlApplicationContext(springConfigFiles);
    }

    public ClassPathXmlApplicationContext getContext() {
        return this.context;
    }
}
