package com.nt.service;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

import com.nt.service.LoginMgmtServiceImpl;

import com.nt.dao.ILoginDAO;

public class LoginServiceTest {
	
	@Mock
	private static ILoginDAO mockDAO;
	@Mock
	private static ArrayList<String> ListMock;
	@Spy
	private static ArrayList<String> ListSpy;
	
	@InjectMocks
	private static LoginMgmtServiceImpl loginService;
	
	public LoginServiceTest() {
		MockitoAnnotations.openMocks(this);
		System.out.println(mockDAO.getClass()+" "+ListMock.getClass()+" "+ListSpy.getClass());
	}
	
	@BeforeAll
	public static void setupOnce() {
		System.out.println("LoginServiceTest.setUpOnce()");
	}
	
	
	@Test
	public void testLoginWithValidCredentials() {
		System.out.println("LoginServiceTest.testLoginWithValidCredentials()");
		// convert mock object to stub object by providing dummy function
		Mockito.when(mockDAO.authenticate("raja", "rani")).thenReturn(true);
		//get actual result
		String result = loginService.login("raja", "rani");
		assertEquals("Valid Credentials",result);
	}
	
	@Test
	public  void testLoginWithInValidCredentials() {
		System.out.println("LoginServiceTest.testLoginWithInValidCredentials()");
		// convert mock object to stub object by providing dummy functionality to mock object methods
		Mockito.when(mockDAO.authenticate("raja", "rani1")).thenReturn(false);
		//get actual result
		String result=loginService.login("raja", "rani1");
		assertEquals("Invalid Credentials",result);
		
	}
	
	
	@Test
	public void testLoginWuthNoCredentials() {
		System.out.println("LoginServiceTest.testLoginWithNoCredentails()");
		assertThrows(IllegalArgumentException.class, () -> loginService.login("", ""));
	}
	
	@Test
	public void testStubVsSpy() {
		//add itmes to mock and spy objects
		ListMock.add("table");
		ListSpy.add("table");
		
		// converts Both mock and spy objects as Stub objects by providing dummy functionality
		Mockito.when(ListMock.size()).thenReturn(10);  // comment both for viewing the differnce between mock and spy 
		Mockito.when(ListSpy.size()).thenReturn(20);  // in mock no table object is shown that is length 1 but in spy it's length visible becasue linking with real object 
		System.out.println(ListMock.size()+"........."+ListSpy.size());
	}
	
	@Test
	public void testRegisterUserWithValidData() {
		//provide dummy functionality to addUser method
		Mockito.when(mockDAO.addUser("raja","rani")).thenReturn(1);
		//get actual result
		String msg = loginService.registerUser("raja","rani");
		// check add user method is called or not 
		Mockito.verify(mockDAO,Mockito.times(1)).addUser("raja", "rani");
		assertEquals("User Added",msg);
	}
	
	
	
	
	@Test
	public void testRegisterUserWithInValidData() {
		//check add user method is call or not
		assertThrows(IllegalArgumentException.class,() -> loginService.registerUser("raja", ""));
		Mockito.verify(mockDAO,Mockito.never()).addUser("raja", "");
	}
	
	
	@AfterAll
	public static void tearDownOnce() {
		System.out.println("LoginServiceTest.tearDownOnce()");
		mockDAO = null;
		loginService=null;
	}
	
}
