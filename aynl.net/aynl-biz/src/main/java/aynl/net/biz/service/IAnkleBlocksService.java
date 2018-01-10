package aynl.net.biz.service;

import aynl.net.comm.FacadeService;
import aynl.net.entity.po.AnkleBlocks;

import java.util.List;

public interface IAnkleBlocksService extends FacadeService {

    List<AnkleBlocks> getAll();

}
