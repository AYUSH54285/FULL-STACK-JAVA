package com.pack1;

import java.sql.DriverManager;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Connection;
import java.sql.Statement;

public class JdbcPro4 {
	String driver = "oracle.jdbc.OracleDriver";
	String DBurl = "jdbc:oracle:thin:@localhost:1521:orcl";
	String Uname = "MYDB11AM";
	String Upwd = "ABC";
	
	String sqlQuery = "insert into employee values('108', 'Athena', 'June', 75000, 'Hyd')";
	void meth1() {
		System.out.println("Inserting the data in employee table");
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(DBurl, Uname, Upwd);
			System.out.println("Connection Created");
			Statement stmt = con.createStatement();
			System.out.println("Statement Object Created\n");
			int rowCount = stmt.executeUpdate(sqlQuery);
			if(rowCount==1) {
				System.out.println("Data Updated");
			}
			else {
				System.out.println("Data not updated");
			}
		}
		catch(SQLIntegrityConstraintViolationException sicve) {
			System.out.println("Duplicate EMPid are not allowed");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new JdbcPro4().meth1();
	}
}
