package docren.com.web.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import docren.com.entity.domain.RequestMessage;
import docren.com.entity.po.AnkleBlocks;
import docren.com.facade.BizFacade;
import docren.com.web.service.IDemoService;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class DemoService implements IDemoService {


    @Reference
    BizFacade bizFacade;

    @Override
    public RequestMessage<List<AnkleBlocks>> getAll() {
        return bizFacade.getAll();
    }
}
