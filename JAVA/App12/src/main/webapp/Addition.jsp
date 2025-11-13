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
	<%
		int x = Integer.parseInt(request.getParameter("num1"));
		int y = Integer.parseInt(request.getParameter("num2"));
		String date = request.getParameter("data");
		out.println("<h1>Addition : "+(x+y)+"<br><br>");
		out.println("Todays Date : "+date+"</h1><br><br>");
	%>
	<%@ include file="input.html" %> <!-- @inlcude Directive tag -->
</body>
</html>