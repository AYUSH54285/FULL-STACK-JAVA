//30/8/25

package com.pack1;
import java.util.Scanner;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;  

public class JdbcPro6 {
	String driver = "oracle.jdbc.OracleDriver";
	String DBurl = "jdbc:oracle:thin:@localhost:1521:orcl";
	String Uname = "MYDB11AM";
	String Upwd = "ABC";
	Scanner sc = new Scanner(System.in);
	
	Connection connect() {
		Connection con = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(DBurl, Uname, Upwd);
			System.out.println("Connection succeed");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	}
	void AddingPatient() {
		Connection con = connect();
		try {
			PreparedStatement pstmt1 = con.prepareStatement("insert into patient values(?,?,?,?)");
			System.out.println("Enter the Patient details:\n ");
			System.out.println("enter the patient id");
			String pat_id = sc.nextLine();
			System.out.println("enter the patient name");
			String pat_name = sc.nextLine();
			System.out.println("enter the patient age");
			int pat_age = Integer.parseInt(sc.nextLine());
			System.out.println("enter the patient contact");
			long pat_contact = Long.parseLong(sc.nextLine());
			
			pstmt1.setString(1,pat_id); // 1 represents first question mark in "insert into patient values(?,?,?,?)"
			pstmt1.setString(2,pat_name); // 2 represents second question mark 
			pstmt1.setInt(3,pat_age);
			pstmt1.setLong(4,pat_contact);
			
			int rowCount = pstmt1.executeUpdate();
			if(rowCount > 0) {
				System.out.println("Patient Record Inserted");
			}
			else {
				System.out.println("Patient Record NOT Inserted");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}
	void viewPatient() {
		Connection con = connect();
		try {
			PreparedStatement pstmt2 = con.prepareStatement("select * from patient");
			System.out.println("Reteriving the patient table data\n");
			ResultSet rs = pstmt2.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getLong(4));
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	void reterivePatientData() {
		Connection con = connect();
		try {
			PreparedStatement pstmt3 = con.prepareStatement("select * from patient where pid=?");
			System.out.println("Reteriving the patient data basing on 'pid'\n");
			System.out.println("Enter the Patient ID");
			String pat_id2 = sc.nextLine();
			pstmt3.setString(1, pat_id2); // setting the value to sql query
			ResultSet rs2 = pstmt3.executeQuery();
			if(rs2.next()) {
				System.out.println(rs2.getString(1)+" "+rs2.getString(2)+" "+rs2.getString(3)+" "+rs2.getString(4));
			}
			else {
				System.out.println("Data is not avlaible with patient id : "+pat_id2+"");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	void UpdatePatientData() {
		Connection con = connect();
		try {
			PreparedStatement pstmt4 = con.prepareStatement("update patient set pid=? where pname=?");
			System.out.println("Updating the patinet id basing upon the patient name\n");
			System.out.println("Please enter the patient name:");
			String pat_name2 = sc.nextLine();
			System.out.println("Please enter the new patient id for updating");
			String pat_id3 = sc.nextLine();
			pstmt4.setString(1, pat_id3);
			pstmt4.setString(2, pat_name2);
			int rowCount2 = pstmt4.executeUpdate();
			if(rowCount2>0) {
				System.out.println("Patient record updated");
			}
			else {
				System.out.println("Patient record not updated");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	void DeletePatientData() {
		Connection con = connect();
		try {
			PreparedStatement pstmt5 = con.prepareStatement("Delete from patient where pid=?");
			System.out.println("Deleting patient data basing on pid\n");
			System.out.println("Enter the patient id which data you want to delete");
			String pat_id4 = sc.nextLine();
			pstmt5.setString(1, pat_id4);
			int rowCount3 = pstmt5.executeUpdate();
			System.out.println();
			if(rowCount3>0) {
				System.out.println("Patient record is deleted");
			}
			else {
				System.out.println("Patient record is not deleted");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	void patientOperations() {
		while(true) {
			System.out.println("Welcome to Patient database");
			System.out.println("1. Add Patient\n2. View Patients data\n3. Reterive Patient data\n4. Update Patient data\n5. Delete Patient data\n6. Exit\n");
			System.out.println("Enter Your choice");
			int choice = Integer.parseInt(sc.nextLine());
			switch(choice) {
			case 1:
				AddingPatient();
				break;
			case 2:
				viewPatient();
				break;
			case 3:
				reterivePatientData();
				break;
			case 4:
				UpdatePatientData();
				break;
			case 5:
				DeletePatientData();
				break;
			case 6:
				System.out.println("Thank you see you soon!!!");
				System.exit(0);
				break;
			default:
				System.out.println("<<<<<Enter the valid Input>>>>>\n");
			}
		}
	}
	public static void main(String[] args) {
		new JdbcPro6().patientOperations();
	}
}
