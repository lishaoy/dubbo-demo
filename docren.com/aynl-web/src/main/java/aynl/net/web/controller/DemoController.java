package aynl.net.web.controller;

import aynl.net.comm.FacadeController;
import aynl.net.entity.domain.RequestMessage;
import aynl.net.entity.po.AnkleBlocks;
import aynl.net.web.service.IDemoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("demo")
public class DemoController implements FacadeController{


	@Resource
	IDemoService iDemoService;
	
	@ResponseBody
	@RequestMapping("say")
	public RequestMessage<List<AnkleBlocks>> sayHello() {
		return iDemoService.getAll();
	}

}
