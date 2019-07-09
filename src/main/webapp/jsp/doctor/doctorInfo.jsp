<%--
  Created by IntelliJ IDEA.
  User: 38373
  Date: 2019/7/8
  Time: 18:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>医生个人信息</title>
</head>
<body>

<form action="${ pageContext.request.contextPath }/doctor/improveDoctorInfo">
    姓名：<input type="text" name="name" value="${doctor.docName}">
    年龄：<input type="text" name="age" value="${doctor.docAge}">
    性别：<input type="text" name="sex" value="${doctor.docSex}">
    身份证号：<input type="text" name="idNumber" value="${doctor.docIdNumber}">
    所属科室：<input type="text" name="department" value="${doctor.department}">
    擅长：<input type="text" name="skills" value="${doctor.skills}">
    个人简介：<input type="text" name="introduction" value="${doctor.introduction}">

    <input type="submit" value="提交">
</form>
</body>
</html>
