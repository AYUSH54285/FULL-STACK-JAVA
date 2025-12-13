//DependencyInjectionTest.java
package com.nt.main;

import java.util.Arrays;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.WishMessageGenerator;

public class DependencyInjectionTest {
	public static void main(String[] args) {
		// create IOC container of type ApplicationContext
		try(FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");){
		
		// get target Spring bean class object ref
		Object obj = ctx.getBean("wmg"); // explaining pool and cache
		Object obj1 = ctx.getBean("wmg");
		System.out.println(obj.hashCode()+" "+obj1.hashCode());
		System.out.println("obj==obj1?"+(obj==obj1));
		//type casting
		WishMessageGenerator generator = (WishMessageGenerator)obj;
		//invoke the b.method
		String msg = generator.showWishMessage("raja");
		System.out.println(msg);
		System.out.println("-----------------------");
		System.out.println("All the Spring Beans count::"+ctx.getBeanDefinitionCount());
		System.out.println("All the Spring Bean ids::"+Arrays.toString(ctx.getBeanDefinitionNames()));
		//close the IOC Container -> it will automatically close
		//ctx.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
