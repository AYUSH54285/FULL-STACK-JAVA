package com.pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;

// AddEmpDAO is used for pass the data into database
public class AddEmpDAO {
	public int insertEMPdata(EmpBean eb) { // getting the data from the 
		int rowCount = 0;
		try {
			Connection con = DBConnect.connect();
			PreparedStatement pstmt = con.prepareStatement("insert into employee values(?,?,?,?,?)");
			pstmt.setString(1, eb.getEmpId()); // getting the details from EmpBean, using EmpBean object and getter method for getting the data
			pstmt.setString(2, eb.getEmpFname());
			pstmt.setString(3, eb.getEmpLname());
			pstmt.setInt(4, eb.getEmpSal());
			pstmt.setString(5, eb.getEmpAddress());
			
			rowCount  = pstmt.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return rowCount;
	}
}
