//Connection Pooling
//Check ConnectionPool
package com.pack1;

import java.sql.Connection;

public class JdbcPro13{
	String driver = "oracle.jdbc.OracleDriver";
	String DBurl = "jdbc:oracle:thin:@localhost:1521:orcl";
	String Uname = "MYDB11AM";
	String Upwd = "ABC";
	
	ConnectionPool cp = new ConnectionPool(DBurl,Uname,Upwd);
	
	void meth1() {
		System.out.println("Implementing Connetion Pooling\n");
		cp.con_Initialization(); //connections Initialisation
		
		System.out.println("######## User-1 ########");
		Connection con1 = cp.con_Acquisition();
		System.out.println("User-1 acquired the Connection Object");
		System.out.println("Connection Pool Size : "+cp.v.size());
		
		System.out.println("######## User-2 ########");
		Connection con2 = cp.con_Acquisition();
		System.out.println("User-2 acquired the Connection Object");
		System.out.println("Connection Pool Size : "+cp.v.size());
		
		System.out.println("######## User-3 ########");
		Connection con3 = cp.con_Acquisition();
		System.out.println("User-3 acquired the Connection Object");
		System.out.println("Connection Pool Size : "+cp.v.size());
		
		
		cp.con_returns(con1);
		cp.con_returns(con2);
		cp.con_returns(con3);
	}
	public static void main(String[] args) {
		new JdbcPro13().meth1();
	}
}