package com.pack1;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Iterator;
import java.util.TreeSet;

public class JdbcPro3 {
	String driver = "oracle.jdbc.OracleDriver";
	String DBurl = "jdbc:oracle:thin:@localhost:1521:orcl";
	String Uname = "MYDB11AM";
	String Upwd = "ABC";
	String sqlQuery = "select * from employee";
	
	void meth1() {
		System.out.println("meth1() called");
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(DBurl,Uname,Upwd);
			System.out.println("Connection Created");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sqlQuery);
			TreeSet<Object> ts = new TreeSet<Object>();
			while(rs.next()) {
				//System.out.println(rs.getString(1));
				ts.add(rs.getString(1));
			}
			//System.out.println("EmpIds in ascending order : "+ts);
			
			System.out.println("EmpIds in ascending order : ");
			for(Object o:ts) {
				System.out.println(o+" ");
			}
			
			System.out.println("EmpIds in descending order : ");
			Iterator<Object> i = ts.descendingIterator();
			while(i.hasNext()) {
				System.out.println(i.next()+" ");
			}
			
			con.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new JdbcPro3().meth1();
	}
	
}
