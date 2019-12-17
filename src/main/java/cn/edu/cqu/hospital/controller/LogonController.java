package cn.edu.cqu.hospital.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.edu.cqu.hospital.model.Account;
import cn.edu.cqu.hospital.service.PatienceService;

@Controller
public class LogonController {
	
	@Autowired
	private PatienceService patienceService;
	
	@RequestMapping(value = "/Logon",method = RequestMethod.GET)
	public String get() {
		return "logon";
	}
	
	@RequestMapping(value = "/Logon",method = RequestMethod.POST)
	public String post(Account account) {
		int state = patienceService.logon(account);
		if(state == 0)
		{
			
		}
		return "index";
		
	}
}
