package com.pack1;

import java.sql.Connection;
import java.sql.DriverManager;

//creating connection with DBConnect class
public class DBConnect {
	public static Connection con = null;
	
	private DBConnect() {
		// we are making it private so that no object can be created
	}
	static {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection(DBInfo.DBurl,DBInfo.DBUname,DBInfo.DBpwd);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	public static Connection connect() {
		
		return con;
	}
}
