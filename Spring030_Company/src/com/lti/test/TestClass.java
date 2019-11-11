package com.lti.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.Employee;

public class TestClass {

	public static void main(String[] args) {
	
		
		ApplicationContext ctx= new ClassPathXmlApplicationContext("spring.xml");
		Employee e =(Employee)ctx.getBean("Emp");
		
		System.out.println(e);

	}

}
