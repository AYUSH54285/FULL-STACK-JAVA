package com.nt.service;


public class BankService {
    public double calcSimpleInterestAmount(double pamt, double rate, double time) {
    	
    	if(pamt<=0 || rate<=0 || time <= 0) {
    		throw new IllegalArgumentException("Invalid Inputs");
    	}
    	
    	return pamt*rate*time/100.0;
    }
}
