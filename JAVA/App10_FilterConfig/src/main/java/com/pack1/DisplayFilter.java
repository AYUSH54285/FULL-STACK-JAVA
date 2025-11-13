package com.pack1;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class DisplayFilter implements Filter{
	
	public FilterConfig config = null;

	@Override
	public void init(FilterConfig config) {
		this.config = config;
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain fc)
			throws IOException, ServletException {
		req.setAttribute("filterName",config.getFilterName());
		req.setAttribute("msg", config.getInitParameter("msg"));
		req.getRequestDispatcher("Home.jsp").forward(req, res);
		
	}

}
