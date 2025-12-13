//26/6/25 ClassA

package com.pack1;

public class Student {
	private String stuName;
	private String stuBranch;
	private int stuMarks;
	
	public Student(String stuName, String stuBranch, int stuMarks) {
		this.stuName = stuName;
		this.stuBranch = stuBranch;
		this.stuMarks = stuMarks;

	}
	@Override
	public String toString(){
		return stuName+" "+stuMarks;
	}
}
