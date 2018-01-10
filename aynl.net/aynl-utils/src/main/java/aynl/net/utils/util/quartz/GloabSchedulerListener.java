package aynl.net.utils.util.quartz;


import org.apache.log4j.Logger;
import org.quartz.JobDetail;
import org.quartz.SchedulerException;
import org.quartz.listeners.SchedulerListenerSupport;

/**
 * Created by lisy
 */
public class GloabSchedulerListener extends SchedulerListenerSupport {
    Logger logger = Logger.getLogger(GloabSchedulerListener.class);


    @Override
    public void jobAdded(JobDetail jobDetail) {
        super.getLog().trace("jobAdded" + jobDetail.getKey());
    }

    @Override
    public void schedulerShutdown() {
        System.out.println("schedulerShutdown");
        super.schedulerShutdown();
    }

    @Override
    public void schedulerStarted() {
        System.out.println("schedulerStarted");
        super.schedulerStarted();
    }

    @Override
    public void schedulerError(String msg, SchedulerException exception) {
        System.out.println("schedulerError");
    }
}
