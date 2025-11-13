////1/9/25
////understanding of scrollable resultSet, and methods of scrollable resultset
//package com.pack1;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.Statement;
//
//public class JdbcPro8 {
//	String driver = "oracle.jdbc.OracleDriver";
//	String DBurl = "jdbc:oracle:thin:@localhost:1521:orcl";
//	String Uname = "MYDB11AM";
//	String Upwd = "ABC";
//	
//	Connection connect() {
//		Connection con = null;
//		try {
//			Class.forName(driver);
//			con = DriverManager.getConnection(DBurl, Uname, Upwd);
//			System.out.println("Connection succeed");
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
//		return con;
//	}
//	void meth1() {
//		System.out.println("Implementing Scrollable Read-Only ResultSet");
//		Connection con = connect();
//		try {
//			Statement stmt = con.createStatement(1004,1007); //read-only
//			ResultSet rs = stmt.executeQuery("select * from employee");
//			rs.afterLast(); // Move cursor after the last row
//			while(rs.previous()) { //traverse backward and it Only works with a scrollable ResultSet (TYPE_SCROLL_INSENSITIVE or TYPE_SCROLL_SENSITIVE).
//				System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5));
//			}
//			
//			System.out.println();
//			rs.beforeFirst(); // It moves the cursor just before the first row of the ResultSet. This is useful if you want to reset the cursor and start iterating rows again from the beginning.
//
//			while(rs.next()) { // traverse forward
//				System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5));
//			}
//			
//			System.out.println();
//			rs.last();
//			System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5));
//
//			System.out.println();
//			rs.first();
//			System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5));
//
//			System.out.println();
//			rs.absolute(3); // adarsh specific row  // absolute means irrespective of cursor 
//			// while(rs.next())
//					System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5));
//
//			System.out.println();
//			rs.absolute(-2); //-2 indicates the position from last
//			System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5));
//			
//			System.out.println();
//			rs.relative(-1); // relative means respective of cursor.
//			System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5));
//
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
//	}
//	
//


//// 2/9/25
//	void meth2() {
//		System.out.println("Implementing Scrollable ResultSet from Statement Interface\n");
//		Connection con = connect();
//		try {
//			Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
//			ResultSet rs = stmt.executeQuery("select eid,efname,elname,esal from employee");
//			String emp_id = null;
//			while(rs.next()) {
//				emp_id = rs.getString(1);
//				if(emp_id.equals("103")) {
//					System.out.println("Updating the sal of employee having empid as : "+emp_id);
//					System.out.println("Previous sal is : "+rs.getInt("esal"));
//					rs.updateInt("esal", 80000);
//					rs.updateRow();
//					break;
//				}
//			}
//			System.out.println("Data Updated \n");
//			
//			Statement stmt2 = con.createStatement(); // it is default statement and it is not scrollable
//			ResultSet rs2 = stmt2.executeQuery("select * from employee where eid = '"+emp_id+"'");
//			while(rs2.next()) 
//			//if(rs2.last()) -> it will throw and sql exception because .last() works with only scrollable exception.
//			{
//				System.out.println(rs2.getString(1)+" "+rs2.getString(2)+" "+rs2.getString(3)+" "+rs2.getString(4)+" "+rs2.getString(5));
//			}
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
//	}
//	public static void main(String[] args) {
//		//new JdbcPro8().meth1();
//		new JdbcPro8().meth2();
//
//	}
//}






// resultSet has 3 drawbacks : 1st -> resultSet will not work during disconnected 
// 2nd -> resultSet is bydefault non-scrollable.
// 3rd -> resultSet is bydefault non updatable.

//package com.pack1;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.Statement;
//
//public class JdbcPro8 {
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
//			Statement stmt = con.createStatement(); 
//			System.out.println("Statement Object Created\n");
//			ResultSet rs = stmt.executeQuery(sqlQuery);
//			con.close(); // 1st point of resultSet drawbacks -> it will throw an exception
//			while(rs.next()) {  
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
//		new JdbcPro8().reteriveData();
//	}
//}




