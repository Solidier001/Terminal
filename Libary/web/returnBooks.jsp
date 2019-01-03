<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2018/12/24
  Time: 22:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>图书归还</title>
    <link rel="stylesheet" href="css/rentbooks.css" type="text/css">
</head>
<body>

<div id="top">
    <ul>
        <li><a href="#">用户管理</a></li>
        <li><a href="/readBookServlet?Books=">图书管理</a></li>
        <li><a href="/forRentServlet?Books=">图书借阅</a></li>
        <li><a href="/ReadyReturnServlet?BName=">图书归还</a></li>
        <li><a href="#">记录管理</a></li>
    </ul>
</div>
<div id="welcome">欢迎您，${information.result}</div>
<div  align="center">
    <form action="/ReadyReturnServlet" method="post">
        <input type="text" name="Books"style="width: 800px;height: 40px;position: relative;top: 20px"   placeholder="搜索相关图书......">
        &nbsp;&nbsp;
        <input type="submit" value="查询" style=" position: relative;top: 20px;right: 50px" id="submit">
    </form>
    <div id="result">
        <form action="/RternBookServlet" method="post" >
            <table class="resulttable">
                <tr>
                    <th class="line1">序列号</th>
                    <th class="line2">书名</th>
                    <th class="line3">作者</th>
                    <th class="line4">价格</th>
                    <th class="line5">位置</th>
                    <th class="line6">在馆状态</th>
                    <th class="line7">图书状态</th>
                    <th class="line8">借阅时间</th>
                    <th class="line9">操作</th>
                </tr>
                <c:forEach items="${requestScope.Return}" var="forReturn">
                    <tr>
                        <td class="line1">${forReturn.bno}</td>
                        <td class="line2">${forReturn.bname}</td>
                        <td class="line3">${forReturn.author}</td>
                        <td class="line4">${forReturn.price}</td>
                        <td class="line5">${forReturn.location}</td>
                        <td class="line6">${forReturn.statu}</td>
                        <td class="line7">${forReturn.condition}</td>
                        <td class="line8">${forReturn.renttime}</td>
                        <td class="line9"><a href="/RternBookServlet?Bno=${forReturn.bno}">归还</a> </td>
                    </tr>
                </c:forEach>
            </table>
        </form>

    </div>
</div>
</body>
</html>
