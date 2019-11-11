package com.lnt.core.tests;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lnt.core.services.Address;
import com.lnt.core.services.MyBeanServices;
 
public class TestBeanCreation {

	public static void main(String[] args) {
	
//		//Normal way of creating Object
//		MyBeanServices services = new MyBeanServices();
//		
//	
//		// Call any existing method on object
//		System.out.println(services.toString());
		
		
		
		// Creates a spring context
		ApplicationContext ctx= new ClassPathXmlApplicationContext("spring.xml");
		
		MyBeanServices bean1= (MyBeanServices)ctx.getBean("myBean"); 
		System.out.println(bean1);
		
		
//		Address add=ctx.getBean("addr",Address.class); // implicity conversion of type
//		System.out.println(add);
//		
		
	}

}
