package docren.com.utils.util.jsonUtil;


import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 提供JSON序列化和反序列化支持
 */
public class GsonUtils {

	private static Logger log = LoggerFactory.getLogger(JsonUtils.class);

	private static final Gson UPPER_CAMEL_CASE_JSON_SERIALIZER = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();
    private static final Gson IDENTITY = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.IDENTITY).create();

	private GsonUtils() {}

	/**
	 * 将Java POCO序列化为JSON
	 * @param obj 要序列化的对象
	 * @return 序列化结果JSON字符串
	 */
	public static String toJsonUpperCamel(Object obj) {
		return UPPER_CAMEL_CASE_JSON_SERIALIZER.toJson(obj);
	}

	/**
	 * 将Java POCO序列化为JSON
	 * @param obj 要序列化的对象
	 * @return 序列化结果JSON字符串
	 */
	public static String toJson(Object obj) {
		return IDENTITY.toJson(obj);
	}

	/**
	 * 反序列化json
	 * @param json json str
	 * @param clazz class
	 * @return 反序列化结果
	 */
	public static <T> T deSerialize(String json, Class<T> clazz) {
		try {
			return UPPER_CAMEL_CASE_JSON_SERIALIZER.fromJson(json, clazz);
		} catch (Exception e) {
			log.error(String.format("errors occured when desrialize json : (%s)", json) , e);
			return null;
		}
	}

	/**
	 * 反序列化JSON
	 * @param json json字符串
	 * @return 反序列化结果
	 */
	public static <T> T deSerialize(String json) {
		TypeToken<T> type = new TypeToken<T>(){};
		return UPPER_CAMEL_CASE_JSON_SERIALIZER.fromJson(json , type.getType());
	}

}
