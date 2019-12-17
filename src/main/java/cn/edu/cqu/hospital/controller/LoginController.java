package cn.edu.cqu.hospital.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.edu.cqu.hospital.model.Account;
import cn.edu.cqu.hospital.model.Patient;
import cn.edu.cqu.hospital.service.PatienceService;

@Controller
public class LoginController {
	@Autowired
	private PatienceService patienceService;
	
	@RequestMapping(value = "/Login",method = RequestMethod.GET)
	public String get() {
		return "user/index";
	}
	
	@RequestMapping(value = "/Login",method = RequestMethod.POST)
	public String post(Account account,Model model) {
		if(patienceService.login(account))
		{
			Patient patient = patienceService.findPatient(account);
			model.addAttribute("patient", patient);
			return "user/index";
		}
		
		return "/error";
	}

}
