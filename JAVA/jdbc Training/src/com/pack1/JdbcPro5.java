//26/5/25

//Task
//1. reterive all data from the employee table
//2. Inserting the data into the table
//3. reteriving the specific data from the database(basing empId)
//4. updating specific data in the database (basing on empId ===> empSal)
//5. deleting the specific data from the database(basing on empID)

//package com.pack1;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.Statement;
//import java.sql.ResultSet;
//import java.sql.SQLIntegrityConstraintViolationException;
//import java.util.Scanner;
//
//
//public class JdbcPro5 {
//	static String driver = "oracle.jdbc.OracleDriver";
//	static String DBurl = "jdbc:oracle:thin:@localhost:1521:orcl";
//	static String Uname = "MYDB11AM";
//	static String Upwd = "ABC";
//	String SQLquery1 = "select * from employee";
//	Scanner sc  = new Scanner(System.in);
//	String SQLquery2 = "insert into employee values('109','Ram','Kumar',10000,'UP')";
//	String SQLquery3 = "select * from employee where eid='101'";
//	String SQLQuery4 = "update employee set esal=5000 where eid='101'";
//	String SqlQuery5 = "delete from employee where empId='109'";
//	
//	public static Connection connect() {
//		Connection con  = null;
//		try {
//			Class.forName(driver);
//			con = DriverManager.getConnection(DBurl,Uname,Upwd);
//	        System.out.println("Connection successful");
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
//		return con;
//	}
//	
//	
//	void meth1() {
//		System.out.println("reteriving all data from the employee table");
//		try {
//			Class.forName(driver);
//			Connection con = DriverManager.getConnection(DBurl,Uname,Upwd);
//			System.out.println("Connection Created");
//			Statement stmt = con.createStatement();
//			System.out.println("Statement created");
//			ResultSet rs = stmt.executeQuery(SQLquery1);
//			int columnCount = rs.getMetaData().getColumnCount();//getMetaData() it return the object which have the information about the structure of the result like number of column, column names, column types etc.
//			// getColumnCount() -> it gives the total number of columns int the resultSet
//			while(rs.next()) {
//				for(int i=1 ; i<=columnCount ; i++) {
//					System.out.print(rs.getString(i)+"\t");
//				}
//				System.out.println();
//			}
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
//	}
//	
//	void meth2() {
//		System.out.println("inserting the data into the employee table");
//		try {
//			Class.forName(driver);
//			Connection con = DriverManager.getConnection(DBurl,Uname,Upwd);
//			System.out.println("Connection Created");
//			Statement stmt = con.createStatement();
//			int rowCount = stmt.executeUpdate(SQLquery2);
//			if(rowCount==1) {
//				System.out.println("Data Updated");
//				System.out.println("Do you want to visit the data (Yes/No)");
//				if(sc.nextLine().toLowerCase().equals("Yes")) {
//					meth1();
//				}
//				else {
//					System.exit(0);
//				}
//			}
//		}
//		catch(SQLIntegrityConstraintViolationException sicve) {
//			System.out.println("Duplicate EMPid are not allowed");
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
//	}
//	
//	void meth3() {
//		System.out.println("reteriving the specific data from the database(basing empId)");
//		System.out.println("Enter employee Id");
//		String empID  =  sc.nextLine();
//		Connection con = connect();
//		try {
//			Statement stmt = con.createStatement();
//			ResultSet rs = stmt.executeQuery("select * from employee where eid='"+empID+"'");
//			if(rs.next()) {
//				System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5));
//			}
//			else {
//				System.out.println("There is no record with "+empID);
//			}
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
//		System.out.println("\nRecord Reterived");
//	}
//	
//	void meth4() {
//		System.out.println("updating specific data in the database (basing on empId ===> empSal)");
//		System.out.println("Enter employee ID");
//		String empId = sc.nextLine();
//		System.out.println("Enter the new salary of the empId='"+empId+"'");
//		int empSal = Integer.parseInt(sc.nextLine());
//		
//		Connection con = connect();
//		try {
//			Statement stmt = con.createStatement();
//			int rowCount = stmt.executeUpdate("update employee set esal="+empSal+" where eid='"+empId+"'");
//			if(rowCount==1) {
//				System.out.println("Data Updated");
//			}
//			else {
//				System.out.println("data not updated");
//			}
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
//	}
//	
//	void meth5() {
//		System.out.println("deleting the specific data from the database(basing on empID)");
//		System.out.println("Enter the empId which you want to delete from table");
//		int empId = Integer.parseInt(sc.nextLine());
//		
//		Connection con = connect();
//		try {
//			Statement stmt = con.createStatement();
//			int rowCount = stmt.executeUpdate("delete from employee where eid='"+empId+"'");
//			if(rowCount == 1) {
//				System.out.println("Data deleted");
//			}
//			else {
//				System.out.println("data not deleted");
//			}
//			con.close();
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
//	}
//	
//	public static void main(String[] args) {
//		//new JdbcPro5().meth1();
//		//new JdbcPro5().meth2();
//		//new JdbcPro5().meth3();
//		//new JdbcPro5().meth4();
//		new JdbcPro5().meth5();
//	}
//	
//}


// Task : Implement a Library management System Using JDBC
//package com.pack1;
//
//import java.util.Scanner;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.Statement;
//import java.sql.SQLIntegrityConstraintViolationException;
//import java.sql.ResultSet;
//
//
//public class JdbcPro5{
//	static Scanner sc = new Scanner(System.in);
//	static String driver = "oracle.jdbc.OracleDriver";
//	static String DBurl = "jdbc:oracle:thin:@localhost:1521:orcl";
//	static String Uname = "MYDB11AM";
//	static String Upwd = "ABC"; 
//	
//	public static Connection connect() {
//		Connection conn = null;
//		try {
//			Class.forName(driver);
//			conn = DriverManager.getConnection(DBurl,Uname,Upwd);
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
//		return conn;
//	}
//	
//	
//	public static void addBook(int id1, String name, String author, String genre, double cost){
//		String query = "insert into Library(bookId, bookName, author, genre, bookCost) values ("+id1+",'"+name+"','"+author+"','"+genre+"',"+cost+")";
//		Connection conn = connect();
//		try {
//			Statement stmt = conn.createStatement();
//			int rowCount = stmt.executeUpdate(query);
//			if(rowCount > 0) {
//				System.out.println("Book added Successfully");
//			}
//			System.out.println();
//		}
//		catch(SQLIntegrityConstraintViolationException e) {
//			System.out.println("Book with this ID already exists");
//		}
//		catch(Exception e){
//			e.printStackTrace();
//		}
//	}
//	
//	
//	public static void displayBook(int id2) {
//		String query = "select * from Library where bookId='"+id2+"'";
//		Connection conn = connect();
//		try {
//			Statement stmt = conn.createStatement();
//			ResultSet rs = stmt.executeQuery(query);
//			while(rs.next()) {
//				System.out.println(rs.getInt("bookId") + " | " +
//                        rs.getString("bookName") + " | " +
//                        rs.getString("author") + " | " +
//                        rs.getString("genre") + " | " +
//                        rs.getDouble("bookCost"));
//				break;
//			}
//			System.out.println();
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
//	}
//	
//	
//	public static void deleteBook(int deleteId) {
//		String query = "delete from Library where bookId = '"+deleteId+"'";
//		Connection conn = connect();
//		try {
//			Statement stmt = conn.createStatement();
//			int rowCount = stmt.executeUpdate(query);
//			if(rowCount>0) {
//				System.out.println(" Book deleted successfully! ");
//			}
//			else {
//                System.out.println("❌ No book found with ID " + deleteId);
//			}
//			System.out.println();
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
//	}
//	
//	
//	public static void allBook() {
//		String query = "Select * from Library";
//		Connection conn = connect();
//		try {
//			Statement stmt = conn.createStatement();
//			ResultSet rs = stmt.executeQuery(query);
//			int columnCount = rs.getMetaData().getColumnCount();
//			while(rs.next()) {
//				for(int i=1 ; i<=columnCount ; i++) {
//					System.out.print(rs.getString(i)+"\t");
//				}
//				System.out.println();
//			}
//			System.out.println();
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
//	}
//	
//	public static void main(String[] args) {
//		int choice;
//		do {
//			System.out.println("Welcome to Library Management System");
//			System.out.println("1. Add Book");
//			System.out.println("2. Display Book");
//			System.out.println("3. Delete Book");
//			System.out.println("4. Display all Books");
//			System.out.println("5. Exit");
//			System.out.println("Enter your Choice: ");
//			choice = sc.nextInt();
//			
//			switch(choice) {
//			case 1:
//				System.out.println("Enter the Book ID: ");
//				int id1 = sc.nextInt();
//				sc.nextLine();
//				System.out.println("Enter the Book Name: ");
//				String name = sc.nextLine();
//				System.out.println("Enter Author: ");
//				String author = sc.nextLine();
//				System.out.println("Enter Genre: ");
//				String genre = sc.nextLine();
//				System.out.println("Enter Cost: ");
//				double cost = sc.nextDouble();
//				addBook(id1, name, author, genre, cost);
//				break;
//
//			case 2:
//				System.out.println("enter the book id");
//				int id2 = sc.nextInt();
//				sc.nextLine();
//				displayBook(id2);
//				break;
//			
//			case 3:
//				System.out.println("Enter the book id to delete: ");
//				int deleteId = sc.nextInt();
//				deleteBook(deleteId);
//				break;
//			
//			case 4:
//				System.out.println("Please wait");
//				System.out.println();
//				allBook();
//				break;
//				
//			case 5:
//				System.out.println("👋 Exiting... Goodbye!");
//				break;
//				
//			default:
//				System.out.println("Invalid Choice ! Try again.");
//			
//			}
//			
//		}while(choice != 5);
//		
//		sc.close();
//	}
//}
