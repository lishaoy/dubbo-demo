package docren.com.biz.dao.docren;


import docren.com.entity.po.AnkleUploadLog;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * Created by lishaoyong on 17/10/30.
 */
@Repository
public interface AnkleUploadLogDao {

    /**
     * 插入上传日志
     * @param record
     * @return
     */
    @Insert(value = "<script>insert into ankle_upload_log <trim prefix='(' suffix=')' suffixOverrides=','><if test='id != null'> id,</if><if test='fileName != null'>file_name,</if><if test='uploadName != null'> upload_name, </if> <if test='bucketName != null'> bucket_name,</if> <if test='createAt != null'>create_at,</if></trim><trim prefix='values (' suffix=')' suffixOverrides=','><if test='id != null'> #{id}, </if><if test='fileName != null'>#{fileName},</if><if test='uploadName != null'>#{uploadName},</if><if test='bucketName != null'>#{bucketName},</if><if test='createAt != null'>#{createAt},</if></trim></script>")
    int insertUploadLog(AnkleUploadLog record);

    /**
     * 判断文件是否上传过
     * @param filename
     * @return
     */
    @Select(value = "select * from ankle_upload_log where file_name = #{filename} order by create_at desc limit 1")
    AnkleUploadLog getUploadLog(String filename);


}
