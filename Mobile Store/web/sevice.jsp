<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2019/6/5
  Time: 22:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>客服</title>
    <link rel="stylesheet" href="css/index.css">
    <script rel="script" src="js/index.js"></script>
    <base target="_blank">
</head>
<body>
<div id="input">
    <div id="messagecontainer">
        <div id="container">
            <div id="message">
                <c:forEach items="${sessionScope.messageList}" var="message">
                    <c:choose>
                        <c:when test="${message.sender==id}">
                            <div class="messagebox" style="margin-left: auto;background-color: #fffbc0">${message.content}</div>
                        </c:when>
                        <c:when test="${message.sender!=id}">
                            <div class="messagebox">${message.content}</div>
                        </c:when>
                    </c:choose>
                </c:forEach>
            </div>
        </div>
    </div>
    <input id="text" type="text"/>
    <div onclick="send()" id="button">&nbsp;&nbsp;&nbsp;发送消息</div>
</div>
<script>
    function setMessageInnerHTML(innerHTML) {
        var text=JSON.parse(innerHTML);
        var test=document.getElementById("message");
        var adddiv=document.createElement("div");
        adddiv.innerText=text.message;
        adddiv.className="messagebox";
        test.appendChild(adddiv);
        if (text.id=="${sessionScope.id}"){
            adddiv.style.marginLeft="auto";
            adddiv.style.backgroundColor="#fffbc0";
        }
    }
</script>
</body>
</html>
