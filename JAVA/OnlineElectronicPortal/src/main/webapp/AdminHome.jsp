<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import= "com.pack1.AdminBean"
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
			AdminBean abean = (AdminBean)session.getAttribute("abean");
			out.println("<h1>Welcome Mr. "+abean.getaFname()+"!! </h1><br><br>");
		%>
		
		<a href="AddProduct.html">Add Product</a><br>
		<a href="view1">View Product</a><br>
		<a href="Logout">Logout</a><br>
	</center>
</body>
</html>