
// 28/8/25
//package com.pack1;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.Statement;
//
//public class JdbcPro2 {
//	String driver = "oracle.jdbc.OracleDriver";
//	String DBurl = "jdbc:oracle:thin:@localhost:1521:orcl";
//	String Uname = "MYDB11AM";
//	String Upwd = "ABC";
//	String sqlQuery = "select * from employee";
//	
//	void reteriveData() {
//		System.out.println("Using Statement Interface\n");
//		try {
//			Class.forName(driver);
//			Connection con = DriverManager.getConnection(DBurl,Uname,Upwd);
//			System.out.println("Connection created\n");
//			Statement stmt = con.createStatement(); // createStatement() is the method in connection interface, That Statement object can then be used to send SQL queries to the database.
//			System.out.println("Statement Object Created\n");
//			ResultSet rs = stmt.executeQuery(sqlQuery); // executeQuery("query") returns the resultSet
//			while(rs.next()) { // next() method will check next row 
//				//System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5)); // 1,2 3,4,5 is column number and we can print the column using column name also
//				System.out.println(rs.getString("EID")+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5));
//				//break;
//			}
//			rs.close();
//			
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
//	}
//	public static void main(String[] args) {
//		new JdbcPro2().reteriveData();
//	}
//}
