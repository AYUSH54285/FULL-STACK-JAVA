package com.pack1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/view")
public class ViewProfileServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		Cookie arr[] = req.getCookies(); // there are many cookies 
		String fname = null;
		if(arr == null) {
			req.setAttribute("msg","Session is Expired!!!");
			req.getRequestDispatcher("Register.jsp").forward(req, res);
		}
		else { 
			for(Cookie ck: arr) { // by using for each loop we can retrieve data from array
				if("ckname".equals(ck.getName())) { 
					fname = ck.getValue();
				}
			}
			req.setAttribute("fname", fname);
			req.getRequestDispatcher("ViewProfile.jsp").forward(req, res);
		}
	}
}
