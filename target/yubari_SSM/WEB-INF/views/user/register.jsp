<%--
  Created by IntelliJ IDEA.
  User: Lian
  Date: 2019/4/30
  Time: 10:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false" %>
<html>
<head>
    <title>注册</title>
</head>
<body>


<form action="${pageContext.request.contextPath}/user/register.do" method="post">
    用户名：<input type="text" name="username"> <br>
    密码：<input type="text" name="password"> <br>
    性别：<input type="text" name="gender"> <br>
    年龄：<input type="text" name="age"> <br>
    生日：<input type="text" name="birthday"> <br>
    爱好：<input type="checkbox" name="hobbyIds" value="1">1
    <input type="checkbox" name="hobbyIds" value="2">2
    <input type="checkbox" name="hobbyIds" value="3">3 <br>
    <input type="submit" value="提交">
</form>

</body>
</html>
