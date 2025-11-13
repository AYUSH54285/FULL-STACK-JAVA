// 12/9/25
// Batch Processing
package com.pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcPro17 {
	String driver = "oracle.jdbc.OracleDriver";
	String DBurl = "jdbc:oracle:thin:@localhost:1521:orcl";
	String Uname = "MYDB11AM";
	String Upwd = "ABC";
	
	Scanner sc = new Scanner(System.in);
	void meth1() {
		System.out.println("Implementing Batch Processing");
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(DBurl,Uname,Upwd);
			//here we can only use "Statement" for Batch Processing, Prepare Statement and Callable Statement will not work with Batch Processing
			Statement stmt = con.createStatement();
			System.out.println("How many queries you want to enter?\n");
			int no_queries = Integer.parseInt(sc.nextLine());
			for(int i=1 ; i<=no_queries ; i++) {
				System.out.println("Enter your "+i+" query ");
				stmt.addBatch(sc.nextLine()); // don't put ; "semicolon" in the last of query 
			}
			int arr[] = stmt.executeBatch();
			
			System.out.println();
			for(int rowCount : arr) {
				System.out.println("====> "+rowCount+"<====");
			}
		stmt.clearBatch();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new JdbcPro17().meth1();
	}
}

//Enter your 1 query 
//create table emp11 (eid varchar2(10) primary key, ename varchar2(20))
//Enter your 2 query 
//create table pro11 (pid varchar2(10) primary key, pname varchar2(20))
//Enter your 3 query 
//insert into emp11 values('101','Kishan')
//Enter your 4 query 
//insert into pro11 values('101','S24 ultra')
