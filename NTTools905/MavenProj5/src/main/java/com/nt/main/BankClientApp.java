package com.nt.main;
import com.nt.service.*;
/**
 * Hello world!
 */
public class BankClientApp {
	
    public static void main(String[] args) {
		System.out.println("BankClientApp.main() (from MavenProj04");
		// create object for BankService and use the methods
		BankService service = new BankService();
		double ans = service.calcSimpleInterestAmount(10, 10, 10);
		System.out.println(ans);
	}
	
}
