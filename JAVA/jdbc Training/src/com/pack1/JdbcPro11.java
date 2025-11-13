//5/9/25
//Transaction Management

package com.pack1;
import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcPro11 {
	String driver = "oracle.jdbc.OracleDriver";
	String DBurl = "jdbc:oracle:thin:@localhost:1521:orcl";
	String Uname = "MYDB11AM";
	String Upwd = "ABC";
	
	void meth1() {
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(DBurl,Uname,Upwd);
			System.out.println("getAutoCommit() : "+con.getAutoCommit()); //by default commit is true and we have to control it manually 
			con.setAutoCommit(false); // hence here we are making the commit false using setAutoCommit
			System.out.println("getAutoCommit() : "+con.getAutoCommit()); //false
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new JdbcPro11().meth1();
	}
}
