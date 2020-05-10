<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>     
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

 <!-- Database Connection -->
 <sql:setDataSource driver="com.mysql.jdbc.Driver" 
 url="jdbc:mysql://localhost:3306/studentdb1" 
 user="root" password="" var="con"/>
 <%
 	int roll=21;
 	String fname="pqr";
 	String lname="ghk";
 %>
   <!-- You can insert,update & delete -->
   <sql:update dataSource="${con}" var="count">insert into student values(<%=roll %>,"<%=fname %>","<%=lname %>")</sql:update>
 
 	<h1> Data insertated Successfully <c:out value="${count}"></c:out> rows affected </h1>
 
 <sql:query dataSource="${con}" var="rs">select * from student;</sql:query>
 
 <table>
 <thead>
 	<th>Roll Number</th>
 	<th>First Name</th>
 	<th>Last Name</th>
 </thead>
 
 <tbody>
 	<c:forEach items="${rs.rows}" var="row">
 	
 		<tr>
 			<td> <c:out value="${row.rollnumber}"></c:out> </td>
 			<td> <c:out value="${row.firstname}"></c:out> </td>
 			<td> <c:out value="${row.lastname}"></c:out> </td>
 		</tr>
 	
 	</c:forEach>
 		
 </tbody>
 
 </table>
 

</body>
</html>