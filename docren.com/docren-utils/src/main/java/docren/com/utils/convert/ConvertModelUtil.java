package docren.com.utils.convert;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * dto 转换为model
 */
public class ConvertModelUtil {

    private static Logger log = LoggerFactory.getLogger(ConvertModelUtil.class);

    private ConvertModelUtil(){
    }

//    /**
//     * dto 转换为model
//     * @param sourceBean
//     * @param targetBean
//     * @return
//     */
//    public static SerachActive combineSySerachActive(GetGiftActiveParam sourceBean, SerachActive targetBean){
//        Class sourceBeanClass = sourceBean.getClass();
//        Class targetBeanClass = targetBean.getClass();
//
//        Field[] sourceFields = sourceBeanClass.getDeclaredFields();
//        Field[] targetFields = targetBeanClass.getDeclaredFields();
//        for(int i=0; i<sourceFields.length; i++){
//            Field sourceField = sourceFields[i];
//            Field targetField = targetFields[i];
//            sourceField.setAccessible(true);
//            targetField.setAccessible(true);
//            try {
//                if( !(sourceField.get(sourceBean) == null) &&  !"serialVersionUID".equals(sourceField.getName().toString())){
//                    targetField.set(targetBean,sourceField.get(sourceBean));
//                }
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//        return targetBean;
//    }


}
