
<%--  19/9/25 -> JSP and tags -> scripting tags -> scriptlet tag --%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%-- Scriptlet Tag --%>
	<%
		String pro_name = request.getParameter("pname");
		String pro_id = request.getParameter("pid");
		String pro_price = request.getParameter("pprice");
		String pro_quantity = request.getParameter("pqty");
		
		out.println("<center><h1>");
		out.println("Product Name : "+pro_name+"<br>");
		out.println("Product Id : "+pro_id+"<br>");
		out.println("Product Price : "+pro_price+"<br>");
		out.println("Product Quantity : "+pro_quantity+"<br>");
		out.println("</h1></center>");
	%>
</body>
</html>