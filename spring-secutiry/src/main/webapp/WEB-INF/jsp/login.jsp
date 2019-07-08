<%--
  Created by IntelliJ IDEA.
  User: tianxinxing
  Date: 2019/7/8
  Time: 19:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登陆</title>
</head>
<body>
<h3>登陆</h3>
<form action="${pageContext.request.contextPath}/securityLogin" method="post">
    用户名:<input type="text" name="username">
    密码:<input type="password" name="password">
    <input type="submit" value="登陆">
</form>
</body>
</html>
