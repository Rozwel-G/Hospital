package cn.edu.cqu.hospital.service;

import java.util.List;

import cn.edu.cqu.hospital.model.Prescription;

public interface MedicineService {
	List<Prescription> findUncheckList();
}
