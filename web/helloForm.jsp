<%@ page contentType="text/html;charset=utf-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>hello form</title>
</head>
<body>
    <div>使用 GET 方法提交表单</div>
    <form action="helloForm" method="GET">
        网址名：<input type="text" name="name">
        <br />
        网址：<input type="text" name="url" />
        <input type="submit" value="提交" />
    </form>

    <div>使用 POST 方法提交表单</div>
    <form action="helloForm" method="POST">
        网址名：<input type="text" name="name">
        <br />
        网址：<input type="text" name="url" />
        <input type="submit" value="提交" />
    </form>
</body>
</html>