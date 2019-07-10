package com.qcby.telemedicine.controller;

import com.qcby.telemedicine.entity.Registration;
import com.qcby.telemedicine.entity.User;
import com.qcby.telemedicine.service.UserService;
import com.qcby.telemedicine.utils.GenerateRegNum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author hanbin
 */
@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;



    /**
     * 用户登录
     * @param request
     * @return
     */
    @RequestMapping("login")
    public String login(HttpServletRequest request){

        String account =  request.getParameter("account");
        String pwd = request.getParameter("pwd");
        System.out.println(account);
        System.out.println(pwd);
        User user = userService.login(account, pwd);
        if(user != null){
            //增加session
            HttpSession session = request.getSession();
            //将user添加到session中
            session.setAttribute("user",user);
        }
        return "user/userIndex";
    }

    /**
     * 退出登录
     * @param request
     * @return
     */
    @RequestMapping("quit")
    public String quit(HttpServletRequest request){
        request.getSession().removeAttribute("user");
        return "redirect:../index.jsp";
    }
    /**
     * 用户注册
     * @param request
     * @return
     */
    @RequestMapping("register")
    public String register(HttpServletRequest request, Model model){

        String accout = request.getParameter("account");
        String pwd = request.getParameter("pwd");
        User user = new User();
        user.setUserAccount(accout);
        user.setUserPwd(pwd);

        if(userService.register(user) == false){
            model.addAttribute("flag", "0");
        }else {
            model.addAttribute("flag", "1");
        }
        return "user/userLogin";
    }

    /**
     * 完善用户信息
     * @param request
     * @return
     */
    @RequestMapping("improveUserInfo")
    public String improvePersonalInfo(HttpServletRequest request){

        //从前端获取表单值
        String name = request.getParameter("name");
        Integer age = Integer.parseInt(request.getParameter("age"));
        //接收性别
        Boolean sex = true;
        if(request.getParameter("sex").equals("1")){
            sex = false;
        }

        String idNumber = request.getParameter("idNumber");
        String phone = request.getParameter("phone");
        String address = request.getParameter("address");
        String medicalHistory = request.getParameter("medicalHistory");

        //从session获取user
        User user = (User)request.getSession().getAttribute("user");
        user.setUserName(name);
        user.setUserAge(age);
        user.setUserSex(sex);
        user.setUserIdNumber(idNumber);
        user.setUserPhone(phone);
        user.setUserAddress(address);
        user.setMedicalHistory(medicalHistory);

        //调用service层
        userService.improve(user);

        return "user/userIndex";
    }

    /**
     * 预约挂号
     * @param request
     * @return
     */
    @RequestMapping("registration")
    public String registration(HttpServletRequest request){

        //从前端获取表单值
        String name = request.getParameter("name");
        Integer age = Integer.parseInt(request.getParameter("age"));
        Boolean sex = Boolean.parseBoolean(request.getParameter("sex"));
        String idNumber = request.getParameter("idNumber");
        String phone = request.getParameter("phone");
        String address = request.getParameter("address");
        String disease = request.getParameter("disease");
        String department = request.getParameter("department");
        Boolean type = Boolean.parseBoolean(request.getParameter("type"));
        //将日期字符串转为Date类型
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date time = null;
            // 注意格式需要与上面一致，不然会出现异常
        try {
            time = sdf.parse(request.getParameter("time"));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        //放到registration实体中
        Registration registration = new Registration();
        registration.setPatientName(name);
        registration.setPatientAge(age);
        registration.setPatientSex(sex);
        registration.setPatientIdNumber(idNumber);
        registration.setPatientPhone(phone);
        registration.setPatientAddress(address);
        registration.setPatientDisease(disease);
        registration.setRegDepartment(department);
        registration.setType(type);
        registration.setRegTime(time);

        //设置当前挂号状态为待就诊
        registration.setState(0);

        //获取用户id
        User user = (User)request.getSession().getAttribute("user");
        if(user != null){
            long id = user.getUserId();
            registration.setUserId(id);
        }
        //获取当前时间
        java.util.Date date=new java.util.Date();
        java.sql.Date date1=new java.sql.Date(date.getTime());
        registration.setCurrentTime(date1);
        //设置挂号单号
        registration.setRegNum(GenerateRegNum.generate());

        System.out.println(registration);
        //调用service层
        userService.registration(registration);

        return null;
    }









}
