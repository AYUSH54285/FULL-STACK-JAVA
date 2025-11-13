
package com.pack1;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Login")
public class UserLoginServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		UserLoginDAO ul_dao = new UserLoginDAO();
		UserBean bean = ul_dao.checkLogin(req.getParameter("uname"),req.getParameter("upwd")); 
		if(bean==null) {
			req.setAttribute("msg", "Invalid Credentials!!");
			req.getRequestDispatcher("Register.jsp").forward(req, res);
		}
		else {
			ServletContext context = req.getServletContext(); // getting the object of ServletContext 
			context.setAttribute("ubean", bean); // making it available for all the parts of project like servlet and jsp etc
			Cookie ck = new Cookie("ckname",bean.getUser_name()); // creating a cookie and it's key is ckname and vlaue is user_name
			res.addCookie(ck); //Sends that cookie to the client’s browser. On future requests, the browser automatically sends it back to the server.
			req.getRequestDispatcher("Home.jsp").forward(req, res);
		}
	}
}
