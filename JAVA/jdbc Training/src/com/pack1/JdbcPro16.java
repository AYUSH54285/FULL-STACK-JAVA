// BLOB

package com.pack1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcPro16 {
	String driver = "oracle.jdbc.OracleDriver";
	String DBurl = "jdbc:oracle:thin:@localhost:1521:orcl";
	String Uname = "MYDB11AM";
	String Upwd = "ABC";
	String sqlQuery1 = "insert into mydata2 values(?,?)";
	String sqlQuery2 = "select file_data from mydata2 where id=?";
	
	// inserting the text file into the database
	void meth1() {
		System.out.println("Inserting text file as CLOB into database");
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(DBurl,Uname,Upwd);
			System.out.println("Database Connected Sucessfully!!\n");
			PreparedStatement pstmt = con.prepareStatement(sqlQuery1);
			pstmt.setString(1,"101");
			FileReader fileReader = new FileReader("D:\\STUDY\\JAVA FULL STACK\\JAVA\\file1.txt");
			BufferedReader br = new BufferedReader(fileReader);
			pstmt.setClob(2, br);
			int rowCount = pstmt.executeUpdate();
			if(rowCount == 0) {
				throw new SQLException("Insert Operation failed, no rows affected");
			}
			System.out.println("Text file inserted as CLOB successfully");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	// copying the file data into file1_copy.txt
	void meth2() {
		System.out.println("Reteriving the data from database");
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(DBurl,Uname,Upwd);
			System.out.println("Database Connected Sucessfully!!\n");
			PreparedStatement pstmt = con.prepareStatement(sqlQuery2);
			pstmt.setString(1, "101");
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				Clob c = rs.getClob(1);
				Reader data = c.getCharacterStream();
				BufferedReader br = new BufferedReader(data);
				FileWriter fw = new FileWriter("D:\\STUDY\\JAVA FULL STACK\\JAVA\\file1_copy.txt");
				String line;
				while((line=br.readLine())!=null) {
					fw.write(line);
					fw.write("\n");
				}
				br.close();
				fw.close();
				System.out.println("CLob data Reterived");
			}
			else {
				throw new SQLException("Clob data Reterived");
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new JdbcPro16().meth1();
		new JdbcPro16().meth2();
	}
}
