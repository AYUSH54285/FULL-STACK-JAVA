<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="com.pack1.AdminBean,com.pack1.ProductBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center>
	<%
		AdminBean ab = (AdminBean)session.getAttribute("abean");
		ProductBean pb = (ProductBean)request.getAttribute("pbean");
		out.println("Hello Mr."+ab.getaFname()+" below are the product detials available for edit<br>");
	%>
	<form action="update" method="post">
		Product Price <input type="text" name=pprice value="<%=pb.getpPrice()%>"><br><br>
		Product Quantity <input type="text" name=pqty value="<%=pb.getpQty() %>"><br><br>
		<input type="hidden" name=pcode value="<%=pb.getpCode()%>"> <%-- this will be hidden and we use pcode for identifying the row --%>
		<input type="submit" value="Update Product">
	</form>
	</center>
</body>
</html>