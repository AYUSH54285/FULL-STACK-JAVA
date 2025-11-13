<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import = "com.pack1.AdminBean"%>
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
				AdminBean abean = (AdminBean)session.getAttribute("abean"); // here we are using session beacuse we have to get the attribute from HttpSession
				String data = (String)request.getAttribute("msg");
				out.println("Welcome Mr. "+abean.getaFname()+"!!<br><br>");
				out.println(data+"<br><br>");
			%>
			
				<a href="AddProduct.html">Add Product</a><br><br>
				<a href="view1">View Product</a><br><br>
				<a href="Logout">Logout</a><br><br>
		</h1>
	</center>
</body>
</html>