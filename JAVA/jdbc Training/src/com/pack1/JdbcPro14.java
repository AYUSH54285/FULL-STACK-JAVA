//MetaData in JDBC -> if we want to get the information of already made projects then we use metadata

package com.pack1;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ParameterMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

public class JdbcPro14 {
 String driver = "oracle.jdbc.OracleDriver";
 String DBurl = "jdbc:oracle:thin:@localhost:1521:orcl";
 String Uname = "MYDB11AM";
 String Upwd = "ABC";
 
 String sqlQuery1 = "select efname, elname from employee where eid=?";
 String sqlQuery2 = "select eid, efname, esal from employee";
 void meth1() {
	 try {
		 Class.forName(driver);
		 Connection con = DriverManager.getConnection(DBurl,Uname,Upwd);
		 
		 DatabaseMetaData dmtdt = con.getMetaData();
		 System.out.println("************ DatabaseMetaData ***********");
		 System.out.println("getDatabaseProductName() : "+dmtdt.getDatabaseProductName());
		 System.out.println("getDatabaseProductVersion() : "+dmtdt.getDatabaseProductVersion());
		 System.out.println("getDriverName() : "+dmtdt.getDriverName());
		 System.out.println("supportsStoredProcedures() : "+dmtdt.supportsStoredProcedures());
		 
		 
		 PreparedStatement pstmt = con.prepareStatement(sqlQuery1);
		 pstmt.setString(1,"101");
		 ResultSet rs = pstmt.executeQuery();
		 
		 ParameterMetaData pstmtdt = pstmt.getParameterMetaData();
		 System.out.println("\n************* ParameterMetaData *************");
		 System.out.println("getParameterCount(): "+pstmtdt.getParameterCount());
		 System.out.println("getParameterType(): "+pstmtdt.getParameterType(1));
		 System.out.println("getParameterMode(): "+pstmtdt.getParameterMode(1));
		 System.out.println("isNullable(): "+pstmtdt.isNullable(1));	
		 
		 
		 ResultSetMetaData rsmtdt = rs.getMetaData();
		 System.out.println("\n******************** ResultSetmetaData ***************");
		 System.out.println("getColumnCount() : "+rsmtdt.getColumnCount());
		 System.out.println("getColumnName() : "+rsmtdt.getColumnName(1));
		 System.out.println("getColumnDisplaySize() : "+rsmtdt.getColumnDisplaySize(1));
		 System.out.println("isAutoIncrement() : "+rsmtdt.isAutoIncrement(1));
		 
		 
		 RowSetFactory rsf = RowSetProvider.newFactory();
		 CachedRowSet crs = rsf.createCachedRowSet();
		 
		 crs.setUrl(DBurl);
		 crs.setUsername(Uname);
		 crs.setPassword(Upwd);
		 
		 crs.setCommand(sqlQuery2);
		 crs.execute();
		 ResultSetMetaData rsmd = crs.getMetaData();
		 System.out.println("\n************ RowSetMetaData **********");
		 System.out.println("getColumnCount() :"+rsmd.getColumnCount());
		 System.out.println("getColumnName() :"+rsmd.getColumnName(1));
		 System.out.println("getColumnDisplaySize() : "+rsmd.getColumnDisplaySize(1));
		 System.out.println("isAutoIncrement() : "+rsmd.isAutoIncrement(1));

	 }
	 catch(Exception e) {
		 e.printStackTrace();
	 }
 }
 public static void main(String[] args) {
	new JdbcPro14().meth1();
}
}
