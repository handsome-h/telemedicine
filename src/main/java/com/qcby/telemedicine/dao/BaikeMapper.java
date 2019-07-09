package com.qcby.telemedicine.dao;

import com.qcby.telemedicine.entity.Baike;

public interface BaikeMapper {
    int deleteByPrimaryKey(Long baikeId);

    int insert(Baike record);

    int insertSelective(Baike record);

    Baike selectByPrimaryKey(Long baikeId);

    int updateByPrimaryKeySelective(Baike record);

    int updateByPrimaryKey(Baike record);
}