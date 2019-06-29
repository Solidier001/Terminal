<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2019/6/21
  Time: 21:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>uplode</title>
</head>
<body>
<form method="post" action="uplode.action" enctype="multipart/form-data">
    价格：<input type="text" name="price"><br>
    名称：<input type="text" name="name"><br>
    描述：<input type="text" name="discribe"><br>
    图片：<input type="file" name="icon"><br>
    <input type="submit" value="提交">
</form>
</body>
</html>
