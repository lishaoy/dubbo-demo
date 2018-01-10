package docren.com.biz.service;

import docren.com.comm.FacadeService;
import docren.com.entity.po.AnkleBlocks;

import java.util.List;

public interface IAnkleBlocksService extends FacadeService {

    List<AnkleBlocks> getAll();

}
