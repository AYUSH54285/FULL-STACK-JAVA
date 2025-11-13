package com.pack1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/edit")
public class EditProductServlet extends HttpServlet{
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		HttpSession session = req.getSession(false);
		if(session == null) {
			req.getRequestDispatcher("AdminLogin.html").forward(req, res);
		}
		else {
			String pcode = req.getParameter("pcode"); // getting the pcode while clicking on the edit option of list item
			ArrayList<ProductBean> al = (ArrayList<ProductBean>)session.getAttribute("ProductList"); // get contain in arraylist
			ProductBean pb = null; // create a object of ProductBean for containing all the details of respective pcode
			Iterator<ProductBean> i = al.iterator();
			while(i.hasNext()) {
				pb = i.next();
				if(pb.getpCode().equals(pcode)) {
					break;
				}
			}
			req.setAttribute("pbean", pb);
			req.getRequestDispatcher("EditProduct.jsp").forward(req, res);
		}
	}
}
