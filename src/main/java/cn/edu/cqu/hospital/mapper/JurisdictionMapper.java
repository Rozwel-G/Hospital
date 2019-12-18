package cn.edu.cqu.hospital.mapper;

import cn.edu.cqu.hospital.model.Jurisdiction;

public interface JurisdictionMapper {
    int deleteByPrimaryKey(Integer num);

    int insert(Jurisdiction record);

    int insertSelective(Jurisdiction record);

    Jurisdiction selectByPrimaryKey(Integer num);

    int updateByPrimaryKeySelective(Jurisdiction record);

    int updateByPrimaryKey(Jurisdiction record);
}