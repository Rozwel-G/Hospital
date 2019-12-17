package cn.edu.cqu.hospital.service;

import cn.edu.cqu.hospital.model.Account;
import cn.edu.cqu.hospital.model.Regist;

public interface DoctorService {

	int check(Regist regist, Account doctorAccount);

}
