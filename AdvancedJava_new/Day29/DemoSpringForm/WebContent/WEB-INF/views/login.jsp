<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link
	href="${pageContext.request.contextPath}/resources/bootstrap/css/bootstrap.min.css"
	type="text/css" rel="stylesheet">
<link
	href="${pageContext.request.contextPath}/resources/fontaesome/css/all.min.css"
	type="text/css" rel="stylesheet">

</head>
<body>

	<h1>Login Form</h1>

	<div class="container" style="margin-top: 10px;">
		<div class="card bg-light" style="max-width: 300px;">


			<article class="card-body mx-auto" style="max-width: 500px;">
				<%-- <form action="login" method="post"> --%>
				
				<sf:form action="loginuser" method="post" modelAttribute="user">
				
					<div class="form-group input-group">
						<div class="input-group-prepend">
							<span class="input-group-text"> <i class="fa fa-user"></i>
							</span>
						</div>
					<!-- 	<input name="username" class="form-control"
							placeholder="Enter the Username" type="text"> -->
							
					<sf:input path="username" cssClass="form-control"
					placeholder="Enter the Username" type="text"/>		
					</div>

					<div class="form-group input-group">
						<div class="input-group-prepend">
							<span class="input-group-text"><i class="fa fa-lock"></i>
							</span>
						</div>
						<!-- <input type="password" class="form-control" name="password"
							placeholder="Enter the Password"> -->
							
						<sf:input path="password" cssClass="form-control" placeholder="Enter the Password"
						type="password" />	
					</div>
					
					 <button type="submit" class="btn btn-success">Login</button>

				</sf:form>
			<!-- 	</form> -->


			</article>

		</div>

	</div>


</body>
</html>