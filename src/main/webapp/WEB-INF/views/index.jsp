<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: tianxinxing
  Date: 2018/10/12
  Time: 21:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="static/jquery-1.10.2.min.js"></script>
</head>
<body>
<h2>首页</h2>
<div id="resp"></div>
<input type="button" onclick="req()" value="请求">
</body>
</html>
<script>
    function req(){
        $.ajax({
            url:"convert",
            data:"1-txx",
            type:"POST",
            contentType:"application/x-wisely",
            success:function(data){
                $("#resp").html(data);
            }

        })
    }
</script>
