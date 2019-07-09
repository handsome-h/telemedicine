<%--
  Created by IntelliJ IDEA.
  User: 38373
  Date: 2019/7/8
  Time: 21:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>预约挂号</title>
</head>
<body>

<form action="${ pageContext.request.contextPath }/user/registration" method="post">
    患者姓名：<input type="text" name="name">
    患者年龄：<input type="text" name="age">
    患者性别：<input type="text" name="sex">
    患者身份证号：<input type="text" name="idNumber">
    患者联系电话；<input type="text" name="phone">
    患者联系地址：<input type="text" name="address">
    患者病症：<input type="text" name="disease">
    <br>
    挂号科室：<input type="text" name="department">
    挂号类型：<input type="text" name="type">
    挂号时间：<input type="text" name="time">

    <input type="submit" value="提交">
</form>

</body>
</html>
