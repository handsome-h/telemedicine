<%--
  Created by IntelliJ IDEA.
  User: 38373
  Date: 2019/7/8
  Time: 16:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>个人信息</title>
    <link rel="stylesheet" href="${ pageContext.request.contextPath }/resources/bootstrap/css/bootstrap.css">
    <link rel="stylesheet" href="${ pageContext.request.contextPath }/resources/layui/css/layui.css">
    <script src="${ pageContext.request.contextPath }/resources/layui/layui.js"></script>
</head>
<body>
<%--<form action="${ pageContext.request.contextPath }/user/improveUserInfo">--%>
<%--    姓名：<input type="text" name="name" value="${user.userName}">--%>
<%--    年龄：<input type="text" name="age" value="${user.userAge}">--%>
<%--    性别：<input type="text" name="sex" value="${user.userSex}">--%>
<%--    身份证号：<input type="text" name="idNumber" value="${user.userIdNumber}">--%>
<%--    联系电话：<input type="text" name="phone" value="${user.userPhone}">--%>
<%--    联系地址：<input type="text" name="address" value="${user.userAddress}">--%>
<%--    过往病史：<input type="text" name="medicalHistory" value="${user.medicalHistory}">--%>

<%--    <input type="submit" value="提交">--%>
<%--</form>--%>

<form class="layui-form" action="${ pageContext.request.contextPath }/user/improveUserInfo">
    <div class="layui-form-item">
        <label class="layui-form-label">姓名</label>
        <div class="layui-input-block">
            <input type="text" name="name" required  lay-verify="required" value="${user.userName}" placeholder="请输入您的姓名" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">年龄</label>
        <div class="layui-input-block">
            <input type="text" name="age" required  lay-verify="required" value="${user.userAge}" placeholder="请输入您的年龄" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">性别</label>
        <div class="layui-input-block">

            <input type="radio" name="sex" value="0" title="男" <c:if test="${user.userSex == false}">checked</c:if>>
            <input type="radio" name="sex" value="1" title="女" <c:if test="${user.userSex == true}">checked</c:if>>
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">身份证号</label>
        <div class="layui-input-block">
            <input type="text" name="idNumber" required  lay-verify="required" value="${user.userIdNumber}" placeholder="请输入您的身份证号" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">联系电话</label>
        <div class="layui-input-block">
            <input type="text" name="phone" required  lay-verify="required" value="${user.userPhone}" placeholder="请输入您的联系电话" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">联系地址</label>
        <div class="layui-input-block">
            <input type="text" name="address" required  lay-verify="required" value="${user.userAddress}" placeholder="请输入您的联系地址" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item layui-form-text">
        <label class="layui-form-label">过往病史</label>
        <div class="layui-input-block">
            <textarea name="medicalHistory"  placeholder="请输入内容" class="layui-textarea">${user.medicalHistory}</textarea>
        </div>
    </div>
    <div class="layui-form-item">
        <div class="layui-input-block">
            <button class="layui-btn" lay-submit lay-filter="formDemo">立即提交</button>
            <button type="reset" class="layui-btn layui-btn-primary">重置</button>
        </div>
    </div>
</form>

<script>
    //Demo
    layui.use('form', function(){
        var form = layui.form;

        //监听提交
        form.on('submit(formDemo)', function(data){
            layer.msg(JSON.stringify(data.field));
        });
    });
</script>
</body>
</html>
