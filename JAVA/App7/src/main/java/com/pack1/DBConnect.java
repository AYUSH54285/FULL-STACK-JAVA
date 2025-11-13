package com.pack1;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect { // why we make it as class and not interface? -> An interface in Java is just a contract — it can declare methods but cannot contain implementation logic (except default or static methods, which still have limits).
	public static Connection con = null;
	private DBConnect() { // make a manual constructor as private so that no object can be created
		
	}
	static {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection(DBInfo.DBurl,DBInfo.DBUname,DBInfo.Upwd);
		}
		catch(Exception e) {
			e.printStackTrace();		}
	}
	public static Connection connect() {
		return con;
	}
}
