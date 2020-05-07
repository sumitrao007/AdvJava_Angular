<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%-- <%@ include file="myinclude.jsp" %> --%>

<jsp:include page="myinclude.jsp" />

<!-- It includes Content of file -->
<%-- <jsp:include page="bootstrap/css/bootstrap.min.css" /> --%>


</head>
<body>
<div class="container" style="margin-top: 20px;">
<input type="text" placeholder="Enter the Username" class="form-control">
<br><br>
<div class="card" style="width: 18rem;">
<img alt="" src="image/Desert.jpg" style="width: 200px;height: 200px">

<div class="card-body">
 <h5 class="card-title">Card title</h5>
    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
    <a href="#" class="btn btn-primary">Go somewhere</a>
</div>

</div>
<br>

<button class="btn btn-success">Login</button>
	
</div>
</body>
</html>