//2/9/25
//JdbcRowSet Interface
package com.pack1;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

public class JdbcPro9 {
	String driver = "oracle.driver.OracleDriver";
	String DBurl  = "jdbc:oracle:thin:@localhost:1521:orcl";
	String Uname = "MYDB11AM";
	String Upwd = "ABC";
	
	
	//JdbcRowSet 
	void meth1() {
		System.out.println("Implementing JdbcRowSet Interface");
		
		try {
			RowSetFactory rsf = RowSetProvider.newFactory();
			JdbcRowSet jrs = rsf.createJdbcRowSet();
			
			//here we are not using getConnection instead we are doing this
			jrs.setUrl(DBurl);
			jrs.setUsername(Uname);
			jrs.setPassword(Upwd);
			jrs.setCommand("Select * from employee");
			
			jrs.execute();
			
			//jrs.close(); // it generates SQLRecoverableException: Closed ResultSet(Because JdbcRowSet is Connected)
			
			//RowSet is bydefault scrollable that's why we can use last() 
			jrs.last();
				System.out.println(jrs.getString(1)+" "+jrs.getString(2)+" "+jrs.getString(3)+" "+jrs.getString(4)+" "+jrs.getString(5)+"\n");

			jrs.beforeFirst();
			while(jrs.next()) {
				System.out.println(jrs.getString(1)+" "+jrs.getString(2)+" "+jrs.getString(3)+" "+jrs.getString(4)+" "+jrs.getString(5));
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	// CachedRowSet
	void meth2() {
		System.out.println("Implementing the CachedRowSet Interface");
		
		try {
			RowSetFactory rsf = RowSetProvider.newFactory();
			CachedRowSet crs = rsf.createCachedRowSet();
			crs.setUrl(DBurl);
			crs.setUsername(Uname);
			crs.setPassword(Upwd);
			crs.setCommand("Select eid,efname,esal from employee");
			crs.execute();
			
			crs.close(); // CachedRowSet will work both in connected and disconnected Mode
			
			while(crs.next()) {
				String emp_id = crs.getString(1);
				if(emp_id.equals("102")) {
					crs.updateInt("easal", 35000);
					crs.updateRow();
				}
			}
			
			crs.acceptChanges(); // it is mandatory for reflect changes in database.
			System.out.println("data updated");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		//new JdbcPro9().meth1();
		new JdbcPro9().meth2();

	}
}
