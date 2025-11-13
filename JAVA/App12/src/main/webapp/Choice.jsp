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
			<%
				String choice = request.getParameter("choice");
				if(choice.equals("Add")){
			%>
				<jsp:forward page="Addition.jsp">
					<jsp:param name="data" value = "<%= new java.util.Date() %>" />
				</jsp:forward>
			<%
				}
				else{
			%>
				<jsp:forward page="Substraction.jsp"></jsp:forward>
			<%
				}
			%>
	</center>
</body>
</html>