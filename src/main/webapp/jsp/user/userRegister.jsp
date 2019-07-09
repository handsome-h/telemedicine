<%--
  Created by IntelliJ IDEA.
  User: 38373
  Date: 2019/7/8
  Time: 14:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户注册</title>
</head>
<body>
<form action="${ pageContext.request.contextPath }/user/register">
    <input type="text" name="account" placeholder="请输入您的手机号"/>
    <input type="password" name="pwd" placeholder="请设置您的密码"/>
    <input type="password" placeholder="请确认您的密码"/>
    <input type="submit" value="注册">
</form>
</body>
</html>
