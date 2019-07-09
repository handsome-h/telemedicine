package com.qcby.telemedicine.service;

import com.qcby.telemedicine.entity.Doctor;

public interface DoctorService {

    /**
     * 医生登录
     * @param account
     * @param pwd
     * @return
     */
    Doctor login(String account, String pwd);

    /**
     * 完善医生信息
     * @param doctor
     * @return
     */
    boolean improve(Doctor doctor);
}
