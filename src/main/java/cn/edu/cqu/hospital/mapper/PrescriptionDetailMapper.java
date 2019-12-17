package cn.edu.cqu.hospital.mapper;

import cn.edu.cqu.hospital.model.PrescriptionDetail;
import cn.edu.cqu.hospital.model.PrescriptionDetailKey;

public interface PrescriptionDetailMapper {
    int deleteByPrimaryKey(PrescriptionDetailKey key);

    int insert(PrescriptionDetail record);

    int insertSelective(PrescriptionDetail record);

    PrescriptionDetail selectByPrimaryKey(PrescriptionDetailKey key);

    int updateByPrimaryKeySelective(PrescriptionDetail record);

    int updateByPrimaryKey(PrescriptionDetail record);
}