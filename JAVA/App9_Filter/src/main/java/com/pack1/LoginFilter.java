package com.pack1;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/log") // here we use WebFilter insted of WebServlet and it should be same url with servlet
public class LoginFilter implements Filter {
	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain fc) throws IOException, ServletException{
		System.out.println("Step 1");
		UserBean bean = new UserLoginDAO().checkLogin(req.getParameter("uname"), req.getParameter("upwd"));
		if(bean == null) {
			throw new RuntimeException("Invalid Credentials!!");
		}
		else {
			req.setAttribute("UserBean",bean);
			fc.doFilter(req, res); //It is used to link the request to the servlet
		}
	}


}
