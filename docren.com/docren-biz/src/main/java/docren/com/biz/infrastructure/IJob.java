package docren.com.biz.infrastructure;

import org.quartz.*;

/**
 * 任务基础接口
 * Created by lisy
 */
public interface IJob extends Job {
    /**
     * 任务销毁，关闭并释放资源
     *
     * @throws Exception if this resource cannot be closed
     */
    void close() throws Exception;
}
