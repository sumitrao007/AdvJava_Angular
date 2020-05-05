<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.Date, java.io.* " %>
<%-- <%@ page import="java.io.*" %> --%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

</head>
<body>
<h1>Hello JSP</h1>
<!-- declarative tag -->
<%! int count=0;
	
	public void jspInit(){
		System.out.println("Jsp Init Method is Invoked.....");
	}
	
	public void jspDestroy(){
		System.out.println("Jsp Destroy Method is Invoked.....");
		
	}
	


%>
<!-- Sriptlet Tag -->
<% 
	count++;
  //  int temp=10;
   
   if(count%2==0){ 
	   %>
   
	   <!-- System.out.println("Even number.... "+count); 
	   out.println("Even number.... "+count); -->
	   Even number: <%=count %>
	   
	<%   
   }else
   { %> 
   
   
	   <!-- System.out.println("Odd number.... "+count); 
	   out.println("Odd number.... "+count); -->
	   Odd number: <%=count %>
	 <%  
   }
   %> 
   
   <% 
   System.out.println("Jsp Service Method is Invoked.....");

%>

<%-- <%=count %> --%>

<h1>Count is ::<%=count %> </h1>

<h2> <%= new Date() %>  </h2>




</body>
</html>