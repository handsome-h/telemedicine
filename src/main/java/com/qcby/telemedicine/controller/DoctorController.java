package com.qcby.telemedicine.controller;

import com.qcby.telemedicine.entity.Doctor;
import com.qcby.telemedicine.entity.User;
import com.qcby.telemedicine.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("doctor")
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    /**
     * 医生登录
     * @param request
     * @return
     */
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

    /**
     * 退出登录
     * @param request
     * @return
     */
    @RequestMapping("quit")
    public String quit(HttpServletRequest request){
        request.getSession().removeAttribute("doctor");
        return "redirect:../index.jsp";
    }


    /**
     * 完善医生信息
     * @param request
     * @return
     */
    @RequestMapping("improveDoctorInfo")
    public String improveDoctorInfo(HttpServletRequest request){

        //从前端获取表单值
        String name = request.getParameter("name");
        Integer age = Integer.parseInt(request.getParameter("age"));
        //接收性别
        Boolean sex = true;
        if(request.getParameter("sex").equals("1")){
            sex = false;
        }

        String idNumber = request.getParameter("idNumber");
        Integer department = Integer.parseInt(request.getParameter("department"));
        String skills = request.getParameter("skills");
        String introduction = request.getParameter("introduction");

        //从session获取doctor
        Doctor doctor = (Doctor) request.getSession().getAttribute("doctor");
        doctor.setDocName(name);
        doctor.setDocAge(age);
        doctor.setDocSex(sex);
        doctor.setDocIdNumber(idNumber);
        doctor.setDepartment(department);
        doctor.setSkills(skills);
        doctor.setIntroduction(introduction);

        //调用service层
        doctorService.improve(doctor);

        return "doctor/doctorIndex";
    }

    /**
     * 得到所有的医生信息
     * @param model
     * @return
     */
    @RequestMapping("findAllDoctors")
    public String findAllDoctors(Model model){
        List<Doctor> list = doctorService.findAllDoctors();
        model.addAttribute("docList",list);
        return "user/inquiry";
    }
    /**
     * 得到某医生的具体信息
     * @param request
     * @return
     */
    @RequestMapping("findDoctorDetails")
    public String findDoctorDetails(HttpServletRequest request, Model model){

        Long docId = Long.valueOf(request.getParameter("docId"));
        Doctor doctor = doctorService.findDoctorDetails(docId);
        model.addAttribute("doctor",doctor);
        return "doctor/doctorDetails";
    }

}
