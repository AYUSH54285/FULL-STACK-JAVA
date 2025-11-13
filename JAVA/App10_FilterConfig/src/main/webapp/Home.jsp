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
		<h1>
		<% 
			String FilterName = (String) request.getAttribute("filterName");
		String msg = (String) request.getAttribute("msg");
		String name = request.getParameter("uname");
		out.println("Welcome "+name+" <br><br>");
		out.println("Filter Name : "+FilterName+" (Filter Config)<br><br>");
		out.println("msg : "+msg+"(Web.xml)<br><br>");
		%>
		</h1>
	</center>
</body>
</html>