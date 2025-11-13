package com.pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserLoginDAO {
	UserBean bean = null;
	public UserBean checkLogin(String userName, String password) {
		try {
			Connection con = DBConnect.connect();
			PreparedStatement pstmt = con.prepareStatement("Select * from registration where username=? and password=?");
			pstmt.setString(1, userName);
			pstmt.setString(2, password);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				bean = new UserBean();
				bean.setU_name(rs.getString(1));
				bean.setU_pwd(rs.getString(2));
				bean.setU_fname(rs.getString(3));
				bean.setU_lastname(rs.getString(4));
				bean.setU_mailid(rs.getString(5));
				bean.setU_phone(rs.getString(6));
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return bean;
	}
}
