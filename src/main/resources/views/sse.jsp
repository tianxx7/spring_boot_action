<%--
  Created by IntelliJ IDEA.
  User: tianxinxing
  Date: 2019/6/25
  Time: 21:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>sse演示</title>
</head>
<body>
<span>服务端推送技术</span>
<div id="msgFromPush"></div>
</body>
</html>
<script src="static/jquery-1.10.2.min.js"></script>
<script>
    if(!!window.EventSource){
        var source = new EventSource("push");
        s='';
        source.addEventListener('message',function(e){
            s += e.data + "<br/>";
            $("#msgFromPush").html(s);
        })

        source.addEventListener("open",function(e){
            console.log("链接打开.")
        },false);

        source.addEventListener('error',function(e){
            if (e.readyState == EventSource.CLOSED) {
                console.log("链接关闭")
            } else {
                console.log(e.readyState);
            }
        },false)
    } else {
        console.log("浏览器不支持SSE")
    }
</script>