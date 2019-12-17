package cn.edu.cqu.hospital.service;

import org.springframework.stereotype.Service;

import cn.edu.cqu.hospital.model.Account;
import cn.edu.cqu.hospital.model.Regist;

public interface PatienceService {
	boolean login(Account account);
	int subscribe(Account account,Regist regist);
	int logon(Account account);
}
