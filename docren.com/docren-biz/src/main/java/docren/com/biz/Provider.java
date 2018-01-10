package docren.com.biz;

import docren.com.utils.util.timeUtil.UnixTimeUtils;
import org.apache.log4j.Logger;

import java.io.IOException;

/**
 * Created by lishaoyong on 17/12/13.
 */
public class Provider {
    private static Logger log = Logger.getLogger(Provider.class);
    private AppContext context;

    public Provider() {
        this.context = AppContext.INSTANCE;
    }

    public void start() throws IOException {
        log.info("dubbo服务启动");
        this.context.getContext().start();
    }

    public void close(int startTime) {
        log.info("dubbo服务关闭，服务本次运行时间为:" + (UnixTimeUtils.now() - startTime) + "秒");
        this.context.getContext().close();
    }
}
