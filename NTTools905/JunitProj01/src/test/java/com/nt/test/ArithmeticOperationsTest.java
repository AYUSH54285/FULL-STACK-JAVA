package com.nt.test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import com.nt.service.ArithmeticOperations;

@DisplayName("testing the BankService")
//@TestMethodOrder(MethodOrderer.MethodName.class)
//@TestMethodOrder(org.junit.jupiter.api.MethodOrderer.OrderAnnotation.class)
@TestMethodOrder(org.junit.jupiter.api.MethodOrderer.DisplayName.class)
//@TestMethodOrder(org.junit.jupiter.api.MethodOrderer.Random.class)

public class ArithmeticOperationsTest {
	
	private static ArithmeticOperations ops;
	
	@BeforeAll
	public static void setupOnce() {
		System.out.println("ArithmeticOperationsTest.setupOnce()");
		ops = new ArithmeticOperations() ;
	}
	
	@BeforeEach
	public void setup() {
		System.out.println("ArithmeticOperationsTest.setup()");
	}
	
	@Test
	@DisplayName("testWithPositive")
	@Tag("test")
    @Order(1)
	public void testSumWithPositives() {
		ArithmeticOperations ops = new ArithmeticOperations();
		double a =100.0;
		double b = 200.0;
		double expected = 303.0;
		double actual = ops.sum(a,b);
		String message = "it exceeds delta values";
		assertEquals(expected,actual,5.0, message); // 3rd parameter is delta value means how much we can manage the difference
	}
	@Test
	@DisplayName("testWithNegative")
	@Tag("test")
	@Order(2)
	public void testSumWithNegatives() {
		ArithmeticOperations ops = new ArithmeticOperations();
		double a = -100.0;
		double b = -200.0;
		double expected = -300.0; // failure
		double actual = ops.sum(a,b);
		assertEquals(expected,actual);
	}
	@Test
	@DisplayName("testWithZero")
	@Tag("test")
	@Order(3)
	public void testSumWithZeroValues() {
		ArithmeticOperations ops = new ArithmeticOperations();
		double a = 0.0;
		double b = 0.0;
		double expected = 0.0;
		double actual = ops.sum(a,b);
		assertEquals(expected,actual);
	}
	@Test
	@DisplayName("testWithHighValue")
	@Tag("uat")
	@Order(4)
	public void testSumWithHighValues() {
		ArithmeticOperations ops = new ArithmeticOperations();
		double a = 111111111111.0;
		double b = 111111111111.0;
		double expected = 222222222222.0;
		double actual = ops.sum(a,b);
		assertEquals(expected,actual);
	}
	
	//@Disabled
	@Test
	@DisplayName("TestOfTimeout")
	@Tag("uat")
	@Order(5)
	public void testSumForTimeout() {
		System.out.println("ArithmeticOperationTest.testSumForTimeout()");
		assertTimeout(Duration.ofMillis(4000),() -> ops.sum(1000.0, 2000.0));
	}
	
	@AfterEach
	public void tearDown() {
		System.out.println("ArithmeticOperationsTest.tearDown()");
	}
	
	
	@AfterAll
	public static void tearDownOnce() {
		System.out.println("ArithmeticOperationsTest.tearDownOnce()");
		ops = new ArithmeticOperations() ;
	}
}
