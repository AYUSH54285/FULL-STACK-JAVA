<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center>
		<%
		String data = (String)request.getAttribute("msg"); // request is used in jsp instead of ServletRequest
		out.println("<h1>"+data+"</h1>"); // out is used in jsp instead of PrintWriter
		%>
		
		<h1>
			<a href="emp.html">Add Employee Details</a><br>
			<a href="view">View Employee Details</a>
		</h1>
	</center>
</body>
</html>