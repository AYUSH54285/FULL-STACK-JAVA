
//5/9/25
//Transaction Management
package com.pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Savepoint;
import java.util.Scanner;

public class JdbcPro12 {
	String driver = "oracle.jdbc.OracleDriver";
	String DBurl = "jdbc:oracle:thin:@localhost:1521:orcl";
	String Uname = "MYDB11AM";
	String Upwd = "ABC";
	Scanner sc = new Scanner(System.in);
	
	Connection connect() {
		Connection con = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(DBurl,Uname,Upwd);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	}
	void ticketBooking() {
		System.out.println("Implemented Transaction Management");
		String sqlQuery1 = "UPDATE TrainSeatAvailability SET available_seats = available_seats - 1 WHERE train_id = ? AND journey_date = ? AND class = ? AND available_seats > 0";
		String sqlQuery2 = "Insert into BookingDetails values (?,?,?,?,?)";
		String sqlQuery3 = "select payment_status from customerpayment where customer_id=?";
		String sqlQuery4 = "Update BookingDetails set status='Confirmed' where BOOKING_ID =?";
		try {
			Connection con = connect();
			con.setAutoCommit(false);
			System.out.println("getAutoCommit() : "+con.getAutoCommit() + "\n");
			
			PreparedStatement pstmt1 = con.prepareStatement(sqlQuery1);
			
			
//			System.out.println("enter the Train Number : ");
//			String train_id  = sc.nextLine();
//			
//			System.out.println("enter the Journey Date : ");
//			String journey_date = sc.nextLine();
//			
//			System.out.println("enter the class of seat :");
//			String seat_class = sc.nextLine();
//			
//			pstmt1.setString(1, train_id.trim());
//			pstmt1.setString(2, journey_date.trim());
//			pstmt1.setString(3, seat_class.trim().toLowerCase());
			
			//or
			
			pstmt1.setString(1, "12345");
			pstmt1.setString(2, "2024-10-10");
			pstmt1.setString(3, "sleeper");
			
			int rowCount = pstmt1.executeUpdate();
			
			System.out.println(rowCount);
			if(rowCount == 0) {
				System.out.println("checking");
				throw new RuntimeException("Seat not locked");
			 }
			System.out.println("Seat Locked");
			
			//6/9/25
			Savepoint sp = con.setSavepoint(); // Creating a savepoint for our program so that there is any problem occured , our program will be rolling back to this point
			//con.commit(); // we are not commiting now because only seat locked not payment is done for seat so we are not providing the seat at this point
			
			PreparedStatement pstmt2 = con.prepareStatement(sqlQuery2);
			pstmt2.setString(1, "B101");
			pstmt2.setString(2, "12345");
			pstmt2.setString(3, "C123");
			pstmt2.setInt(4, 1);
			pstmt2.setString(5, "Payment Pending");
			int rowCount2 = pstmt2.executeUpdate();
			if(rowCount2==0) {
				throw new RuntimeException("Booking Failed");
			}
			System.out.println("Booking Success\nwaiting for Payment Confirmation!!");
			
			PreparedStatement pstmt3 = con.prepareStatement(sqlQuery3);
			pstmt3.setString(1, "C123");
			ResultSet rs = pstmt3.executeQuery();
			String status = "Failed";
			if(rs.next()) {
				status = rs.getString(1);
				if(status.equalsIgnoreCase("Success")) {
					System.out.println("Payment Done!!");
					//updating the booking details beacuse payment status is success 
					PreparedStatement pstmt4 = con.prepareStatement(sqlQuery4);
					pstmt4.setString(1, "B101");
					int rowCount3 = pstmt4.executeUpdate();
					if(rowCount3==0) {
						throw new RuntimeException("Transaction not success");
					}
					System.out.println("Transaction success");
					con.commit();
					System.out.println("All the savepoints are released");
				}
			}
			else {
				System.out.println("Payment Failed");
				System.out.println("Transaction rolling back to last savepoints ");
				con.rollback(sp); 
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new JdbcPro12().ticketBooking();
	}
}
