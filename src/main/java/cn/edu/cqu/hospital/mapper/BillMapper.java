package cn.edu.cqu.hospital.mapper;

import cn.edu.cqu.hospital.model.Bill;

public interface BillMapper {
    int deleteByPrimaryKey(String billId);

    int insert(Bill record);

    int insertSelective(Bill record);

    Bill selectByPrimaryKey(String billId);

    int updateByPrimaryKeySelective(Bill record);

    int updateByPrimaryKeyWithBLOBs(Bill record);

    int updateByPrimaryKey(Bill record);
}