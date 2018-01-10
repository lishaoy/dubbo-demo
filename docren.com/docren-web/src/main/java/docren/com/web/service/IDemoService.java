package docren.com.web.service;

import docren.com.entity.domain.RequestMessage;
import docren.com.entity.po.AnkleBlocks;

import java.util.List;

public interface IDemoService {

	RequestMessage<List<AnkleBlocks>> getAll();
	
}
