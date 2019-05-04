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
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.4.0.min.js"></script>
<script type="text/javascript">
    function register() {
        var name = document.getElementById('name').value;
        var gender = document.getElementById('gender').value;
        var user = {"name": name, "gender": gender};
        var json = JSON.stringify(user);
        var url = '${pageContext.request.contextPath}/student/register.do';
        $.ajax({type:'post',
        url:url,
        contentType:'application/json;charset=utf-8',
            data:json,
            success:function(respData){
                alert(respData.name+':'+respData.gender)
            }
        });
    }


</script>
<form method="post" action="${pageContext.request.contextPath}/student/register2.do">
    用户名：<input type="text" name="username" id="name"> <br>
    性别：<input type="text" name="gender" id="gender"> <br>
    <input type="submit" value="提交">
</form>

</body>
</html>
