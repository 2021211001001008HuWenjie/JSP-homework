
<%--
  Created by IntelliJ IDEA.
  User: HWJ
  Date: 2023/2/27
  Time: 20:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@include file="header.jsp"%>
<h1><%="Hello World!!!"%></h1>
<br>
<a href="hello-servlet">Hello Servlet</a>
<from>
    <span style="...">New User Registration</span><br><br/>
    <span style="...">Username</span><input type="text" name="name" required="true" style="..."><br><br/>
    <span style="...">Password</span><input type="password" name="password" required="true" style="..."><br><br/>
    <span style="...">Email</span><input type="email" name="email" required="true" style="..."><br><br/>
    <span style="...">Male</span><input type="radio">
    <span style="...">Female</span><input type="radio"><br>
    <span style="...">Date of birth(yyyy-mm-dd)</span><input type="date" pattern="yyyy-mm-dd" required="true" style="...">
    <input type="submit" value="register" style="...">
</from>
<%@include file="footer.jsp"%>