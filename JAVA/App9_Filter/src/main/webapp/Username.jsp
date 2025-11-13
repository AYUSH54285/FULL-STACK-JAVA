<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import = "com.pack1.UserBean"%>
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
				UserBean ub = (UserBean)request.getAttribute("UserBean");
				out.println("----------User Details--------<br><br>");
				out.println("UserName : "+ub.getU_name()+"<br><br>");
				String pwd = ub.getU_pwd();
				out.println("Password : "+pwd.substring(0,1).concat("*****").concat(pwd.substring(pwd.length()-1))+"<br><br>");
				out.println("FirstName : "+ub.getU_fname()+"<br><br>");
				out.println("LastName : "+ub.getU_lastname()+"<br><br>");
				out.println("Mailid : "+ub.getU_mailid()+"<br><br>");
				out.println("FirstName : "+ub.getU_phone()+"<br><br>");
				
			%>
		</h1>
	</center>
</body>
</html>