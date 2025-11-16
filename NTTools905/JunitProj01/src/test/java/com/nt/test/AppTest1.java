package com.nt.test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Date;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.nt.service.LogicalOperationService;

public class AppTest1 {
	private static LogicalOperationService service;
	
	@BeforeAll
	public static void setUp() {
		service = new LogicalOperationService();
	}
	
	@Test
	public void testIsPositiveWithPositiveNumber() {
		assertTrue(service.isPositive(10));
	}
	
	@Test
	public void testIsPositiveWithNegativeNumber() {
		assertFalse(service.isPositive(-10));
	}
	
	
	@Test
	public void testIsNullWithObject() {
		assertFalse(service.isNull(new Date()));
	}
	
	@Test
	public void testIsNullWithReference() {
		Date d = null;
		assertTrue(service.isNull(d));
	}
	
	@AfterAll
	public static void clearDown() {
		service = null;
	}
}
