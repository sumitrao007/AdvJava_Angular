<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
    
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

if(username.trim().equalsIgnoreCase("admin") && password.trim().equalsIgnoreCase("admin")){
	
	session.setAttribute("username",username );
	
	response.sendRedirect("welcome.jsp");
	
}else{
	response.sendRedirect("login.html");
	
	//out.print("<h1>Invalid Username & Password...</h1>");
	
	
	
}%>


<div>

<h2>Username is <%=username %></h2>
<h2>Password is <%=password %></h2>

</div>





</body>
</html>