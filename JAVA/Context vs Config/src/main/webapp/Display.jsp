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
		<h1>
			<%
				String name = request.getParameter("uname"); // taking the input field value directly into jsp and it is possible
				String msg1 = (String)application.getAttribute("msg1");
				String msg2 = application.getInitParameter("msg2");
				
				//servletConfig
				String servlet_name = (String)request.getAttribute("ServletName");
				String msg3 = (String)request.getAttribute("msg3");
				
				//servletContext
				out.println("Welcome "+name+"<br><br>");
				out.println("ServletContext : "+msg1+" (from Servlet)<br><br>");
				out.println("ServletContext : "+msg2+" (from web.xml)<br><br>");
				out.println("Server Information from ServletContext : "+application.getServerInfo()+" <br><br>");
				
				//servletConfig
				out.println("Servlet Name : "+servlet_name+" (from ServletConfig)<br><br>");
				out.println("Data from web.xml :"+msg3+" (from ServletConfig)<br><br>");
				
			%>
		</h1>
	</center>
</body>
</html>