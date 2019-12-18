package cn.edu.cqu.hospital.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.cqu.hospital.mapper.AccountMapper;
import cn.edu.cqu.hospital.mapper.PatientMapper;
import cn.edu.cqu.hospital.mapper.RegistMapper;
import cn.edu.cqu.hospital.model.Account;
import cn.edu.cqu.hospital.model.Patient;
import cn.edu.cqu.hospital.model.Regist;
import cn.edu.cqu.hospital.service.PatienceService;

@Service
public class PatienceServiceImpl implements PatienceService{
	@Autowired
	private AccountMapper accountMapper;
	
	@Autowired
	private RegistMapper registMapper;
	
	@Autowired
	private PatientMapper patientMapper;

	@Override
	public boolean login(Account account) {
		Account actAccount = accountMapper.selectByPrimaryKey(account.getAccountId());
		if(null == actAccount)
		{
			System.out.println("null");
			return false;
		}
		if (account.getAccountPassword().equals(actAccount.getAccountPassword())) {
			return true;
		}
		System.out.println(actAccount.getAccountPassword());
		System.out.println(account.getAccountPassword());
		return false;
	}

	@Override
	public int subscribe(Account account,Regist regist) {
		regist.setAccountId(account.getAccountId());
		regist.setRegistState("已预约");registMapper.insert(regist);
		
		return 1;
		
	}

	@Override
	public int logon(Account account) {
		accountMapper.insert(account);
		return 1;
	}

	@Override
	public Patient findPatient(Account account) {
		return patientMapper.selectByPatientAccount(account.getAccountId());
	}
	
	
}
