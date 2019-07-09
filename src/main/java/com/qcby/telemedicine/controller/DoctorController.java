package com.qcby.telemedicine.controller;

import com.qcby.telemedicine.entity.Doctor;
import com.qcby.telemedicine.entity.User;
import com.qcby.telemedicine.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("doctor")
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    @RequestMapping("login")
    public String login(HttpServletRequest request){
        String account =  request.getParameter("account");
        String pwd = request.getParameter("pwd");
        Doctor doctor = doctorService.login(account, pwd);
        if(doctor != null){
            //增加session
            HttpSession session = request.getSession();
            //将user添加到session中
            session.setAttribute("doctor",doctor);
        }
        return "doctor/doctorIndex";
    }

    @RequestMapping("improveDoctorInfo")
    public String improveDoctorInfo(HttpServletRequest request){

        String name = request.getParameter("name");
        Integer age = Integer.parseInt(request.getParameter("age"));
        Boolean sex = Boolean.parseBoolean(request.getParameter("sex"));
        String idNumber = request.getParameter("idNumber");
        String department = request.getParameter("department");
        String skills = request.getParameter("skills");
        String introduction = request.getParameter("introduction");

        Doctor doctor = (Doctor) request.getSession().getAttribute("doctor");

        doctor.setDocName(name);
        doctor.setDocAge(age);
        doctor.setDocSex(sex);
        doctor.setDocIdNumber(idNumber);
        doctor.setDepartment(department);
        doctor.setSkills(skills);
        doctor.setIntroduction(introduction);
        doctorService.improve(doctor);

        return "doctor/doctorIndex";
    }

}
