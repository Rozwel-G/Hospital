package cn.edu.cqu.hospital.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.cqu.hospital.mapper.RegistMapper;
import cn.edu.cqu.hospital.model.Regist;
import cn.edu.cqu.hospital.service.StaffService;

@Service
public class StaffServiceImpl implements StaffService {
	@Autowired
	private RegistMapper registMapper;

	@Override
	public int check(Regist regist) {
		regist.setRegistState("已检查");
		registMapper.updateByPrimaryKey(regist);
		return 1;
	}

}
