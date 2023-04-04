<%--
  Created by IntelliJ IDEA.
  User: HWJ
  Date: 2023/4/4
  Time: 21:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="header.jsp"%>
        <h1>Login</h1>
<%
if(request.getAttribute("massage")==null)
    out.println(request.getAttribute("massage"));
%>
        <form method="post" action="login">
            Username:<input type="text" name=username"><br/>
            Password:<input type="password" name=password"><br/>
            <input type="submit" value="submit"/>
        </form>
<%@include file="footer.jsp"%>