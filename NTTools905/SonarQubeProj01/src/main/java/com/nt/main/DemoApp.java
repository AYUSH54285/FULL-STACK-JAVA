package com.nt.main;

import java.util.List;

import java.util.ArrayList;
import java.util.logging.Logger;
public class DemoApp {
	private static Logger logger = Logger.getLogger("com.nt.main.Demoapp");
	public void m2() {
		logger.info("SemoApp.m2()");
		logger.info("m2 method");
	}
	public void m1() {
		logger.info("DemoApp.m1()");
		List<Integer> list = new ArrayList<>();
		list.add(100); 
		list.add(200);
		//list = null; // list reference is NULL
		list.add(3000); // NUllPointerException here!!
		
		for (int num : list) {
			logger.info("Number: "+num);
		}
	}  
	public static void main(String[] args) {
		try {
			logger.info("DemoApp.main(START)");
			DemoApp app1 = new DemoApp();  
			app1.m1();
			app1.m2();
			
			logger.info("DemoApp.main(END");
		}
		catch(Exception e) {
			logger.severe("Exception that is raised::"+e.getMessage());
		}
	}
}
