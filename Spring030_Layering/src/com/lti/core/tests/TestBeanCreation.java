package com.lti.core.tests;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.core.entities.Employee;
import com.lti.core.services.EmpService;



public class TestBeanCreation {

		public static void main(String args[])
		{
	ApplicationContext ctx= new ClassPathXmlApplicationContext("spring.xml");
	System.out.println("conetxt created");
	EmpService service = ctx.getBean("empService",EmpService.class);
	System.out.println(service.getAllEmps());
	
	EmpService service1 = ctx.getBean("empService",EmpService.class);
	System.out.println(service1.getAllEmps());
	
	System.out.println(service.hashCode());
	System.out.println(service1.hashCode());
	
	Employee emp1 = ctx.getBean("emp",Employee.class);
	Employee emp2 = ctx.getBean("emp",Employee.class);
	
	System.out.println("Emp1:"+emp1.hashCode());
	System.out.println("Emp2:"+emp2.hashCode());
	
	ConfigurableApplicationContext cctx = (ConfigurableApplicationContext) ctx;
	cctx.close();// to bring destroy on screen
}
}
