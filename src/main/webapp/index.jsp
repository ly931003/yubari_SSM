<%@ page import="java.util.Date" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="o" uri="http://www.opensymphony.com/oscache" %>

<html>
<body>
<h2>Hello World!</h2>

现在时间：<%=new Date()%><br>
<o:cache>
    缓存时间：<%=new Date()%>
</o:cache>

</body>
</html>
