<%@page import="com.hefshine.dao.StudentDAO"%>
<%@page import="com.hefshine.bean.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
String username=request.getParameter("username");
String password=request.getParameter("password");

User user=new User();
user.setUsername(username);
user.setPassword(password);

StudentDAO dao=new StudentDAO();
boolean status=dao.CheckUser(user);

if(status){
	
	session.setAttribute("username", username);
	response.sendRedirect("welcome.jsp");
	
}else{%>

<h1>Invalid Username & Password</h1>
<a href="login.html">Login Again</a>
<%

}%>



</body>
</html>