package aynl.net.utils.util.jsonUtil;


import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 提供JSON序列化和反序列化支持
 */
public class JsonUtils {

	private static Logger log = LoggerFactory.getLogger(JsonUtils.class);




	private JsonUtils() {}

	/**
	 * 将Java POCO序列化为JSON
	 * @param obj 要序列化的对象
	 * @return 序列化结果JSON字符串
	 */
	public static String toJsonUpperCamel(Object obj) {
		return JSON.toJSON(obj).toString().toUpperCase();
	}

	/**
	 * 将Java POCO序列化为JSON
	 * @param obj 要序列化的对象
	 * @return 序列化结果JSON字符串
	 */
	public static String toJson(Object obj) {
		return JSON.toJSON(obj).toString();
	}

	/**
	 * 反序列化json
	 * @param json json str
	 * @param clazz class
	 * @return 反序列化结果
	 */
	public static <T> T deSerialize(String json, Class<T> clazz) {
		try {
			return JSON.parseObject(json, clazz);
		} catch (Exception e) {
			log.error(String.format("errors occured when desrialize json : (%s)", json) , e);
			return null;
		}
	}

}
