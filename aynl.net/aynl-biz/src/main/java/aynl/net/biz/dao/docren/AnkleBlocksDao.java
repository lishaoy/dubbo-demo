package aynl.net.biz.dao.docren;


import java.util.List;

import aynl.net.entity.po.AnkleBlocks;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;



@Repository
public interface AnkleBlocksDao {

	@Select("select * from ankle_blocks")
	List<AnkleBlocks> getAll();
	
}
