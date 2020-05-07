<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="com.hefshine.bean.Student"%>
<%@page import="java.util.List"%>
<%@page import="com.hefshine.dao.StudentDAO"%>
<%@page import="com.hefshine.bean.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<jsp:useBean id="user" class="com.hefshine.bean.User" scope="session" />

<h1>Welcome, <%=((User)session.getAttribute("user")).getUsername() %></h1>

<h1> Using Jsp Use Bean Welcome, <jsp:getProperty property="username" name="user"/></h1>

<h1>Using JSP Expression Language ${user.getUsername()}  </h1>

<h2> Using JSP Expression Language using username as session value : ${username1}  </h2>




</body>
</html>