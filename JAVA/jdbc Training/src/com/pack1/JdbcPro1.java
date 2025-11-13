

//package com.pack1;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//
//public class JdbcPro1 {
//	
//	String driver = "oracle.jdbc.OracleDriver";
//	String DBurl = "jdbc:oracle:thin:@localhost:1521:orcl";
//	String Uname = "MYDB11AM";
//	String Upwd = "ABC";
//	
//	
//	void meth1() {
//		System.out.println("Connecting to the database");
//		
//		try {
//			Class.forName(driver); //Loading the driver
//			Connection con = DriverManager.getConnection(DBurl, Uname, Upwd);//Establishing the connection
//			System.out.println("Connection created");
//			con.close(); //closing the connection
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
//	}
//	public static void main(String[] args) {
//		new JdbcPro1().meth1();
//	}
//}
