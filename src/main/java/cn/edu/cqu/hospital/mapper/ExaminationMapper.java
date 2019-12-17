package cn.edu.cqu.hospital.mapper;

import cn.edu.cqu.hospital.model.Examination;

public interface ExaminationMapper {
    int deleteByPrimaryKey(String examId);

    int insert(Examination record);

    int insertSelective(Examination record);

    Examination selectByPrimaryKey(String examId);

    int updateByPrimaryKeySelective(Examination record);

    int updateByPrimaryKeyWithBLOBs(Examination record);

    int updateByPrimaryKey(Examination record);
}