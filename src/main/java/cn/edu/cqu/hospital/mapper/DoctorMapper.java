package cn.edu.cqu.hospital.mapper;

import cn.edu.cqu.hospital.model.Doctor;

public interface DoctorMapper {
    int deleteByPrimaryKey(String doctorId);

    int insert(Doctor record);

    int insertSelective(Doctor record);

    Doctor selectByPrimaryKey(String doctorId);

    int updateByPrimaryKeySelective(Doctor record);

    int updateByPrimaryKey(Doctor record);
}