// 16/9/25 -> servlet demo(using Generic Servlet) , check index.html, check web.xml
// Servlet Interface is not much used that's why we started with Generic Servlet
package com.pack1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/fs") // in the index.html -> form tag and action attribute we use "fs" that's why we use fs here, "fs" is URL pattern
public class FirstServlet extends GenericServlet{
	@Override
	public void init() {
		System.out.println("Servlet Initialized");
	}
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		PrintWriter pw = res.getWriter();// pw with method println is used to give the output in webBrowser not in console
		res.setContentType("text/html");
		
		String user_name = req.getParameter("uname"); // same name is provided in parameter which we write in input tage name attribute
		String user_email=req.getParameter("umail");
		
		pw.println("<center><h1><br><br>");
		pw.println("*******Data From Html******");
		pw.println("<br>User Name: "+user_name);
		pw.println("<br>User E-mail: "+user_email);
		pw.println(" </h1></center>");
	}
	public void destroy() { // once the servlet close from the server then servlet will be destroyed and this method will run
		System.out.println("\nServlet Destroyed");
	}
}
