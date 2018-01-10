package aynl.net.utils.util.jsonUtil;

import net.sf.json.JsonConfig;
import net.sf.json.processors.JsonValueProcessor;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by lishaoyong on 17/6/13.
 */
public class JsonDateValueProcessor implements JsonValueProcessor {




    private String format = "yyyy-MM-dd HH:mm:ss";

    public JsonDateValueProcessor() {
        super();
    }

    /**
     * 自己需要的格式
      */
    public JsonDateValueProcessor(String format) {
        super();
        this.format = format;
    }

    @Override
    public Object processArrayValue(Object value, JsonConfig paramJsonConfig) {
        return process(value);
    }

    @Override
    public Object processObjectValue(String key, Object value, JsonConfig paramJsonConfig) {
        return process(value);
    }

    private Object process(Object value) {
        if (value instanceof Date) {
            SimpleDateFormat sdf = new SimpleDateFormat(format, Locale.CHINA);
            return sdf.format(value);
        }
        return value == null ? "" : value.toString();
    }


    //使用方法
//    JsonConfig jsonConfig = new JsonConfig();
//    jsonConfig.registerJsonValueProcessor(Date.class, new JsonDateValueProcessor());
//    Object object = new Object();
//    JSONObject jsonObject = JSONObject.fromObject(object,jsonConfig);
}
