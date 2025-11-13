package com.pack1;

import java.io.Serializable;

public class EmpBean implements Serializable {
	private String empId;
	private String empFname;
	private String empLname;
	private int empSal;
	private String empAddress;
	
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpFname() {
		return empFname;
	}
	public void setEmpFname(String empFname) {
		this.empFname = empFname;
	}
	public String getEmpLname() {
		return empLname;
	}
	public void setEmpLname(String empLname) {
		this.empLname = empLname;
	}
	public int getEmpSal() {
		return empSal;
	}
	public void setEmpSal(int string) {
		this.empSal = string;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	
}
