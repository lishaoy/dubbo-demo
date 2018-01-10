package aynl.net.biz;


import aynl.net.utils.util.timeUtil.UnixTimeUtils;
import org.apache.log4j.Logger;

import java.io.IOException;

/**
 * Created by lishaoyong on 17/12/13.
 */

public class Run {
    private static volatile boolean running = true;
    private static Logger log = Logger.getLogger(Run.class);

    public Run() {
    }

    public static void main(String[] args) throws IOException {
        log.info("启动Main入口");
        final int startTime = UnixTimeUtils.now();
        final Provider provider = new Provider();
        Runtime.getRuntime().addShutdownHook(new Thread() {
            public void run() {
                provider.close(startTime);
                Run.running = false;
                Class var1 = Run.class;
                synchronized (Run.class) {
                    Run.running = false;
                    Run.class.notify();
                }
            }
        });
        provider.start();
        Class var3 = Run.class;
        synchronized (Run.class) {
            while (running) {
                try {
                    Run.class.wait();
                } catch (Throwable var6) {
                    ;
                }
            }

        }
    }
}
