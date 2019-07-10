<%--
  Created by IntelliJ IDEA.
  User: 38373
  Date: 2019/7/8
  Time: 18:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>医生个人信息</title>
    <link rel="stylesheet" href="${ pageContext.request.contextPath }/resources/bootstrap/css/bootstrap.css">
    <link rel="stylesheet" href="${ pageContext.request.contextPath }/resources/layui/css/layui.css">
    <script src="${ pageContext.request.contextPath }/resources/layui/layui.js"></script>
</head>
<body>

<%--<form action="${ pageContext.request.contextPath }/doctor/improveDoctorInfo">--%>
<%--    姓名：<input type="text" name="name" value="${doctor.docName}">--%>
<%--    年龄：<input type="text" name="age" value="${doctor.docAge}">--%>
<%--    性别：<input type="text" name="sex" value="${doctor.docSex}">--%>
<%--    身份证号：<input type="text" name="idNumber" value="${doctor.docIdNumber}">--%>
<%--    所属科室：<input type="text" name="department" value="${doctor.department}">--%>
<%--    擅长：<input type="text" name="skills" value="${doctor.skills}">--%>
<%--    个人简介：<input type="text" name="introduction" value="${doctor.introduction}">--%>

<%--    <input type="submit" value="提交">--%>
<%--</form>--%>

<form class="layui-form" action="${ pageContext.request.contextPath }/doctor/improveDoctorInfo" method="post">
    <div class="layui-form-item">
        <label class="layui-form-label">姓名</label>
        <div class="layui-input-block">
            <input type="text" name="name" required  lay-verify="required" value="${doctor.docName}" placeholder="请输入您的姓名" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">年龄</label>
        <div class="layui-input-block">
            <input type="text" name="age" required  lay-verify="required" value="${doctor.docAge}" placeholder="请输入您的年龄" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">性别</label>
        <div class="layui-input-block">

            <input type="radio" name="sex" value="0" title="男" <c:if test="${doctor.docSex == false}">checked</c:if>>
            <input type="radio" name="sex" value="1" title="女" <c:if test="${doctor.docSex == true}">checked</c:if>>
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">身份证号</label>
        <div class="layui-input-block">
            <input type="text" name="idNumber" required  lay-verify="required" value="${doctor.docIdNumber}" placeholder="请输入您的身份证号" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">所属科室</label>
        <div class="layui-input-block">
            <select name="department" lay-verify="required">
                <option value=""></option>
                <option value="0" <c:if test="${doctor.department == 0}">selected</c:if>>内科</option>
                <option value="1" <c:if test="${doctor.department == 1}">selected</c:if>>外科</option>
                <option value="2" <c:if test="${doctor.department == 2}">selected</c:if>>妇产科</option>
                <option value="3" <c:if test="${doctor.department == 3}">selected</c:if>>儿科</option>
                <option value="4" <c:if test="${doctor.department == 4}">selected</c:if>>皮肤科</option>
                <option value="5" <c:if test="${doctor.department == 5}">selected</c:if>>耳鼻咽喉科</option>
                <option value="6" <c:if test="${doctor.department == 6}">selected</c:if>>眼科</option>
                <option value="7" <c:if test="${doctor.department == 7}">selected</c:if>>口腔科</option>
                <option value="8" <c:if test="${doctor.department == 8}">selected</c:if>>精神科</option>
                <option value="9" <c:if test="${doctor.department == 9}">selected</c:if>>中医科</option>
                <option value="10" <c:if test="${doctor.department == 10}">selected</c:if>>中西医结合科</option>
                <option value="11" <c:if test="${doctor.department == 11}">selected</c:if>>肿瘤科</option>
                <option value="12" <c:if test="${doctor.department == 12}">selected</c:if>>全科医疗科</option>
                <option value="13" <c:if test="${doctor.department == 13}">selected</c:if>>急诊医学科</option>
                <option value="14" <c:if test="${doctor.department == 14}">selected</c:if>>医学检验科</option>
                <option value="15" <c:if test="${doctor.department == 15}">selected</c:if>>医学影像科</option>
            </select>
        </div>
    </div>
    <div class="layui-form-item layui-form-text">
        <label class="layui-form-label">擅长</label>
        <div class="layui-input-block">
            <textarea name="skills"  placeholder="请输入您的擅长方向" class="layui-textarea">${doctor.skills}</textarea>
        </div>
    </div>
    <div class="layui-form-item layui-form-text">
        <label class="layui-form-label">个人简介</label>
        <div class="layui-input-block">
            <textarea name="introduction"  placeholder="请输入您的个人简介" class="layui-textarea">${doctor.introduction}</textarea>
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
