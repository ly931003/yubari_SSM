<%--
  Created by IntelliJ IDEA.
  User: Lian
  Date: 2019/5/2
  Time: 21:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/login.do" method="post">
    <label>
        Username:
        <input type="text" name="username">
    </label><br>
    <label>
        Password:
        <input type="text" name="password">
    </label><br>
    <input type="submit" value="Login"><br>
</form>
</body>
</html>
