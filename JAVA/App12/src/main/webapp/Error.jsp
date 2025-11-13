<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@page isErrorPage="true" %> <!-- true shows this the error page -->

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center>
		<h1>
			<%
				out.println("Invalid Data<br<br>");
			%>
			<%=
				exception
			%>
		</h1>
		
		<%@ include file="input.html" %>
	</center>
</body>
</html>