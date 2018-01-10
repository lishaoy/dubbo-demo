package aynl.net.web.service.impl;

import aynl.net.web.service.IDemoService;
import com.alibaba.dubbo.config.annotation.Reference;
import aynl.net.entity.domain.RequestMessage;
import aynl.net.entity.po.AnkleBlocks;
import aynl.net.facade.BizFacade;
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
