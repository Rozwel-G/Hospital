package cn.edu.cqu.hospital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.edu.cqu.hospital.model.Prescription;
import cn.edu.cqu.hospital.service.MedicineService;

@Controller
public class MedicineController {
	@Autowired
	private MedicineService medicineService;
	
	@RequestMapping(value = "/medicine/check",method = RequestMethod.GET)
	public String get(Model model) {
		List<Prescription> prescriptions = medicineService.findUncheckList();
		model.addAttribute("prescriptions", prescriptions);
		
		return "dispensingmanage/dispensing/dispensing";
	}
}
