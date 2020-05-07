<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="myerror.jsp" %> --%>
  
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="myerror1.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%!
	int n1=2;
	int n2=0;
	int n3;
%>

<%
n3=n1/n2;

%>

<h1>N3 Value is :: <%=n3 %></h1>

</body>
</html>