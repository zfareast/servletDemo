<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.Date,java.text.SimpleDateFormat" %>
<html>
<head>
    <title>欢迎页面</title>
</head>
<body>
    <h1 align="center" style="color: red">Welcome:</h1>
    <%
        out.println(session.getAttribute("user"));
    %>
    <hr/>
    <span style="align:center; color:red">
        Time: <%
        SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String s=df.format(new Date());
        out.print(s);
        %>
    </span>
</body>
</html>