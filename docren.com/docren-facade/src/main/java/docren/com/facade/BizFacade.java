package docren.com.facade;

import docren.com.entity.domain.RequestMessage;
import docren.com.entity.po.AnkleBlocks;

import java.util.List;

/**
 * 业务协议层
 */
public interface BizFacade{

    RequestMessage<List<AnkleBlocks>> getAll();

}
