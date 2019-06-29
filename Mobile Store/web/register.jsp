<%--
  Created by IntelliJ IDEA.
  User: 程旺的电脑
  Date: 2019/6/18
  Time: 10:05
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<html lang="en">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>注册</title>
    <link rel="stylesheet" type="text/css" href="css/style2.css">
    <link rel="stylesheet" href="//at.alicdn.com/t/font_1156468_arjjqfooirf.css" type="text/css">
</head>
<body>
<form class="box" action="register" method="post">
    <h1>注册</h1>
    <div class="box1"></div>
    <div class="box2">
        <!--<i class="iconfont icon-mima"></i>-->
        <input type="text" placeholder="username" name="userName">
    </div>
    <div class="box2">
        <!--<i class="iconfont icon-denglu"></i>-->
        <input type="password" placeholder="password" name="password1">
    </div>
    <div class="box2">
        <input type="password" placeholder="password" name="password2">
    </div>
    <div class="box2">
        <input type="hidden"  value="用户" name="role">
        <%--<select name="role" hidden >
            <option value="管理者">管理者</option>
            <option value="用户">用户</option>
        </select>--%>
    </div>
    <input type="submit"value="register">
    <input type="reset" value="reset">
</form>

</body>
</html>
