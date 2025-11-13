package com.pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ViewEmpDAO {
	ArrayList<EmpBean> al = new ArrayList<EmpBean>();
	
	public ArrayList<EmpBean> reteriveEmpData(){
		try{
			Class.forName("oracle.jdbc.OracleDriver");
			Connection con = DBConnect.connect();
			PreparedStatement pstmt = con.prepareStatement("select * from employee");
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				EmpBean eb = new EmpBean();

				eb.setEmpId(rs.getString(1));
				eb.setEmpFname(rs.getString(2));
				eb.setEmpLname(rs.getString(3));
				eb.setEmpSal(rs.getInt(4));
				eb.setEmpAddress(rs.getString(5));
				al.add(eb);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return al;
	}
}
