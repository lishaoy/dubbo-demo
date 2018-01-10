package docren.com.biz.job;


import docren.com.biz.infrastructure.AbstractJob;
import docren.com.utils.util.timeUtil.UnixTimeUtils;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import java.util.List;

/**
 * Created by lishaoyong on 17/7/26.
 */
public class GiftChanceJob extends AbstractJob {


    public org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(GiftChanceJob.class);

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {

        try {
            logger.info("-------- 机会-支付完成自动发放  ----------- 开始时间:" + UnixTimeUtils.now());

            /*业务逻辑*/
            try {

            } catch (Exception e) {
                logger.info("-------- 机会-支付完成自动发放失败  ----------- 失败时间:" + UnixTimeUtils.now());
            }

            logger.info("-------- 机会-支付完成自动发放  ----------- 结束时间:" + UnixTimeUtils.now());

        } catch (Exception e) {
            JobExecutionException jobExecutionException = new JobExecutionException(e);
            throw jobExecutionException;
        }

    }

    /**
     * 将处理结果进行存储或其它处理
     *
     * @param rs 处理结果
     */
    @Override
    public void defaultTerminator(List<?> rs) {

    }

    /**
     * 销毁任务，释放资源
     *
     * @throws Exception if this resource cannot be closed
     */
    @Override
    public void close() throws Exception {

    }
}