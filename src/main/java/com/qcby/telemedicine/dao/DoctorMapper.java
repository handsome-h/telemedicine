package com.qcby.telemedicine.dao;

import com.qcby.telemedicine.entity.Doctor;
import org.apache.ibatis.annotations.Param;

public interface DoctorMapper {
    int deleteByPrimaryKey(Long docId);

    int insert(Doctor record);

    int insertSelective(Doctor record);

    Doctor selectByPrimaryKey(Long docId);

    int updateByPrimaryKeySelective(Doctor record);

    int updateByPrimaryKey(Doctor record);

    //    自己添加
    /**
     * 根据账号密码查询是存在该用户
     * @param account
     * @param pwd
     * @return user
     */
    Doctor selectByAccountAndPwd(@Param("account")String account, @Param("pwd")String pwd);
}