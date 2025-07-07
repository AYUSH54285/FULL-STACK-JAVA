package com.pack1;

import java.util.Scanner;

public class UserDefinedException{
	static double current_balance =100;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter amount to withdraw");
		int n=sc.nextInt();
		try {
			if(current_balance<n) {
				throw new MinimumAccountBalanceException("Have sufficient balance first!!");
			}
			else {
				System.out.println("Please take the Money: "+n);
			}
		}
		catch(MinimumAccountBalanceException e) {
			System.out.println("hi");
			e.printStackTrace();
		}
		finally {
			sc.close();
		}
	}
}