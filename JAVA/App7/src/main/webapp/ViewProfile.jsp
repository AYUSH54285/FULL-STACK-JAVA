<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="com.pack1.UserBean"%>
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
			UserBean ub = (UserBean)application.getAttribute("ubean");
			
			String pwd = ub.getUser_password();
			String secure_pwd = pwd.substring(0,1)+"******"+pwd.substring(pwd.length()-1);
			out.println("<h1>");
			out.println(("This session belongs to "+f_name+"<br><br>"));
			out.println(ub.getUser_name()+" "+secure_pwd+" "+ub.getUser_fname()+" "+ub.getUser_lname()+" "+ub.getUser_mail()+" "+ub.getUser_phone());
			out.println("</h1>");
		%>
		
		<h1>
			<a href="Edit">Edit Your Profile</a><br><br>
			<a href="Logout">Logout</a><br><br>
		</h1>
	</center>
</body>
</html>