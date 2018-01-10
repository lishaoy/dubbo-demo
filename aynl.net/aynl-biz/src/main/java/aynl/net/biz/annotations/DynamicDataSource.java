package aynl.net.biz.annotations;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * Created by lishaoyong on 17/5/19.
 */
public class DynamicDataSource extends AbstractRoutingDataSource {

    protected Object determineCurrentLookupKey() {
        return DbContextHolder.getDbType();
    }

}
