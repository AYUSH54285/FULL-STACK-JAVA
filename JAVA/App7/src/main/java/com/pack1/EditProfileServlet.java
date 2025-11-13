package com.pack1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Edit")
public class EditProfileServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		Cookie arr[] = req.getCookies();
		String fname = null;
		if(arr==null) {
			req.setAttribute("msg", "Session is Expired!!!");
			req.getRequestDispatcher("Register.jsp").forward(req, res);
		}
		else {
			for(Cookie ck : arr) {
				if("ckname".equals(ck.getName())) {
					fname = ck.getValue();
				}
			}
			req.setAttribute("fname", fname);
			req.getRequestDispatcher("EditProfile.jsp").forward(req, res);
		}
	}
	
}
