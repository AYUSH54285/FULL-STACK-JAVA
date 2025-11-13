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
		<%
			String f_name = (String)request.getAttribute("fname");
			UserBean ub = (UserBean)application.getAttribute("ubean");
			out.println("<h1>");
			out.println("This Session belongs to "+f_name+"<br><br>");
		%>
		
		<form action="Update" method="post">
			First Name<input type="text" name="ufname" value="<%= ub.getUser_fname()%>"><br>
			Last Name<input type="text" name="ulname" value="<%= ub.getUser_lname()%>"><br>
			Mail Id<input type="text" name="umail" value="<%= ub.getUser_mail()%>"><br>
			Phone Number<input type="text" name="uphone" value="<%= ub.getUser_phone()%>"><br>
			<input type="submit" value="Update">
		</form>
	</center>
</body>
</html>