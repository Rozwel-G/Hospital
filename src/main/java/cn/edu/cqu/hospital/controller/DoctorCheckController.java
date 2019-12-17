package cn.edu.cqu.hospital.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.edu.cqu.hospital.model.Account;
import cn.edu.cqu.hospital.model.Regist;
import cn.edu.cqu.hospital.service.DoctorService;

@Controller
public class DoctorCheckController {
	
	@Autowired
	private DoctorService doctorService;
	
	@RequestMapping(value = "/Doctor/check",method = RequestMethod.GET)
	public String get() {
		return "checkregist";
	}
	
	@RequestMapping(value = "/Doctor/check",method = RequestMethod.POST)
	public String post(Regist regist,HttpServletRequest request) {
		HttpSession session = request.getSession();
		Account doctorAccount = (Account) session.getAttribute("account");
		doctorService.check(regist,doctorAccount);
		
		return "patiencestatus";
	}
}
