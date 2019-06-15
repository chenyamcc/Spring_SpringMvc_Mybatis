<%--
  Created by IntelliJ IDEA.
  User: maybe
  Date: 2019/6/14
  Time: 11:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@   page isELIgnored="false" %>
<html>
<head>
    <title>注册页面</title>
</head>
<body>
<form action="/SpringMvcDemo1/stu/register.do" method="post">
    <label for="userName">姓名：</label>
    <input id="userName" type="text" name="userName" value="${stu.userName}"><br/><br/>
    <label for="passWord">密码：</label>
    <input id="passWord" type="password" name="passWord" value="${stu.passWord}"><br/><br/>
    <label for="age">年龄：</label>
    <input id="age" type="text" name="age"><br/><br/>
    <label for="email">邮箱：</label>
    <input id="email" type="email" name="email"><br/><br/>
    <button type="submit">提交</button>
</form>
</body>
</html>
