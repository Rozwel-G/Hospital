package cn.edu.cqu.hospital.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.cqu.hospital.mapper.PrescriptionMapper;
import cn.edu.cqu.hospital.model.Prescription;
import cn.edu.cqu.hospital.service.MedicineService;

@Service
public class MedicineServiceImpl implements MedicineService {
	@Autowired
	private PrescriptionMapper prescriptionMapper;

	@Override
	public List<Prescription> findUncheckList() {
		return prescriptionMapper.selectUncheckList();
	}
};
