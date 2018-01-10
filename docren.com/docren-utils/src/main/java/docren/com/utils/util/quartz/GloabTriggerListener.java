package docren.com.utils.util.quartz;


import docren.com.utils.util.timeUtil.UnixTimeUtils;
import org.apache.log4j.Logger;
import org.quartz.JobExecutionContext;
import org.quartz.Trigger;
import org.quartz.listeners.TriggerListenerSupport;

/**
 * Created by lisy
 */
public class GloabTriggerListener extends TriggerListenerSupport {
    Logger logger = Logger.getLogger(GloabTriggerListener.class);

    @Override
    public String getName() {
        return "JobTriggerListener";
    }

    @Override
    public void triggerFired(Trigger trigger, JobExecutionContext context) {
        System.out.println("任务正在被触发triggerFired：" + context.getJobDetail().getKey());

        if (context.getMergedJobDataMap().size() > 0) {
            String startTime = context.getMergedJobDataMap().getString("StartTime");
            String endTime = context.getMergedJobDataMap().getString("EndTime");
            if (startTime != null && endTime != null) {
                if (startTime.equals("$StartTime"))
                    context.getMergedJobDataMap().put("StartTime", UnixTimeUtils.now());
                if (endTime.equals("$EndTime"))
                    context.getMergedJobDataMap().put("EndTime", UnixTimeUtils.getToday());
            } else {
            }
        }

    }

    @Override
    public boolean vetoJobExecution(Trigger trigger, JobExecutionContext context) {
        System.out.println("任务触发vetoJobExecution ：" + context.getJobDetail().getKey());
        return false;
    }

    @Override
    public void triggerMisfired(Trigger trigger) {
        super.triggerMisfired(trigger);
    }

}
