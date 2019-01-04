<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/12/18
  Time: 11:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<title>214图书馆</title>
  <link rel="stylesheet" href="css/tooper.css">
</head>
<body background="image/true.jpg">
<c:if test="${empty username}">
    <jsp:forward page="index.jsp"></jsp:forward>
</c:if>
<div>
  <div id="top">
     <ul>
      <li><a href="jieshao.jsp">本馆介绍</a></li>
      <li><a href="#">馆藏资源</a></li>
      <li><a href="#">电子资源</a></li>
      <li><a href="#">读者天地</a></li>
      <li><a href="#">人工服务</a></li>
     </ul>
  </div>
    <div id="welcome">欢迎您，${username}</div>
  <div  align="center">
      <form action="/ForuserServlet">
      <input type="text"  name="Books" style="width: 800px;height: 40px;position: relative;top: 20px"   placeholder="搜索相关图书......"/>
       <input type="submit" value="搜索" onclick="mm()" style=" position: relative;top: 20px;right: 50px">
      </form>
  </div>
    <div id="result">
        <table id="resulttable">
            <tr>
                <th class="line1">书名</th>
                <th class="line2">位置</th>
                <th class="line3">在馆状态</th>
            </tr>
            <c:forEach items="${requestScope.list}" var="imformation_books">
                <tr>
                    <td class="line1">${imformation_books.bname}</td>
                    <td class="line2">${imformation_books.location}</td>
                    <td class="line3">${imformation_books.statu}</td>
                </tr>
            </c:forEach>
        </table>
    </div>
    <div id="lt">
        <ul>
            <li><a href="#">个人账户</a></li>
            <li><a href="#">我的借还</a></li>
            <li><a href="#">我的主页</a></li>
            <li><a href="/Get_OutServlet">退出账号</a></li>
        </ul>
        <img src="image/读书.jpg" alt="" class="ad1">
        <div style="clear:both"></div>
        <div id="activity">
            <div class="activity">
                <p><a href="javascript:">书荒·来一本你最中意的一本书</a></p>
                <p><span>时间：9月25日 - 12月24日</span></p>
                <p><span>参加：1693人参加</span></p>
                <p><a href="javascript:">> 更多线上活动</a></p>
            </div>
        </div>
    </div>

  <div id="footer">
      © 2005－2018 214.com, all rights reserved 214图书馆官网
      <ul>
        <li><a href="#">关于本馆 ·</a></li>
        <li><a href="#">联系我们 ·</a></li>
        <li><a href="#">免责声明 ·</a></li>
        <li><a href="#">帮助中心 ·</a></li>
        <li><a href="#">资源链接 ·</a></li>
      </ul>
    </div>


</div>
</body>
</html>