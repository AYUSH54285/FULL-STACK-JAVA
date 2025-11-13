<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="com.pack1.UserBean"
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center>
		<%
			UserBean ub = (UserBean)application.getAttribute("ubean"); // application -> Refers to the ServletContext object (shared across the whole web app). In JSP, the application implicit object is automatically available.
			out.println("<h1>Welcome "+ub.getUser_name()+"<br><br><br>");
		%>
		
		<a href="view">View Profile</a><br><br>
		<a href="Logout">Logout</a><br><br>
	</center>
</body>
</html>