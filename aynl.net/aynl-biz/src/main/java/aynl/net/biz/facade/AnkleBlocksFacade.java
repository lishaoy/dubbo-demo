package aynl.net.biz.facade;

import aynl.net.biz.service.IAnkleBlocksService;
import aynl.net.entity.domain.RequestMessage;
import aynl.net.entity.po.AnkleBlocks;
import aynl.net.facade.BizFacade;
import com.alibaba.dubbo.config.annotation.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AnkleBlocksFacade implements BizFacade {

    @Resource
    IAnkleBlocksService iAnkleBlocksService;



    @Override
    public RequestMessage<List<AnkleBlocks>> getAll() {

        List<AnkleBlocks> ankleBlockses = iAnkleBlocksService.getAll();

        if (ankleBlockses != null && ankleBlockses.size() > 0){
            return new RequestMessage<List<AnkleBlocks>>(true,0,"成功",ankleBlockses);
        }else{
            return new RequestMessage<List<AnkleBlocks>>(false,-1,"失败",null);
        }
    }
}
