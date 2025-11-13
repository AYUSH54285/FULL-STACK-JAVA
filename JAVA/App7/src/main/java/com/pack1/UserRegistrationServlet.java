package com.pack1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/reg")
public class UserRegistrationServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		UserBean b = new UserBean();
		b.setUser_name(req.getParameter("uname"));
		b.setUser_password(req.getParameter("upwd"));
		b.setUser_fname(req.getParameter("fname"));
		b.setUser_lname(req.getParameter("lname"));
		b.setUser_mail(req.getParameter("umail"));
		b.setUser_phone(req.getParameter("uphone"));
		
		UserRegisterDAO regDAO = new UserRegisterDAO();
		int rowCount = regDAO.insertUserData(b);
		
		if(rowCount>0) {
			req.setAttribute("msg", "User Registration Successfully!!");
			req.getRequestDispatcher("Register.jsp").forward(req, res);
		}
		else {
			req.setAttribute("msg", "User Registration Failed!!");
			req.getRequestDispatcher("Register.jsp").forward(req, res);
		}
		
	}
}
