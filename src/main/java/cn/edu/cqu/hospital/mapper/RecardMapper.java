package cn.edu.cqu.hospital.mapper;

import cn.edu.cqu.hospital.model.Recard;

public interface RecardMapper {
    int deleteByPrimaryKey(String recardId);

    int insert(Recard record);

    int insertSelective(Recard record);

    Recard selectByPrimaryKey(String recardId);

    int updateByPrimaryKeySelective(Recard record);

    int updateByPrimaryKeyWithBLOBs(Recard record);

    int updateByPrimaryKey(Recard record);
}