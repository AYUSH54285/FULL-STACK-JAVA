<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.pack1.AdminBean, java.util.ArrayList, com.pack1.ProductBean, java.util.Iterator" %>
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
			ArrayList<ProductBean> al = (ArrayList<ProductBean>)session.getAttribute("ProductList");
			out.println("<h1>Welcome Mr. <u>"+abean.getaFname()+"</u> These are the listed Products in Admin inventory!"+"</h1><br><br>");
			
			if(al.size()==0){
				out.println("Products are not available!!");
			}
			else{
				Iterator<ProductBean> i = al.iterator();
				while(i.hasNext()){
					ProductBean pb = i.next();
					out.println(pb.getpCode()+" "+pb.getpName()+" "+pb.getpCompany()+" "+pb.getpPrice()+" "+pb.getpQty()+" "
					+"<a href='edit?pcode="+pb.getpCode()+"'>Edit</a>"+" "
					+"<a href='delete?pcode="+pb.getpCode()+"'>Delete</a>"+"<br>");
				}
			}
		%>
	</center>
</body>
</html>