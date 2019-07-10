<%--
  Created by IntelliJ IDEA.
  User: 38373
  Date: 2019/7/9
  Time: 22:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>医生名字（代填）</title>
<%--    <link rel="stylesheet" href="${ pageContext.request.contextPath }/resources/bootstrap/css/bootstrap.css">--%>
    <link rel="stylesheet" href="${ pageContext.request.contextPath }/resources/layui/css/layui.css">
    <script src="${ pageContext.request.contextPath }/resources/layui/layui.js"></script>
</head>
<body>
    <div class="panel panel-primary" style="width: 80%;margin: auto;">
        <div class="panel-heading">
            <h3 class="panel-title">医生信息</h3>
        </div>
        <div class="panel-body">
            <div class="row">
                <div style="width:100px;float: left;">医生头像</div>
                <div style="width:300px;float:left;">
                    <div>医生名字</div>${doctor.docName}
                    <div>科室</div>${doctor.department}
                    <div>擅长</div>${doctor.skills}
                    <div>医生简介：</div>${doctor.introduction}
                </div>
                <div style="float:right;">
                    <button class="layui-btn layui-btn-sm layui-btn-normal">预约挂号</button>
                    <br>
                    <button class="layui-btn layui-btn-sm layui-btn-normal">在线问诊</button>
                </div>
            </div>
        </div>
    </div>
</body>
</html>
