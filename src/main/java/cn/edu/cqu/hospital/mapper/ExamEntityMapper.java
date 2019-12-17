package cn.edu.cqu.hospital.mapper;

import cn.edu.cqu.hospital.model.ExamEntity;

public interface ExamEntityMapper {
    int deleteByPrimaryKey(String examEntityId);

    int insert(ExamEntity record);

    int insertSelective(ExamEntity record);

    ExamEntity selectByPrimaryKey(String examEntityId);

    int updateByPrimaryKeySelective(ExamEntity record);

    int updateByPrimaryKeyWithBLOBs(ExamEntity record);

    int updateByPrimaryKey(ExamEntity record);
}