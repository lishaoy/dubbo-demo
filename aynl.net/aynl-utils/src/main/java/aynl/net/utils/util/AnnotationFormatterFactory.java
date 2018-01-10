package aynl.net.utils.util;

import org.springframework.format.Parser;
import org.springframework.format.Printer;

import java.lang.annotation.Annotation;
import java.util.Set;

/**
 * Created by lishaoyong on 17/6/15.
 */
public interface AnnotationFormatterFactory<A extends Annotation> {

    //通过此方法获取（也能理解为设置）哪些属性类可以被注解A标注
    Set<Class<?>> getFieldTypes();

    //获取特定属性的格式化输出器
    Printer<?> getPrinter(A annotation, Class<?> fieldType);

    //获取特定属性格式化输入（解析）器
    Parser<?> getParser(A annotation, Class<?> fieldType);
}