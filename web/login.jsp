<%@ page contentType="text/html;charset=utf-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
    <h1 align="center" style="color: red;">欢迎您登录系统后台</h1><hr/>
    <%--the form start--%>
    <div align="center">
        <form method="POST" action="/HelloServlet/login">
            Username:<input type="text" name="username"/><br/><br/>
            Password:<input type="password" name="password"/><br/><br/>
            <input type="submit" value="登录"/>
        </form>
    </div>
</body>
</html>