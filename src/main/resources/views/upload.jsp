<%--
  Created by IntelliJ IDEA.
  User: tianxinxing
  Date: 2019/6/25
  Time: 21:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>文件上传</title>
</head>
<body>
<div>
    <form enctype="multipart/form-data" action="upload" method="post">
        <input type="file" name="file">
        <<input type="submit" value="上传">
    </form>
</div>
</body>
</html>
