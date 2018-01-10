package aynl.net.facade;

import aynl.net.entity.domain.RequestMessage;
import aynl.net.entity.po.AnkleBlocks;

import java.util.List;

/**
 * 业务协议层
 */
public interface BizFacade{

    RequestMessage<List<AnkleBlocks>> getAll();

}
