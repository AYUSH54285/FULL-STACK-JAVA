package com.pack1;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/view") // by default it is "get" method 
public class ViewEmployeeServlet extends HttpServlet{
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException , IOException{ // we use doGet beacause in .html file we use URL that is "view" and by default this way is GET 
		ViewEmpDAO viewObj = new ViewEmpDAO();
		ArrayList<EmpBean> al = viewObj.reteriveEmpData();
		
		req.setAttribute("list", al);
		req.getRequestDispatcher("ViewEMP.jsp").forward(req, res);
	}
}
