<%--
  Created by IntelliJ IDEA.
  User: 38373
  Date: 2019/7/8
  Time: 16:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>个人信息</title>
    <link rel="stylesheet" href="${ pageContext.request.contextPath }/resources/bootstrap/css/bootstrap.css">

</head>
<body>
<form action="${ pageContext.request.contextPath }/user/improveUserInfo">
    姓名：<input type="text" name="name" value="${user.userName}">
    年龄：<input type="text" name="age" value="${user.userAge}">
    性别：<input type="text" name="sex" value="${user.userSex}">
    身份证号：<input type="text" name="idNumber" value="${user.userIdNumber}">
    联系电话：<input type="text" name="phone" value="${user.userPhone}">
    联系地址：<input type="text" name="address" value="${user.userAddress}">
    过往病史：<input type="text" name="medicalHistory" value="${user.medicalHistory}">

    <input type="submit" value="提交">
</form>

</body>
</html>
