package aynl.net.web.service;

import aynl.net.entity.domain.RequestMessage;
import aynl.net.entity.po.AnkleBlocks;

import java.util.List;

public interface IDemoService {

	RequestMessage<List<AnkleBlocks>> getAll();
	
}
