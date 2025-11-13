// 18/9/25
package com.pack1;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/formSubmit")
public class EmpServlet extends GenericServlet {
	@Override
	public void init() {
		System.out.println("Servlet Initialistaion");
	}
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException{
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		
		String Ename = req.getParameter("ename");
		int EId = Integer.parseInt(req.getParameter("eid"));
		double ESal = Double.parseDouble(req.getParameter("esal"));
		int EExp = Integer.parseInt(req.getParameter("eexp"));
		
		if(EExp>=5) {
			ESal = ESal + ((ESal*10)/100);
		}
		
		pw.println("<center><h1><br><br>");
		pw.println("*********Employee Details*********");
		pw.println("<br>EmpName : "+Ename);
		pw.println("<br>EmpId :"+EId);
		pw.println("<br>EmpSal :"+ESal);
		pw.println("<br>EmpExp :"+EExp);
		pw.println("</h1></center>");

	}
	@Override
	public void destroy() {
		System.out.println("\nServlet Destroyed");
	}
}
