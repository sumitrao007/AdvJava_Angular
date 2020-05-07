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
	 String username1=request.getParameter("username1");
	String password1=request.getParameter("password1"); 
	
	/* User user=new User();
	user.setUsername(username);
	user.setPassword(password); */
	
	%>
	
	<jsp:useBean id="user" class="com.hefshine.bean.User" scope="session" />
	<jsp:setProperty property="username" name="user" param="username" />
	<jsp:setProperty property="password" name="user" param="password"/>	
	
	
	
	<%
	
	StudentDAO dao=new StudentDAO();
	boolean status=dao.CheckUser(user);
	
	if(status){
		
		session.setAttribute("username1", username1);		
	%>
	
	<%-- <jsp:forward page="welcome.jsp" /> --%>
	
	<%
		
		response.sendRedirect("welcome.jsp");
		
	}else{%>
	
	<%
	out.print("<h1 style='color:red'>Invalid Username & Password</h1>");
	%>
	<jsp:include page="login.html" />
		
	

	<!-- <h1>Invalid Username & Password</h1>
	<a href="login.html">Login Again</a> -->
	<%
	
	}%>



</body>
</html>