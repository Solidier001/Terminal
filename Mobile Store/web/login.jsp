<%--
  Created by IntelliJ IDEA.
  User: 程旺的电脑
  Date: 2019/6/18
  Time: 9:50
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>登录</title>
    <link rel="stylesheet" type="text/css" href="css/style1.css">
    <link rel="stylesheet" href="//at.alicdn.com/t/font_1156468_arjjqfooirf.css" type="text/css">
</head>
<body>
<form class="box" action="login.action" method="post">
    <h1>登录</h1>
    <div class="box1"></div>
    <div class="box2">
        <!--<i class="iconfont icon-mima"></i>-->
        <input type="text" placeholder="username" name="userName">
    </div>
    <div class="box2">
        <!--<i class="iconfont icon-denglu"></i>-->
        <input type="password" placeholder="password" name="password">
    </div>
    <input type="submit"value="login">
</form>

</body>
</html>