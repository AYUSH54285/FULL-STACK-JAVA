//11/9/25
// Streams with JDBC -> Byte Stream and Character Stream / BLOB and CLOB
package com.pack1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JdbcPro15 {
	String driver =  "oracle.jdbc.OracleDriver";
	String DBurl = "jdbc:oracle:thin:@localhost:1521:orcl";
	String Uname = "MYDB11AM";
	String Upwd = "ABC";
	
	String sqlQuery1 = "Insert into mydata values(?,?)";
	String sqlQuery2 = "Select pic_data from mydata where id=?";
	void meth1() {
		System.out.println("Implementing BLOB interface");
		try {
			
			Class.forName(driver);
			Connection con = DriverManager.getConnection(DBurl,Uname,Upwd);
			
			// put the image into database
			PreparedStatement pstmt = con.prepareStatement(sqlQuery1);
			pstmt.setString(1, "101");
			
			FileInputStream fis = new FileInputStream("D:\\STUDY\\JAVA FULL STACK\\JAVA\\image.png");
			pstmt.setBlob(2, fis, fis.available()); // fis.available() -> the return type of this method is int and it tells how many bytes are left there to save into database
			
			int rowCount = pstmt.executeUpdate();
			if(rowCount>0) {
				System.out.println("Image saved into the database");
			}
			else {
				System.out.println("Image not saved into the database!");
			}
			
			// Retrieved and copy the image in image_copy
			PreparedStatement pstmt2 = con.prepareStatement(sqlQuery2);
			pstmt2.setString(1,"101");
			ResultSet rs = pstmt2.executeQuery();
			if(rs.next()) {
				Blob b = rs.getBlob(1);
				byte arr[] = b.getBytes(1,(int)b.length());
				FileOutputStream fos = new FileOutputStream("D:\\STUDY\\JAVA FULL STACK\\JAVA\\image_copy.png");
				fos.write(arr);
				fos.close();
				System.out.println("Image Reterived and saved in ===> D:\\STUDY\\JAVA FULL STACK\\JAVA\\image_copy.png");
			}
			else {
				System.out.println("Data is missing!!");
			}
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	void meth2() {
		
	}
	public static void main(String[] args) {
		new JdbcPro15().meth1();
	}
}
