<%--
  Created by IntelliJ IDEA.
  User: 38373
  Date: 2019/7/8
  Time: 18:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>医生首页</title>
</head>
<body>
<div>
    您好，${doctor.docAccount}
    <a href="${ pageContext.request.contextPath }/doctor/quit">退出登录</a>
</div>

<div>
    <a href="${ pageContext.request.contextPath }/jsp/doctor/doctorInfo.jsp">个人信息</a>
    <a href="">接诊区</a>
    <a href="">医疗单</a>
    <a href="">问答区</a>
</div>

</body>
</html>
