package com.qcby.telemedicine.service.Impl;

import com.qcby.telemedicine.dao.DoctorMapper;
import com.qcby.telemedicine.entity.Doctor;
import com.qcby.telemedicine.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("doctorService")
public class DoctorServiceImpl implements DoctorService {

    @Autowired
    private DoctorMapper doctorMapper;

    @Override
    public Doctor login(String account, String pwd) {
        Doctor doctor = doctorMapper.selectByAccountAndPwd(account, pwd);
        return doctor;
    }

    @Override
    public boolean improve(Doctor doctor) {
        if(doctorMapper.updateByPrimaryKeySelective(doctor) < 0){
            return false;
        }
        return true;
    }
}
