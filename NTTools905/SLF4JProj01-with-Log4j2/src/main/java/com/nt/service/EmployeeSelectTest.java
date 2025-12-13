

//EmployeeSelectTest

package com.nt.service;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EmployeeSelectTest {
	//Logger Object
    private static final Logger logger = LoggerFactory.getLogger(EmployeeSelectTest.class);
	//Query
	public static final String GET_EMPS = "Select empno, ename, job, sal from emp";
	
	public static void main(String[] args) {
		logger.debug("start of the main(-) method , application");
		try(// establish the connection 
				Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","MYDB11AM","ABC");){
				logger.info("Connection with DB s/w is established");
				try(//create statement object
					PreparedStatement ps = con.prepareStatement(GET_EMPS)){
					logger.debug("PreparedStatement object is created");
					try( //execute the query
						ResultSet rs = ps.executeQuery();){	
						logger.debug("ResultSet obj is created");
						
						//the process of the ResultSet Object
						while(rs.next()) {
							System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4));
						}//while
						logger.warn("Its better to process the ResultSet data directly with the getXXX() methods");
						logger.debug("ResultSet obj is processed");
					}//try 3
				}//try 2
		}//try 1
		catch(SQLException se) { //To handle the known exceptions
			logger.error("DB Problem :: "+se.getMessage());
			se.printStackTrace();
		}
		catch(Exception e) { // to handle the unknown exception
			logger.error("Unknown DB Problem: "+e.getMessage());
			e.printStackTrace();
		}
		logger.debug("End of the main(-) method");
	}
}
