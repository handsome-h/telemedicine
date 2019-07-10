package com.qcby.telemedicine.service;

import com.qcby.telemedicine.entity.Doctor;

import java.util.List;

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

    /**
     * 得到所有医生信息
     * @return
     */
    List<Doctor> findAllDoctors();

    /**
     * 得到某个医生的具体信息
     * @param docId
     * @return
     */
    Doctor findDoctorDetails(long docId);
}
