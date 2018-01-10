package docren.com.biz.dao.docren;


import java.util.List;

import docren.com.entity.po.AnkleBlocks;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;



@Repository
public interface AnkleBlocksDao {

	@Select("select * from ankle_blocks")
	List<AnkleBlocks> getAll();
	
}
