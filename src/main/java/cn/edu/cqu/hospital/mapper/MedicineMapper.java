package cn.edu.cqu.hospital.mapper;

import cn.edu.cqu.hospital.model.Medicine;

public interface MedicineMapper {
    int deleteByPrimaryKey(String medicineId);

    int insert(Medicine record);

    int insertSelective(Medicine record);

    Medicine selectByPrimaryKey(String medicineId);

    int updateByPrimaryKeySelective(Medicine record);

    int updateByPrimaryKey(Medicine record);
}