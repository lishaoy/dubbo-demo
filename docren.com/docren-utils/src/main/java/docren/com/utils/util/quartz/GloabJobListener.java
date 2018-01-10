package docren.com.utils.util.quartz;

import org.apache.log4j.Logger;
import org.quartz.JobExecutionContext;
import org.quartz.listeners.JobListenerSupport;


/**
 * Created by lisy on 2015/12/24.
 */
public class GloabJobListener extends JobListenerSupport {

    Logger logger = Logger.getLogger(GloabJobListener.class);

    long start;

    @Override
    public String getName() {
        return "GloabJobListener";
    }

    @Override
    public void jobToBeExecuted(JobExecutionContext context) {
        System.out.println("jobToBeExecuted：" + context.getJobDetail().getKey());
        start = System.currentTimeMillis();
        logger.info(context.getJobDetail().getKey() + "-任务开始执行...");
    }

}
