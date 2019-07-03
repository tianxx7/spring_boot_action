<%--
  Created by IntelliJ IDEA.
  User: tianxinxing
  Date: 2019/6/26
  Time: 18:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>async</title>
</head>
<body>
servlet 3.0+对异步的支持
</body>
</html>
<script src="static/jquery-1.10.2.min.js"></script>
<script>
    deferred();
    function deferred(){
        $.get('defer',function(e){
            console.log(e);
            deferred()
        })
    }
</script>
