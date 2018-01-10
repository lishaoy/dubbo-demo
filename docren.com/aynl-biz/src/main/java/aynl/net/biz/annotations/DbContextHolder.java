package aynl.net.biz.annotations;

/**
 * Created by lishaoyong on 17/5/19.
 */
public class DbContextHolder {
    /**
     * 将数据源标示String装载到当前线程
     */
    private static final ThreadLocal<String> CONTEXT_HOLDER = new ThreadLocal();

    public static void setDbType(SystemTypeAnnotation.SystemType systemType, DataSourceSelect.MasterOrSlave mos) {
        StringBuilder sb = new StringBuilder(systemType.name()).append("_").append(mos.name());

        CONTEXT_HOLDER.set(sb.toString());
    }

    public static String getDbType() {
        return CONTEXT_HOLDER.get();
    }

    public static void clearDbType() {
        CONTEXT_HOLDER.remove();
    }
}
