package com.qcby.telemedicine.service;


import com.qcby.telemedicine.entity.Registration;
import com.qcby.telemedicine.entity.User;

/**
 * @author hanbin
 */
public interface UserService {

    /**
     * 用户登录
     * @param account
     * @param pwd
     * @return
     */
    User login(String account, String pwd);

    /**
     * 用户注册
     * @param user
     * @return
     */
    boolean register(User user);

    /**
     * 完善用户信息
     * @param user
     * @return
     */
    boolean improve(User user);

    /**
     * 预约挂号
     * @param registration
     * @return
     */
    boolean registration(Registration registration);
}
