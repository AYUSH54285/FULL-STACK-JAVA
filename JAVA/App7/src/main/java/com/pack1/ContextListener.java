package com.pack1;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.ServletContextEvent;

//@WebListener  // making it comment beacuse we don't want to make changes in our project, for understanding contextListener make this uncomment
public class ContextListener implements ServletContextListener, ServletContextAttributeListener{
	
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("Context Object Created");// when the ServletContext created then it will call the initialization method
		ServletContext context = sce.getServletContext();
		System.out.println("Our Applicatoin is deployed into : "+context.getServerInfo());
	}
	
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("Context Object Destroyed");
	}
	
	public void attributeAdded(ServletContextAttributeEvent scae) {
		System.out.println("Attributed added");
		String name = scae.getName();
		System.out.println("Attribute Name : "+name);
	}
	
	public void attributeRemoved(ServletContextAttributeEvent scae) {
		System.out.println("Attribute Removed");
	}

}
