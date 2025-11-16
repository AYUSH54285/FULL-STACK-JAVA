package com.nt.test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.Date;

import org.junit.jupiter.api.*;

import com.nt.service.StringUtil;

public class StringUtilTest {
	private static StringUtil util;
	@BeforeAll
	public static void setupOnce() {
		System.out.println("StringUtilTest.setupOnce()");
		util = new StringUtil();
	}
	
	@BeforeEach
	public void setup() {
		System.out.println("StringUtilTest.setup()");
	}
	
	@Test
	public void testIsPallindromeithValidData() {
		System.out.println("StringUtilTest.testIsPallindromeWithValidData()");
		boolean flag = StringUtil.isPalindrome("madam");
	}
	@Test
	public void testIsPallindromeithInvalidData() {
		System.out.println("StringUtilTest.testIsPallindromeWithInvalidData()");
		boolean flag = StringUtil.isPalindrome("madam1");
	}
	
	@Test
	public void testIsPallindromewithNoData() {
		System.out.println("StringUtilTest.testIsPallindromewithNoData()");
		assertThrows(IllegalArgumentException.class,()->StringUtil.isPalindrome(null));
	}
	
	@Test
	public void testCreateDateWithValidData() {
		System.out.println("StringUtilTest.testCreateeWithValidData()");
		LocalDate id = util.createDate(2000, 10, 28);
		assertNotNull(id);	
		assertEquals(LocalDate.of(2000, 10, 28),id);
	}
	
	
	@Test
	public void testCreateDateInvalidData() {
		System.out.println("StringUtilTest.testCreateDateInValidData()");
		LocalDate id = util.createDate(1780, 10, 20); // it return null
		assertNull(id); // hence it is true
	}

	
	
	@Test
	public void testSingletonClass() {
		Runtime rt1 = Runtime.getRuntime();
		Runtime rt2 = Runtime.getRuntime(); 
		System.out.println(rt1.hashCode()+" "+rt2.hashCode()); // same hashcode beacuse object is same for both in singleton method
		assertSame(rt1,rt2);
	}
	
	@Test
	public void testNonSingletonClass() {
		LocalDate d1 = LocalDate.now();
		LocalDate d2 = LocalDate.now();
		System.out.println(d1.hashCode()+" "+d2.hashCode()); // not equal hashcode
		assertNotSame(d1,d2);
	}
	@AfterEach
	public void teardown() {
		System.out.println("StringTest.teardown()");
	}
	
	@AfterAll
	public static void teadDownOnce() {
		System.out.println("StringUtilTest.tearDownOnce()");
	}
	
}
