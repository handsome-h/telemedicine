<%--
  Created by IntelliJ IDEA.
  User: 38373
  Date: 2019/7/9
  Time: 22:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>在线问诊</title>
    <link rel="stylesheet" href="${ pageContext.request.contextPath }/resources/bootstrap/css/bootstrap.css">
    <link rel="stylesheet" href="${ pageContext.request.contextPath }/resources/layui/css/layui.css">
    <script src="${ pageContext.request.contextPath }/resources/layui/layui.js"></script>
</head>
<body>
<c:forEach items="${docList}" var="doctor">
    <div>
        <div>医生名字</div>${doctor.docName}
        <div>科室</div>${doctor.department}
        <div>擅长</div>${doctor.skills}
        <div>
            <button class="layui-btn layui-btn-sm layui-btn-normal">图文问诊</button>
            <br>
            <button class="layui-btn layui-btn-sm layui-btn-normal">视话问诊</button>
        </div>
    </div>

</c:forEach>
<a href="${ pageContext.request.contextPath }/doctor/findDoctorDetails?docId=1">医生</a>
</body>
</html>
