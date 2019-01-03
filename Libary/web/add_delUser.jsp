<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2018/12/27
  Time: 22:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="css/add_delUser.css" type="text/css">
</head>
<body>
<div id="top">
    <ul>
        <li><a href="/readUsers">用户管理</a></li>
        <li><a href="/readBookServlet?Books=">图书管理</a></li>
        <li><a href="/forRentServlet?Books=">图书借阅</a></li>
        <li><a href="/ReadyReturnServlet?BName=">图书归还</a></li>
        <li><a href="#">记录管理</a></li>
    </ul>
</div>
<div id="welcome">欢迎您，${username}</div>
<div  align="center">
    <form action="/readUsers" method="post">
        <input type="text" name="Users"style="width: 800px;height: 40px;position: relative;top: 20px"   placeholder="搜索相关图书......">
        &nbsp;&nbsp;
        <input type="submit" value="查询" style=" position: relative;top: 20px;right: 50px" id="submit">
    </form>
    <div id="result">
        <form action="/writeUsersServlet" method="post" >
            <table class="resulttable">
                <tr>
                    <th class="line1">学工号</th>
                    <th class="line2">班级</th>
                    <th class="line3">学院</th>
                    <th class="line4">角色</th>
                    <th class="line5">姓名</th>
                    <th class="line6">操作</th>
                </tr>
                <tr>
                    <td class="line1"><input type="text" name="Uno"></td>
                    <td class="line2"><input type="text" name="Class"></td>
                    <td class="line3"><input type="text" name="Academy"></td>
                    <td class="line4"><input type="text" name="Role"></td>
                    <td class="line5"><input type="text" name="UserName"></td>
                    <td class="line6"><input type="submit" id="submit2"></th>
                </tr>
                <c:forEach items="${requestScope.list}" var="users">
                    <tr>
                        <td class="line1">${users.uno}</td>
                        <td class="line2">${users.classes}</td>
                        <td class="line3">${users.academy}</td>
                        <td class="line4">${users.role}</td>
                        <td class="line5">${users.userName}</td>
                        <td class="line6"><a href="/write_offServlet?Users=${users.uno}">删除</a></td>
                    </tr>
                </c:forEach>
            </table>
        </form>

    </div>
</div>
</body>
</html>
