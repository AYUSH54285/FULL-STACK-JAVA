package com.nt.sbeans;

import java.time.LocalDate;
import java.time.LocalTime;

public class WishMessageGenerator {
	
	private LocalTime time; // Has A property
	private LocalDate date; // Has A Property
	private String addrs; // Simple Type Has A Property
	
	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator.0-param constructor");
	}
	
	//setter method for setter Injection
	public void setTime(LocalTime time) {
		System.out.println("WishMessageGenerator.setTime()");
		this.time = time;
	}
	public void setDate(LocalDate date) {
		System.out.println("WishMessageGenerator.setDate()");
		this.date = date;
	}
	public void setAddrs(String addrs) {
		System.out.println("WishMessageGenerator.setAddrs()");
		this.addrs = addrs;
	}
	
	
	//business method 
	public String showWishMessage(String user) {
		System.out.println("WishMessageGenerator.showWishMessage()"+time+"...."+date+"...."+addrs);
		//get current hour of the day
		int hour = time.getHour();
		if(hour<12) {
			return "Good Morning::"+user;
		}
		else if(hour<16) {
			return "Good AfterNoon::"+user;
		}
		else if(hour<20){
			return "Good Evening::"+user;
		}
		else {
			return "Good Night::"+user;
		}
	}
}
