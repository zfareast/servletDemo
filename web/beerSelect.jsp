<%@ page contentType="text/html;charset=utf-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
    <h1 align="center">Beer Selection Page</h1>
    <form action="beerSelect" method="POST">
        <p>Select beer characteristics</p>
        Color:
        <select name="color" size="1">
            <option value="light">light</option>
            <option value="amber">amber</option>
            <option value="brown">brown</option>
            <option value="dark">dark</option>
        </select>
        <br>
        <input type="submit" value="提交">
    </form>
</body>
</html>