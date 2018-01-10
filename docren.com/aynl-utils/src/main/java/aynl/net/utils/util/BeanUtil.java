package aynl.net.utils.util;

import org.apache.commons.beanutils.ConvertUtils;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.*;

/**
 * Created by lishaoyong on 17/6/12.
 */
public class BeanUtil {

    /**
     * 利用反射实现对象之间相同属性复制
     *
     * @param source 要复制的
     * @param target 复制给
     */
    public static void copyProperties(Object source, Object target) throws Exception {

        copyPropertiesExclude(source, target, null);
    }

    /**
     * 复制对象属性
     *
     * @param from
     * @param to
     * @param excludsArray 排除属性列表
     * @throws Exception
     */
    public static void copyPropertiesExclude(Object from, Object to,
                                             String[] excludsArray) throws Exception {

        Map<String,Object> map = new HashMap<>();
        Field[] fromFields = from.getClass().getDeclaredFields();
        for(Field field :fromFields) {
            if (Modifier.isFinal(field.getModifiers())) continue;
            field.setAccessible(true);
            Object val = field.get(from);
            map.put(field.getName(),val);
        }

        Field[] toFields = to.getClass().getDeclaredFields();
        for(Field field :toFields) {
            if (Modifier.isFinal(field.getModifiers())) continue;
            field.setAccessible(true);
            Object val = map.get(field.getName());
            field.set(to, ConvertUtils.convert(val,field.getType()));
        }

    }

    /**
     * 对象属性值复制，仅复制指定名称的属性值
     *
     * @param from
     * @param to
     * @param includsArray
     * @throws Exception
     */
    public static void copyPropertiesInclude(Object from, Object to,
                                             String[] includsArray) throws Exception {

        List<String> includesList = null;

        if (includsArray != null && includsArray.length > 0) {

            includesList = Arrays.asList(includsArray);

        } else {

            return;
        }
        Method[] fromMethods = from.getClass().getDeclaredMethods();
        Method[] toMethods = to.getClass().getDeclaredMethods();
        Method fromMethod = null, toMethod = null;
        String fromMethodName = null, toMethodName = null;

        for (int i = 0; i < fromMethods.length; i++) {

            fromMethod = fromMethods[i];
            fromMethodName = fromMethod.getName();

            if (!fromMethodName.contains("get"))
                continue;

            // 排除列表检测
            String str = fromMethodName.substring(3);

            if (!includesList.contains(str.substring(0, 1).toLowerCase()
                    + str.substring(1))) {
                continue;
            }

            toMethodName = "set" + fromMethodName.substring(3);
            toMethod = findMethodByName(toMethods, toMethodName);

            if (toMethod == null)
                continue;

            Object value = fromMethod.invoke(from, new Object[0]);

            if (value == null)
                continue;

            // 集合类判空处理
            if (value instanceof Collection) {

                Collection<?> newValue = (Collection<?>) value;

                if (newValue.size() <= 0)
                    continue;
            }

            toMethod.invoke(to, new Object[]{value});
        }
    }

    /**
     * 从方法数组中获取指定名称的方法
     *
     * @param methods
     * @param name
     * @return
     */
    public static Method findMethodByName(Method[] methods, String name) {

        for (int j = 0; j < methods.length; j++) {

            if (methods[j].getName().equals(name)) {

                System.out.println(methods[j]);
                return methods[j];
            }

        }
        return null;
    }
}
