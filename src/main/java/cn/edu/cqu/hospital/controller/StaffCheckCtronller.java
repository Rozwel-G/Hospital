package cn.edu.cqu.hospital.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.edu.cqu.hospital.model.Regist;
import cn.edu.cqu.hospital.service.StaffService;

@Controller
public class StaffCheckCtronller {
	@Autowired
	private StaffService staffService;
	
	@RequestMapping(value = "/staff/check",method = RequestMethod.GET)
	public String get() {
		
		return "checkpatience";
	}
	
	@RequestMapping(value = "/staff/check",method = RequestMethod.POST)
	public String post(Regist regist)
	{
		int state = staffService.check(regist);
		
		if(state == 0)
		{
			
		}
		
		return "complete";
	}
}
