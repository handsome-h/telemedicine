package com.qcby.telemedicine.service.Impl;

import com.qcby.telemedicine.dao.RegistrationMapper;
import com.qcby.telemedicine.dao.UserMapper;
import com.qcby.telemedicine.entity.Registration;
import com.qcby.telemedicine.entity.User;
import com.qcby.telemedicine.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author hanbin
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private RegistrationMapper registrationMapper;

    /**
     * 用户登录
     * @param account
     * @param pwd
     * @return
     */
    @Override
    public User login(String account, String pwd) {
        User user = userMapper.selectByAccountAndPwd(account, pwd);
        return user;
    }

    /**
     * 用户注册
     * @param user
     * @return
     */
    @Override
    public boolean register(User user) {
        if(userMapper.insertSelective(user) < 0){
            return false;
        }
        return true;
    }

    /**
     * 完善用户信息
     * @param user
     * @return
     */
    @Override
    public boolean improve(User user) {
        if(userMapper.updateByPrimaryKeySelective(user) < 0){
            return false;
        }
        return true;
    }

    /**
     * 预约挂号
     * @param registration
     * @return
     */
    @Override
    public boolean registration(Registration registration) {
        registrationMapper.insertSelective(registration);
        return false;
    }
}
