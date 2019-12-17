package cn.edu.cqu.hospital.mapper;

import cn.edu.cqu.hospital.model.Prescription;
import cn.edu.cqu.hospital.model.PrescriptionKey;

public interface PrescriptionMapper {
    int deleteByPrimaryKey(PrescriptionKey key);

    int insert(Prescription record);

    int insertSelective(Prescription record);

    Prescription selectByPrimaryKey(PrescriptionKey key);

    int updateByPrimaryKeySelective(Prescription record);

    int updateByPrimaryKey(Prescription record);
}