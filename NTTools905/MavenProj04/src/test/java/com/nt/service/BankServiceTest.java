package com.nt.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


public class BankServiceTest {

    @Test
    public void testSimpleInterestAmountWithBigValues() {
    	double pamt = 10000000.0;
    	double rate = 2.0;
    	double time = 12.0;
    	//calculate expected result manually
    	double expected = 2400000.0;
    	//get actual result
    	BankService service = new BankService();
    	double actual = service.calcSimpleInterestAmount(pamt, rate, time);
    	assertEquals(expected,actual); // this is static method so we use static import then we don't need classname for static method 
    }
    @Test
    public void testSimpleInterestAmountWithSmallValues() {
    	double pamt = 100000.0;
    	double rate = 2.0;
    	double time = 12.0;
    	//calculate expected result manually
    	double expected = 24000.0;
    	//get actual result
    	BankService service = new BankService();
    	double actual = service.calcSimpleInterestAmount(pamt, rate, time);
    	assertEquals(expected,actual); // this is static method so we use static import then we don't need classname for static method 
    }
    @Test
    public void testSimpleInterestAmountWithWrongValues() {
    	double pamt = -10000000.0;
    	double rate = 2.0;
    	double time = 12.0;
    	BankService service = new BankService();
    	assertThrows(IllegalArgumentException.class,
    			()->service.calcSimpleInterestAmount(pamt, rate, time));
    }
}
