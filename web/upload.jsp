<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>文件上传实例</title>
</head>
<body>
    <h1>文件上传实例</h1>
    <form method="POST" action="upload" enctype="multipart/form-data">
        选择一个文件：
        <input type="file" name="uploadFile">
        <input type="submit" value="上传">
    </form>
</body>
</html>