<%@ page contentType="text/html;charset=utf-8" language="java" %>
<html>
<head>
<title>studentBean 实例</title>
</head>
<body>

<jsp:useBean id="student" class="com.example.bean.StudentBean" >
    <jsp:setProperty name="student" property="firstName" value="小强" />
    <jsp:setProperty name="student" property="lastName" value="王" />
    <jsp:setProperty name="student" property="age" value="22" />
</jsp:useBean>

<p>
    学生名字:
    <jsp:getProperty name="student" property="firstName"/>
</p>
<p>
    学生姓氏:
    <jsp:getProperty name="student" property="lastName"/>
</p>
<p>
    学生年龄:
    <jsp:getProperty name="student" property="age"/>
</p>

</body>
</html>