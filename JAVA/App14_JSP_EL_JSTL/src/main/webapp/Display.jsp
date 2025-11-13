<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<% pageContext.setAttribute("msg","Java is Awesome"); %>
	
	<c:set var="name" value="${param.uname}"/>
	Welcome: <c:out value="${name}"/><br><br>
	<c:set var="a" value="${applicationScope.a}"/>
	<c:set var="b" value="${sessionScope.b}"/>
	<c:set var="c" value="${requestScope.c}"/>
	<c:set var="d" value="${pageScope.msg}"/>
	
	ContextVal: <c:out value="${a}"/><br><br>
	SessionVal: <c:out value="${b}"/><br><br>
	RequestVal: <c:out value="${c}"/><br><br>
	PageVal: <c:out value="${d}"/><br><br>
</body>
</html>