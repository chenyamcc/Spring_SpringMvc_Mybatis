<%--
  Created by IntelliJ IDEA.
  User: maybe
  Date: 2019/6/14
  Time: 14:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>测试ajax请求</title>
</head>
<script src="../jquery/jquery-2.2.2.min.js"></script>
<body>
<form id="myfrom">
    <input type="text" name="username">
    <input type="text" name="password">
    <button id="btn1" type="button">提交</button>
</form>
<script>
    $("#btn1").click(function () {
        $.ajax({
            url: "/SpringMvcDemo1/ajax/demo1.do",
            type: "post",
            async: true,
            data:${"#myform"},
            success: function (meg) {
                console.info(meg)
            }
        });
    });
</script>
</body>
</html>
