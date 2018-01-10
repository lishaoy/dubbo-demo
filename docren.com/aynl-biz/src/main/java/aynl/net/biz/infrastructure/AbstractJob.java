package aynl.net.biz.infrastructure;

import org.apache.log4j.Logger;
import org.quartz.DisallowConcurrentExecution;
import org.quartz.JobExecutionException;
import org.quartz.PersistJobDataAfterExecution;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 任务抽象类
 * Created by lisy on 2015/12/21.
 */
@DisallowConcurrentExecution
@PersistJobDataAfterExecution
public abstract class AbstractJob implements IJob {

    public Logger logger = Logger.getLogger(AbstractJob.class);

    /**
     * 创建一个定长线程池，可控制线程最大并发数，超出的线程会在队列中等待。
     * 对核对结果异步输出到文件。
     */
    ExecutorService fixedThreadPool = Executors.newFixedThreadPool(10);


    /**
     * 任务执行方法
     *
     * @param jobExecutionContext ִ任务执行上下文
     */
    @Override
    public void execute(org.quartz.JobExecutionContext jobExecutionContext) throws JobExecutionException {

    }

    /**
     * 接收处理返回结果，进行异步存储
     *
     * @param rs 核对返回结果
     */
    public void defaultTerminator(List<?> rs) {

        if (rs != null && rs.size() > 0) {
            // rs.forEach(System.out::println);
            //异步存储
            fixedThreadPool.execute(new Runnable() {
                @Override
                public void run() {
                    rs.forEach((result) -> {
                        logger.info(result);
                    });
                }
            });
        }

    }

    /**
     * 任务销毁，关闭并释放资源
     *
     * @throws Exception if this resource cannot be closed
     */
    @Override
    public abstract void close() throws Exception;

}
