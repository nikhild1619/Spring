package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.lti.Employee;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
ApplicationContext ctx= new ClassPathXmlApplicationContext("spring.xml");
		
		Employee bean1= (Employee)ctx.getBean("Emp"); 
		System.out.println(bean1);
		
	}

}
