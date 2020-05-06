<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="com.hefshine.bean.Student"%>
<%@page import="java.util.List"%>
<%@page import="com.hefshine.dao.StudentDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Welcome, <%=(String)session.getAttribute("username") %></h1>

<%
    StudentDAO dao=new StudentDAO();
	 List<Student> list= dao.getAllStudent();
%>

<table border="1px">
<thead>
	<th> # </th>
	<th> Roll Number </th>
	<th> First name </th>
	<th> Last Name </th>
</thead>
<tbody>
	<%
	int i=0;
			for(Student s:list){
				i++;
				%>
				<tr>
				<td><%=i %></td>
				<td><%=s.getRollnumber() %></td>
				<td><%=s.getFirstname() %></td>
				<td><%=s.getLastname() %></td>
				</tr>
				<% 
				
			}%>
	

</tbody>


</table>

</body>
</html>