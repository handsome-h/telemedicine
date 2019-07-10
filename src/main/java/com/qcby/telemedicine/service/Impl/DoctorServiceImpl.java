package com.qcby.telemedicine.service.Impl;

import com.qcby.telemedicine.dao.DoctorMapper;
import com.qcby.telemedicine.entity.Doctor;
import com.qcby.telemedicine.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    /**
     * 得到所有医生信息
     * @return
     */
    @Override
    public List<Doctor> findAllDoctors() {
        return doctorMapper.findAllDoctors();
    }

    /**
     * 得到医生的具体信息
     * @param docId
     * @return
     */
    @Override
    public Doctor findDoctorDetails(long docId) {
        return doctorMapper.selectByPrimaryKey(docId);
    }
}
