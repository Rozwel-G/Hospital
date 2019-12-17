package cn.edu.cqu.hospital.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;

import cn.edu.cqu.hospital.mapper.RegistMapper;
import cn.edu.cqu.hospital.model.Account;
import cn.edu.cqu.hospital.model.Regist;
import cn.edu.cqu.hospital.service.DoctorService;

public class DoctorServiceImpl implements DoctorService {
	@Autowired
	private RegistMapper registMapper;
	
	@Override
	public void check(Regist regist, Account doctorAccount) {
		regist.setDoctorId(doctorAccount.getAccountId());
		regist.setRegistState("检查中");
		
		registMapper.updateByPrimaryKey(regist);
		
	}

}
