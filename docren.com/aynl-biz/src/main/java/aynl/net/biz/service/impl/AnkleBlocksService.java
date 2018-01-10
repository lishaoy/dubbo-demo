package aynl.net.biz.service.impl;

import aynl.net.biz.dao.docren.AnkleBlocksDao;
import aynl.net.biz.service.IAnkleBlocksService;
import docren.com.entity.po.AnkleBlocks;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by lishaoyong on 17/12/13.
 */
@Service
public class AnkleBlocksService implements IAnkleBlocksService {

    @Resource
    AnkleBlocksDao ankleBlocksDao;

    @Override
    public List<AnkleBlocks> getAll() {
        return ankleBlocksDao.getAll();
    }
}
