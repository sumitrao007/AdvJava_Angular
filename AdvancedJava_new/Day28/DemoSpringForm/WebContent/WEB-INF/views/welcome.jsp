<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>

<%-- <%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %> --%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="${pageContext.request.contextPath}/resources/bootstrap/css/bootstrap.min.css"
    rel="stylesheet">
</head>
<body>

<h1>Welcome User:: ${name } </h1>

<div class="container">
	<table class="table table-bordered table-hover">
		<thead class="thead-dark">
			<th>Roll Number</th>
			<th>First Name</th>
			<th>Last Name</th>
		</thead>
		
		<tbody>
			<c:forEach var="student" items="${studentlist}">
				<tr>
				<td> ${student.getRollnumber() } </td>
				<td> ${student.getFirstname() } </td>
				<td> ${student.getLastname() } </td>
			</tr>
			</c:forEach>
			
			
		</tbody>
		
	</table>
</div>
</body>
</html>