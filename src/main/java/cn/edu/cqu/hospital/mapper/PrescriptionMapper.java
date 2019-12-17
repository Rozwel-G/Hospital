package cn.edu.cqu.hospital.mapper;

import java.util.List;

import cn.edu.cqu.hospital.model.Prescription;

public interface PrescriptionMapper {
    int deleteByPrimaryKey(String prescId);

    int insert(Prescription record);

    int insertSelective(Prescription record);

    Prescription selectByPrimaryKey(String prescId);

    int updateByPrimaryKeySelective(Prescription record);

    int updateByPrimaryKey(Prescription record);
    
    List<Prescription> selectUncheckList();
}