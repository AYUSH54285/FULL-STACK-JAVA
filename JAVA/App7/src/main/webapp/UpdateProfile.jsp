<%@ page import="com.pack1.UserBean" %>
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
			String f_name = (String)request.getAttribute("fname");
			String data = (String)request.getAttribute("msg");
			UserBean ub = (UserBean)application.getAttribute("ubean");
			out.println("<h1>");
			out.println("This session belongs to "+f_name+"<br><br>");
			out.println(data+"<br><br></h1>");
		%>
		<h1>
			<a href="view">View Profile</a><br><br>
			<a href="Logout">Logout</a><br><br>
		</h1>
	</center>
</body>
</html>