<%--
  Created by IntelliJ IDEA.
  User: 38373
  Date: 2019/7/8
  Time: 18:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>医生登录</title>
</head>
<body>
<form action="${ pageContext.request.contextPath }/doctor/login">
    <input type="text" name="account" placeholder="请输入您的手机号"/>
    <input type="password" name="pwd" placeholder="请输入您的密码"/>
    <input type="submit" value="登录">
</form>
</body>
</html>
