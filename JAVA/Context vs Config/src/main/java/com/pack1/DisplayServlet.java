package com.pack1;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// @WebServlet("/display") // commenting this for ServletConfig mapping beacuse url should be one weather in xml or servlet(that is here)
public class DisplayServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		ServletContext context = req.getServletContext();
		context.setAttribute("msg1", "Java is Awesome");
		
		//ServletConfig
		ServletConfig config = this.getServletConfig(); // this → refers to the current servlet instance.
														// getServletConfig() → is a method of the GenericServlet class (inherited by HttpServlet), which returns the ServletConfig object associated with this servlet.
		req.setAttribute("ServletName", config.getServletName());
		req.setAttribute("msg3", config.getInitParameter("msg3"));
		req.getRequestDispatcher("Display.jsp").forward(req,res);
	}
}
