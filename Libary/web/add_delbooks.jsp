<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2018/12/7
  Time: 9:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>图书首页</title>
    <link rel="stylesheet" href="css/add_delbooks.css">
</head>
<body >
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
    <form action="/readBookServlet" method="post">
        <input type="text" name="Books"style="width: 800px;height: 40px;position: relative;top: 20px"   placeholder="搜索相关图书......">
        &nbsp;&nbsp;
        <input type="submit" value="查询" style=" position: relative;top: 20px;right: 50px" id="submit">
    </form>
<div id="result">
    <form action="/AddBookServlet" method="post" >
        <table class="resulttable">
            <tr>
                <th class="line1">序列号</th>
                <th class="line2">书名</th>
                <th class="line3">作者</th>
                <th class="line4">价格</th>
                <th class="line5">位置</th>
                <th class="line6">在馆状态</th>
                <th class="line7">图书状态</th>
                <th class="line8">操作</th>
            </tr>
                <tr>
                <td class="line1"><input type="text" name="Bno"></td>
                <td class="line2"><input type="text" name="BName"></td>
                <td class="line3"><input type="text" name="Author"></td>
                <td class="line4"><input type="text" name="Price"></td>
                <td class="line5"><input type="text" name="Location"></td>
                <td class="line6"><input type="text" readonly value="在馆状态"></td>
                <td class="line7"><input type="text" readonly value="图书状态"></td>
                <td class="line8"><input type="submit" id="submit2"></th>
            </tr>
            <c:forEach items="${requestScope.list}" var="books">
            <tr>
                <td class="line1">${books.bno}</td>
                <td class="line2">${books.bname}</td>
                <td class="line3">${books.author}</td>
                <td class="line4">${books.price}</td>
                <td class="line5">${books.location}</td>
                <td class="line6">${books.statu}</td>
                <td class="line7">${books.condition}</td>
                <td class="line8"><a href="/off_BooksServlet?Bno=${books.bno}">删除</a></td>
            </tr>
            </c:forEach>
        </table>
    </form>

    </div>
</div>
<p>${isAdd}</p>
<div id="footer"></div>
</body>
</html>
