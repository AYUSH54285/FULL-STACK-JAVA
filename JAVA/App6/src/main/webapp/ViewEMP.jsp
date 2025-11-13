<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="java.util.ArrayList, java.util.Iterator, com.pack1.EmpBean" %> <!-- we have to import these otherwise we will get errors -->
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center>
	<%
		ArrayList<EmpBean> al = (ArrayList<EmpBean>)request.getAttribute("list");
		if(al.size()==0){
			out.println("Data is NOT available in the Employee table<br><br>");
		}
		else{
			Iterator<EmpBean> i = al.iterator();
			while(i.hasNext()){
				EmpBean eb = i.next();
				out.println(eb.getEmpId()+" "+eb.getEmpFname()+" "+eb.getEmpLname()+" "+eb.getEmpSal()+" "+eb.getEmpAddress()+"<br>");
			}
		}
	%>
	</center>
	
	<jsp:include page="index.html"/>
</body>
</html>