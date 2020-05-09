<%@page import="com.hefshine.bean.Student"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<!-- 1.Display a value -->
	<h1> <c:out value="Hello Tag Lib "></c:out></h1>
	<!-- 2. set a variable  -->
	<c:set var="a" value="110" scope="session"></c:set>
	<h2>Value of a is ::  <c:out value="${a}"></c:out> </h2>
	<a href="display2.jsp"> Display</a>
	
	 <!-- 3. remove variable -->
	 
	 <c:set var="b" value="20"></c:set>
	 <h2>Value of b is ::  <c:out value="${b}"></c:out> </h2>
	 <c:remove var="b" ></c:remove>
	 <h2>Value of b is ::  <c:out value="${b}"></c:out> </h2>
	 <% int c=30; %>
	 <c:set var="C" value="<%=c%>"></c:set>
	 <h2>Value of c is :: <c:out value="${C}"></c:out> </h2>
	  <!-- 4. How to use IF -->
	  <c:if test="${a<C}" var="res" >
	  	
	  	<h4>If condition is === <c:out value="${res}"/> & its value is <c:out value="${a }"></c:out> less than C</h4>
	  	
	  </c:if>
	  
	  <!-- 5 how to use switch => choose,when,otherwise -->
	  <c:choose>
	  	<c:when test="${a<10 }">
	  		<h2> Value of a is less than 10 </h2>
	  	</c:when>
	  	<c:when test="${a>10 }">
	  		<h2> Value of a is greater than 10 </h2>
	  	</c:when>
	  	<c:otherwise>
	  	 <h2> Value of a is Equal to 10 </h2>
	  	</c:otherwise>
	  	
	  </c:choose>
	<!--6  Loop tag for repeting & traversing -->  
	<c:forEach var="i" begin="1" end="5" step="1" >
		<h4>Value of i is ::  <c:out value="${i}"></c:out></h4>	
	</c:forEach>
	<%
		List<String> list=new ArrayList<String>();
		list.add("Sumit");
		list.add("Kiran");
		list.add("Spruha");
		list.add("Pankaj");
		session.setAttribute("list", list);
	%>
	
	<c:forEach var="j" items="${sessionScope.list}" >
		<c:out value="${j}"></c:out><br>	
	</c:forEach>
	<% 
	List<Student> list1=new ArrayList<Student>();
		for(int i=0;i<4;i++){
			Student s=new Student();
			s.setRollnumber(i+1);			
			list1.add(s);
		}
		
		session.setAttribute("list1", list1);
		
	%>
	<c:forEach var="stud" items="${sessionScope.list1}">
		<c:out value="${stud.getRollnumber() }"></c:out>
	</c:forEach>
	
	<!-- 7. for Token = > -->
	<% String str="Core Java,Adv Java,Spring,Angular 7";
		session.setAttribute("str", str);
	%>
	<br><br>
	<c:forTokens items="${sessionScope.str}" delims="," var="name">
		<input type="checkbox" ><c:out value="${name}"></c:out>&nbsp;&nbsp;&nbsp;&nbsp;
	</c:forTokens>
	
	<!-- redirect the URL -->
	<%-- <c:redirect url="https://sumitrao007.github.io/" >
	
	</c:redirect> --%>
	
	<c:url var="myurl" value="https://www.google.com/search">
	 <c:param name="q" value="sumit raokhande youtube channel"></c:param>
		</c:url>
		<br><br>
	<c:out value="${ myurl}"></c:out>
	<%-- <c:redirect url="${myurl}"></c:redirect> --%>
	
		<!-- Import Another Website in your page -->
		<c:import url="https://www.google.com" />
	

</body>
</html>