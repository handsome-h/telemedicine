package com.qcby.telemedicine.dao;

import com.qcby.telemedicine.entity.Inquiry;

public interface InquiryMapper {
    int deleteByPrimaryKey(Long inquiryId);

    int insert(Inquiry record);

    int insertSelective(Inquiry record);

    Inquiry selectByPrimaryKey(Long inquiryId);

    int updateByPrimaryKeySelective(Inquiry record);

    int updateByPrimaryKey(Inquiry record);
}