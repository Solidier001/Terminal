<%@ page import="Java.JavaBeen.table.Users" %><%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2018/11/30
  Time: 8:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
 <title>图书馆-登录</title>
    <link rel="stylesheet" type="text/css" href="css/base.css" />
    <link rel="stylesheet" type="text/css" href="css/n.css" />
      <script src="js/index.js"></script>
    </head>
  <body>
  <div class="main">
      <header>
          <div class="container">
              <img width="100" height="60" class="logo" src="image/01cb5a56dfd3036ac72531cb9104f2.jpg" alt="图书馆">
          </div>
      </header>
      <div id="root">
          <table cellpadding="0" cellspacing="0">
              <tr>
                  <td id="brand">
                      <img width="410" src="image/1912_20121228001801602200_1.jpg" />

                  </td>
                  <td>
                      <div id="login">
                          <div style="margin-top:20px;margin-left: 40px;">
                              账号登录
                          </div>
                          <form name="sign_in" action="/SignUpServlet" onsubmit="checkdata()" method="post" style="height: 75%;width: 100%" >
                              <input  type="text"class="form-control" value="${information.result.uno}" placeholder="学号/教职工号"  name="Uno"style="width: 60%;height: 10%;margin-top: 50px;margin-bottom:20px;margin-left: 50px"><br>
                              <input type="password" class="form-control" placeholder="密码" name="password"style="width: 60%;height: 10%;margin-bottom:20px;margin-left: 50px"><br>
                              <div class="alert">${information.addtion}</div><br>
                              <input type="submit"class="form-control" value="登录" style="border-style: none;width: 60%;height: 10%;margin-left: 50px;background-color: #108cee"><br>
                          </form>
                      </div>
                  </td>
              </tr>
          </table>
      </div>
  </div>
  </body>
</html>
