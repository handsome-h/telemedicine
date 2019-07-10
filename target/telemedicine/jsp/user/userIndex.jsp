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
    <link rel="stylesheet" href="${ pageContext.request.contextPath }/resources/layui/css/layui.css">
    <script src="${ pageContext.request.contextPath }/resources/layui/layui.js"></script>
</head>
<body>

<div class="container-fluid">
    <div class="row layui-bg-gray" style="height: 30px;line-height:30px;">
        <div class="col-md-5">
            <span style="margin:0 10px">您好！${user.userAccount}</span>
            <span><a href="${ pageContext.request.contextPath }/user/quit">退出登录</a></span>
        </div>
        <div class="col-md-2"></div>

        <div class="col-md-5">
            <span style="margin:0 10px"><a href="${ pageContext.request.contextPath }/doctor/findAllDoctors">个人信息</a></span>
            <span><a href="">问诊信息</a></span>
            <span style="margin:0 10px"><a href="">挂号信息</a></span>
            <span><a href="">联系过的医生</a></span>
            <span style="margin:0 10px"><a href="">提出过的问题</a></span>
        </div>

    </div>
</div>


<div style="width:90%;margin:auto;">
    <div class="row">
        <div class="col-md-1"></div>
        <div class="col-md-10">
            <form class="form-inline">
                <img src="${ pageContext.request.contextPath }/resources/images/index/logo.png" style="width:400px;height:80px;">
                <input type="text" class="form-control" style="width:400px;" name="search" placeholder="请输入疾病名、科室名或医生名">
                <button type="submit" class="btn btn-primary">搜索</button>
            </form>
        </div>
    </div>

    <div class="row" style="font-size:large;">
        <div class="col-md-1"></div>
        <div class="col-md-2"><a href="${ pageContext.request.contextPath }/jsp/user/inquiry.jsp">在线问诊</a></div>
        <div class="col-md-2"><a href="${ pageContext.request.contextPath }/jsp/user/registration.jsp">预约挂号</a></div>
        <div class="col-md-2"><a href="">急速问诊</a></div>
        <div class="col-md-2"><a href="">医学百科</a></div>
    </div>

</div>


<div class="layui-carousel" id="test1" style="margin-top:10px;">
    <div carousel-item>
        <div><img src="${ pageContext.request.contextPath }/resources/images/index/1.jpg" style="width:100%;height:350px;"></div>
        <div><img src="${ pageContext.request.contextPath }/resources/images/index/2.jpg" style="width:100%;height:350px;"></div>
        <div><img src="${ pageContext.request.contextPath }/resources/images/index/3.jpg" style="width:100%;height:350px;"></div>

    </div>
</div>

<script>
    layui.use('carousel', function(){
        var carousel = layui.carousel;
        //建造实例
        carousel.render({
            elem: '#test1'
            ,width: '100%'
            ,height: '350px'
            ,arrow: 'none'
        });
    });
</script>


</body>
</html>