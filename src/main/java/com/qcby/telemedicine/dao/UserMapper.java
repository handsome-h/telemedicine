package com.qcby.telemedicine.dao;

import com.qcby.telemedicine.entity.User;
import org.apache.ibatis.annotations.Param;

/**
 * @author hanbin
 */
public interface UserMapper {
    int deleteByPrimaryKey(Long userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    //    自己添加
    /**
     * 根据账号密码查询是存在该用户
     * @param account
     * @param pwd
     * @return user
     */
    User selectByAccountAndPwd(@Param("account")String account, @Param("pwd")String pwd);
}