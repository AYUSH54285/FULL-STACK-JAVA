package com.nt.service;

import java.time.LocalDate;
import java.util.Date;

public class StringUtil {
	//1st business method
	public static boolean isPalindrome(String str) {
		if(str==null  || str.equalsIgnoreCase("") || str.length()==0) {
			throw new IllegalArgumentException("Invalid Inputs");
		}
		
		String rev = new StringBuffer(str).reverse().toString();
		
		return str.equals(rev);
	}
	
	//2nd business method
	public LocalDate createDate(int year, int month, int day) {
		if(year < 1900 || month <= 0 || day <=0) {
			return null;
		}
		else {
			return LocalDate.of(year, month, day);  // Date is deprecated that's why we are using LocalDate.of and that is static method which can not require the new keyboard
		}
		
	}
}
