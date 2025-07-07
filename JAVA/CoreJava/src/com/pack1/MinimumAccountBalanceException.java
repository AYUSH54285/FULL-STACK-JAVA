package com.pack1;

public class MinimumAccountBalanceException extends Exception{
	String message; // for display the message

	public MinimumAccountBalanceException(String message) {
		this.message = message;
	}
	@Override
	public String toString() {  // for override the hexavalue given by toString method
		return message;
	}
	
}
