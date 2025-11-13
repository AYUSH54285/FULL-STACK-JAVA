//1/9/25
//scrollable parameter -> type and mode
package com.pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class JdbcPro7 {
	String driver = "oracle.jdbc.OracleDriver";
	String DBurl = "jdbc:oracle:thin:@localhost:1521:orcl";
	String Uname = "MYDB11AM";
	String Upwd = "ABC";
	
	void meth1() {
		System.out.println("Implementing ResultSet Interface");
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(DBurl,Uname,Upwd);
			//Statement stmt1 = con.createStatement(ResultSet.TYPE_FORWARD_ONLY,ResultSet.CONCUR_READ_ONLY);
			//Statement stmt1 = con.createStatement(1003,1007);
			
			System.out.println("TYPE_FORWARD_ONLY : "+ResultSet.TYPE_FORWARD_ONLY); // --> we can use 1003 instead of writing "ResultSet.TYPE_FORWARD_ONLY" because "TYPE_FORWARD_ONLY" is static variable that's why it is access by ResultSet Interface and 1003 is static variable and it can be used in the place of that.  
			System.out.println("TYPE_SCROLL_INSENSITIVE : "+ResultSet.TYPE_SCROLL_INSENSITIVE); // ---> 1004
			System.out.println("TYPE_SCROLL_SENSITIVE : "+ResultSet.TYPE_SCROLL_SENSITIVE); // ---> 1005
			
			System.out.println("CONCUR_READ_ONLY : "+ResultSet.CONCUR_READ_ONLY); // --> 1007
			System.out.println("CONCUR_UPDATABLE : "+ResultSet.CONCUR_UPDATABLE); // --> 1008
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new JdbcPro7().meth1();
	}
}
