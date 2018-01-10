package docren.com.web.controller;

import docren.com.comm.FacadeController;
import docren.com.entity.domain.RequestMessage;
import docren.com.entity.po.AnkleBlocks;
import docren.com.web.service.IDemoService;
import org.springframework.beans.factory.annotation.Autowired;
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
