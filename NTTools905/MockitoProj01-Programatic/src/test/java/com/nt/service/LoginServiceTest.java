package com.nt.service;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import com.nt.service.LoginMgmtServiceImpl;

import com.nt.dao.ILoginDAO;

public class LoginServiceTest {
	private static ILoginMgmtService loginService;
	private static ILoginDAO mockDAO;
	private static ILoginDAO spyDAO;
	private static ILoginMgmtService spyLoginService;
	
	
	@BeforeAll
	public static void setupOnce() {
		System.out.println("LoginServiceTest.setUpOnce()");
		//create Mock DAO class Object
		mockDAO = Mockito.mock(ILoginDAO.class);
		//create Spy DAO class Object
		spyDAO = Mockito.spy(ILoginDAO.class);
		//create service class object having MockDAO object
		loginService = new LoginMgmtServiceImpl(mockDAO);
		//create Service class object having spyDAO object
		spyLoginService = new LoginMgmtServiceImpl(spyDAO);
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
		//Mock object
		ArrayList<String> listMock = Mockito.mock(ArrayList.class);
		listMock.add("table");
		ArrayList<String> listSpy = Mockito.spy(ArrayList.class);
		listSpy.add("table");
		
		// converts Both mock and spy objects as Stub objects by providing dummy functionality
		Mockito.when(listMock.size()).thenReturn(10);  // comment both for viewing the differnce between mock and spy 
		Mockito.when(listSpy.size()).thenReturn(20);  // in mock no table object is shown that is length 1 but in spy it's length visible becasue linking with real object 
		System.out.println(listMock.size()+"........."+listSpy.size());
	}
	
	@Test
	public void testRegisterUserWithValidData() {
		//provide dummy functionality to addUser method
		Mockito.when(spyDAO.addUser("raja","rani")).thenReturn(1);
		//get actual result
		String msg = spyLoginService.registerUser("raja","rani");
		// check add user method is called or not 
		Mockito.verify(spyDAO,Mockito.times(1)).addUser("raja", "rani");
		assertEquals("User Added",msg);
	}
	
	
	@Test
	public void testRegisterUserWithInValidData() {
		//check add user method is call or not
		assertThrows(IllegalArgumentException.class,() -> spyLoginService.registerUser("raja", ""));
		Mockito.verify(spyDAO,Mockito.never()).addUser("raja", "");
	}
	
	
	@AfterAll
	public static void tearDownOnce() {
		System.out.println("LoginServiceTest.tearDownOnce()");
		mockDAO = null;
		loginService=null;
	}
	
}
