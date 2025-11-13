package com.pack1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/aes")
public class AddEmpServlet extends HttpServlet{ // this time we are using HttpServlet
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		EmpBean bean = new EmpBean();
		bean.setEmpId(req.getParameter("eid"));
		bean.setEmpFname(req.getParameter("efname"));
		bean.setEmpLname(req.getParameter("elname"));
		bean.setEmpSal(Integer.parseInt(req.getParameter("esal")));
		bean.setEmpAddress(req.getParameter("eaddr"));
		
		AddEmpDAO emp = new AddEmpDAO();
		int rowCount = emp.insertEMPdata(bean);
		if(rowCount > 0) {
			req.setAttribute("msg", "Data Inserted Successfully!!!<br><br>"); // setAttribute(key,value) method is used to send the data from servlet to jsp and in jsp we will get this data using getAttribute
			req.getRequestDispatcher("AddEMP.jsp").forward(req, res);
		}
		else {
			throw new RuntimeException("Data NOT Inserted!");
		}
	}
}
