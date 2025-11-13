<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page errorPage="Error.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center>
		<%!
			// Declaration Tag
			int find_factorial(int x){
				int fact = 1;
				for(int i=1 ; i<=x ; i++){
					fact = fact * i;
				}
				return fact;
			}
		%>
		
		<%
			int num = Integer.parseInt(request.getParameter("num"));
			int result = find_factorial(num);
			out.println("<h1> Factorial : "+result+"</h1><br><br>");
		%>
		
		<%@ include file="input.html" %> <!-- @include Directive Tag -->
	</center>
</body>
</html>