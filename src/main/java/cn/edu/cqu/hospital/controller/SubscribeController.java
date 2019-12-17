package cn.edu.cqu.hospital.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.edu.cqu.hospital.model.Account;
import cn.edu.cqu.hospital.model.Regist;
import cn.edu.cqu.hospital.service.PatienceService;

@Controller
public class SubscribeController {
	
	@Autowired
	private PatienceService patienceService;
	
	@RequestMapping(value = "/subscribe",method = RequestMethod.GET)
	public String GetMapping() {
		
		return "subscribe";
	}
	
	@RequestMapping(value = "/subscribe",method = RequestMethod.POST)
	public String post(Account account,Regist regist)
	{
		int state = patienceService.subscribe(account, regist);
		if(state == 0)
		{
			
		}
		
		return "index";
	}
}
