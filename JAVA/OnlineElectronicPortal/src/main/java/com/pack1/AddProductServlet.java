//package com.pack1;
//
//import java.io.IOException;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//
//@WebServlet("/aps")
//public class AddProductServlet extends HttpServlet{
//	@Override
//	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
//		HttpSession session = req.getSession(false); // using "false" in parameter means not create new session , use the already working session
//		if(session == null) {
//			req.getRequestDispatcher("AdminLogin.html").forward(req, res);
//		}
//		else {
//			// add values in object
//			ProductBean pb = new ProductBean();
//			pb.setpCode(req.getParameter("pcode"));
//			pb.setpName(req.getParameter("pname"));
//			pb.setpCompany(req.getParameter("pCompany"));
//			pb.setpPrice(req.getParameter("pprice"));
//			pb.setpQty(req.getParameter("pqty"));
//			
//			// inserting values in database
//			int rowCount = new AddProductDAO().insertProduct(pb);
//			
//			//checking rowCount
//			if(rowCount == 0) {
//				throw new RuntimeException("Product data not inserted");
//			}
//			else {
//				req.setAttribute("msg", "Product inserted Successfully!!");
//				req.getRequestDispatcher("AddProduct.jsp").forward(req, res);
//			}
//		}
//	}
//}



// here we update the code for showing the error message with error code in Error.jszpz
package com.pack1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/aps")
public class AddProductServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		try {
			HttpSession session = req.getSession(false); // using "false" in parameter means not create new session , use the already working session
			if(session == null) {
				req.getRequestDispatcher("AdminLogin.html").forward(req, res);
			}
			else {
				// add values in object
				ProductBean pb = new ProductBean();
				pb.setpCode(req.getParameter("pcode"));
				pb.setpName(req.getParameter("pname"));
				pb.setpCompany(req.getParameter("pCompany"));
				pb.setpPrice(req.getParameter("pprice"));
				pb.setpQty(req.getParameter("pqty"));
				
				// inserting values in database
				int rowCount = new AddProductDAO().insertProduct(pb);
				
				//checking rowCount
				if(rowCount == 0) {
					throw new RuntimeException("Product data not inserted");
				}
				else {
					req.setAttribute("msg", "Product inserted Successfully!!");
					req.getRequestDispatcher("AddProduct.jsp").forward(req, res);
				}
			}
		}
		catch(Exception e) {
			req.setAttribute("msg", "Duplicate Product id are not inserted!!");
			req.getRequestDispatcher("Error.jsp").forward(req, res);
		}
	}
}




