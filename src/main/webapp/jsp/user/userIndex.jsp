<%--
  Created by IntelliJ IDEA.
  User: 38373
  Date: 2019/7/8
  Time: 14:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>远程医疗协助</title>
    <link rel="stylesheet" href="${ pageContext.request.contextPath }/resources/bootstrap/css/bootstrap.css">
</head>
<body>
<div>
    <c:choose>
        <c:when test="${user != null}">
            您好！${user.userAccount}
            <a href="${ pageContext.request.contextPath }/user/quit">退出登录</a>

            <a href="${ pageContext.request.contextPath }/jsp/user/userInfo.jsp">个人信息</a>
            <a href="">问诊信息</a>
            <a href="">挂号信息</a>
            <a href="">联系过的医生</a>
            <a href="">提出过的问题</a>
        </c:when>
        <c:otherwise>
            您好，请
            <a href="../user/userLogin.jsp">登录</a>
            |
            <a href="../user/userRegister.jsp">注册</a>
            <a href="${ pageContext.request.contextPath }/jsp/doctor/doctorLogin.jsp">我是医生</a>
        </c:otherwise>
    </c:choose>
</div>

<div>
    <input type="text" name="search"/>
    <button>搜索</button>
</div>

<div>
    <a href="">在线问诊</a>
    <a href="">预约挂号</a>
    <a href="">急速问诊</a>
    <a href="">医学百科</a>
</div>

<div style="border: 1px solid black;width: 100%;height: 400px;">
    轮播图
</div>


</body>
</html>
