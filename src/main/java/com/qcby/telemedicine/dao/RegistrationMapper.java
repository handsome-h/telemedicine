package com.qcby.telemedicine.dao;

import com.qcby.telemedicine.entity.Registration;

public interface RegistrationMapper {
    int deleteByPrimaryKey(Long regId);

    int insert(Registration record);

    int insertSelective(Registration record);

    Registration selectByPrimaryKey(Long regId);

    int updateByPrimaryKeySelective(Registration record);

    int updateByPrimaryKey(Registration record);
}