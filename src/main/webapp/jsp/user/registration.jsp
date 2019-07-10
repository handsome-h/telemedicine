<%--
  Created by IntelliJ IDEA.
  User: 38373
  Date: 2019/7/8
  Time: 21:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>预约挂号</title>
    <link rel="stylesheet" href="${ pageContext.request.contextPath }/resources/bootstrap/css/bootstrap.css">
    <link rel="stylesheet" href="${ pageContext.request.contextPath }/resources/layui/css/layui.css">
    <script src="${ pageContext.request.contextPath }/resources/layui/layui.js"></script>
</head>
<body>

<%--<form action="${ pageContext.request.contextPath }/user/registration" method="post">--%>
<%--    患者姓名：<input type="text" name="name">--%>
<%--    患者年龄：<input type="text" name="age">--%>
<%--    患者性别：<input type="text" name="sex">--%>
<%--    患者身份证号：<input type="text" name="idNumber">--%>
<%--    患者联系电话；<input type="text" name="phone">--%>
<%--    患者联系地址：<input type="text" name="address">--%>
<%--    患者病症：<input type="text" name="disease">--%>
<%--    <br>--%>
<%--    挂号科室：<input type="text" name="department">--%>
<%--    挂号类型：<input type="text" name="type">--%>
<%--    挂号时间：<input type="text" name="time">--%>

<%--    <input type="submit" value="提交">--%>
<%--</form>--%>

<form class="layui-form" action="${ pageContext.request.contextPath }/user/registration" method="post">
    <div class="layui-form-item">
        <label class="layui-form-label">患者姓名</label>
        <div class="layui-input-block">
            <input type="text" name="name" required  lay-verify="required" value="${user.userName}" placeholder="请输入您的姓名" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">患者年龄</label>
        <div class="layui-input-block">
            <input type="text" name="age" required  lay-verify="required" value="${user.userAge}" placeholder="请输入您的年龄" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">患者性别</label>
        <div class="layui-input-block">
            <input type="radio" name="sex" value="0" title="男" <c:if test="${user.userSex == false}">checked</c:if>>
            <input type="radio" name="sex" value="1" title="女" <c:if test="${user.userSex == true}">checked</c:if>>
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">患者身份证号</label>
        <div class="layui-input-block">
            <input type="text" name="idNumber" required  lay-verify="required" value="${user.userIdNumber}" placeholder="请输入您的身份证号" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">患者联系电话</label>
        <div class="layui-input-block">
            <input type="text" name="phone" required  lay-verify="required" value="${user.userPhone}" placeholder="请输入您的联系电话" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">患者联系地址</label>
        <div class="layui-input-block">
            <input type="text" name="address" required  lay-verify="required" value="${user.userAddress}" placeholder="请输入您的联系地址" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item layui-form-text">
        <label class="layui-form-label">患者病症</label>
        <div class="layui-input-block">
            <textarea name="disease"  placeholder="请输入内容" class="layui-textarea">${user.medicalHistory}</textarea>
        </div>
    </div>

    <div class="layui-form-item">
        <label class="layui-form-label">挂号科室</label>
        <div class="layui-input-block">
            <select name="department" lay-verify="required">
                <option value=""></option>
                <option value="0">内科</option>
                <option value="1">外科</option>
                <option value="2">妇产科</option>
                <option value="3">儿科</option>
                <option value="4">皮肤科</option>
                <option value="5">耳鼻咽喉科</option>
                <option value="6">眼科</option>
                <option value="7">口腔科</option>
                <option value="8">精神科</option>
                <option value="9">中医科</option>
                <option value="10">中西医结合科</option>
                <option value="11">肿瘤科</option>
                <option value="12">全科医疗科</option>
                <option value="13">急诊医学科</option>
                <option value="14">医学检验科</option>
                <option value="15">>医学影像科</option>
            </select>
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">挂号类型</label>
        <div class="layui-input-block">
            <input type="radio" name="type" value="0" title="普通" checked>
            <input type="radio" name="type" value="1" title="专家">
        </div>
    </div>

    <div class="layui-form-item">
        <label class="layui-form-label">挂号时间</label>
        <div class="layui-input-block">
            <input type="text" class="layui-input" name="time" id="date">
        </div>
    </div>
    <script>
        layui.use('laydate', function(){
            var laydate = layui.laydate;

            //执行一个laydate实例
            laydate.render({
                elem: '#date' //指定元素
            });
        });
    </script>

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
