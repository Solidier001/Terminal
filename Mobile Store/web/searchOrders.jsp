<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2019/6/19
  Time: 8:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="/struts-tags" prefix="s" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div align="center">
    <form action="/chaxun.action" method="post">
        订单号:<input type="text" name="id"/>
        &nbsp;&nbsp;<s:property value="#session.searchError"/>
        <br>
        <%--商品名:<input type="text" name="account"/><br>--%>
        <%--<input type="submit" value="查询">--%>
    </form>
    <%--<a href="/base/Setorder.action">点击</a>--%>
</div>
</body>
</html>
