package cn.edu.cqu.hospital.mapper;

import cn.edu.cqu.hospital.model.Regist;

public interface RegistMapper {
    int deleteByPrimaryKey(String registId);

    int insert(Regist record);

    int insertSelective(Regist record);

    Regist selectByPrimaryKey(String registId);

    int updateByPrimaryKeySelective(Regist record);

    int updateByPrimaryKey(Regist record);
}