// 3/9/25
// Implementing Callable Statement, procedure and functions
package com.pack1;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;
import java.sql.CallableStatement;

public class JdbcPro10 {
	String driver = "oracle.jdbc.OracleDriver";
	String DBurl = "jdbc:oracle:thin:@localhost:1521:orcl";
	String Uname = "MYDB11AM";
	String Upwd = "ABC";
	Scanner sc = new Scanner(System.in);
	
	// Callable Statement -> Procedure
	void meth1() {
		System.out.println("Implementing Callable Statement\n");
		
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(DBurl,Uname,Upwd);
			CallableStatement cstmt = con.prepareCall("{call InsertEmpDetails(?,?,?,?,?)}");
			
			System.out.println("Enter the user Id");
			String e_id = sc.nextLine();

			System.out.println("Enter the user name");
			String e_name = sc.nextLine();

			System.out.println("Enter the user designation");
			String e_desg = sc.nextLine();

			System.out.println("Enter the user base salary");
			int e_bsal = Integer.parseInt(sc.nextLine());
			
			float e_tsal = e_bsal + (0.35f*e_bsal)+(0.15f*e_bsal);
			
			cstmt.setString(1, e_id);
			cstmt.setString(2, e_name);
			cstmt.setString(3, e_desg);
			cstmt.setInt(4, e_bsal);
			cstmt.setFloat(5, e_tsal);
			
			cstmt.execute();
			System.out.println("Data Updated");
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	// 4/9/25
	void meth2() {
		System.out.println("Implementing Callable Statement : Procedure 2\n");
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(DBurl,Uname,Upwd);
			CallableStatement cstmt = con.prepareCall("{call ReteriveEmpData (?,?,?,?,?)}");
			
			System.out.println("Enter the employee id");
			String e_id = sc.nextLine();
			
			cstmt.setString(1,e_id);
			cstmt.registerOutParameter(2, Types.VARCHAR); // registerOutParameter(...) → prepare to receive data out (for OUT or IN OUT parameters).
			cstmt.registerOutParameter(3, Types.VARCHAR);
			cstmt.registerOutParameter(4, Types.NUMERIC);
			cstmt.registerOutParameter(5, Types.FLOAT);
			
			// Types is a class in java.sql package.
			// It contains constants that map SQL datatypes (from Oracle/MySQL/etc.) to JDBC datatypes.
			// You use them in registerOutParameter (and sometimes when working with result sets) so JDBC knows how to handle the database value.
			
			cstmt.execute();
			
			System.out.println("\n-----Employee Details------");
			System.out.println("EmpId : "+e_id);
			System.out.println("Emp Name : "+cstmt.getString(2));
			System.out.println("Emp Desg : "+cstmt.getString(3));
			System.out.println("Emp Basic Salary : "+cstmt.getString(4));
			System.out.println("Emp Total Salary : "+cstmt.getString(5));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	// Callable statement : function
	void meth3(){
		System.out.println("Implementing Callable statement : Function\n");
		
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(DBurl,Uname,Upwd);
			CallableStatement cstmt = con.prepareCall("{call ?:=ReteriveTotalSal(?)}");  //here first ? is for return value by function and second ? is for e_id
			
			System.out.println("Enter Employee Id");
			String e_id = sc.nextLine();
			
			cstmt.setString(2, e_id);
			cstmt.registerOutParameter(1, Types.FLOAT);
			
			cstmt.execute();
			
			System.out.println("\n-----Employee Details-----");
			System.out.println("Emp id : "+e_id);
			System.out.println("Emp total salary : "+cstmt.getFloat(1));
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		// new JdbcPro10().meth1();
		// new JdbcPro10().meth2();
		new JdbcPro10().meth3();
	}
}
