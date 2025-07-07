//26/6/25 ClassA

//package com.pack1;
//
//public class Employee {
//	private String empName;
//	private int empId;
//	private String empDept;
//	
//	public Employee(String empName, int empId, String empDept) {
//		this.empName = empName;
//		this.empId = empId;
//		this.empDept = empDept;
//	}
//	@Override
//	public String toString(){
//		return empName+" "+empId+" "+empDept;
//	}
//}



//1/7/25 
//Understanding Comparable Interface
//package com.pack1;
//
//public class Employee implements Comparable<Employee>{
//	private String empName;
//	private int empId;
//	private String empDept;
//	
//	public Employee(String empName, int empId, String empDept) {
//		this.empName = empName;
//		this.empId = empId;
//		this.empDept = empDept;
//	}
//	@Override
//	public String toString(){
//		return empName+" "+empId+" "+empDept;
//	}
//	
//	@Override
//	public int compareTo(Employee o) { // To avoid abstract keyword in class so we use abstract method
//		// return empId-o.empId; //Sorting basing on empId
//		//return empName.compareTo(o.empName); //sorting basing on empName
//		return empDept.compareTo(o.empDept); //sorting basing on empDept	
//	}
//}

/*
 -> compareTo()
 Positive value : greater than the specified object
 Negative value : less than the specified Object
 Zero : if both the Objects are equal
 */

// Note : if we don't want to use comparable in class, so we use comparator( see ClassB)

//comparator Interface 
//check ClassB
//package com.pack1;
//
//public class Employee {
//	private String empName;
//	private int empId;
//	private String empDept;
//	
//	public Employee(String empName, int empId, String empDept) {
//		this.empName = empName;
//		this.empId = empId; 
//		this.empDept = empDept;
//	}
//	public String getEmpName() {
//		return empName;
//	}
//	public int getEmpId() {
//		return empId;
//	}
//	public String getEmpDept() {
//		return empDept;
//	}
//	@Override
//	public String toString(){
//		return empName+" "+empId+" "+empDept;
//	}
//	
//}