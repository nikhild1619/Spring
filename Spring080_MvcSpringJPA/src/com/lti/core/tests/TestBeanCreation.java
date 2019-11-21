package com.lti.core.tests;

import java.sql.Date;
//import java.util.*;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.lti.core.entities.Employee;
import com.lti.core.exception.EmpException;
import com.lti.core.services.EmpService;

public class TestBeanCreation {
	private static ConfigurableApplicationContext ctx;

	public static void main(String[] args) throws EmpException {		
		ctx = new ClassPathXmlApplicationContext("Spring.xml");
		EmpService service=ctx.getBean("empService",EmpService.class);
			/*	List<Employee> empList=service.getAllEmps();
for(Employee emp:empList)
{
			System.out.println(emp);
}
Employee emp= service.getEmployeeDetails(100);
			System.out.println(emp);*/
			Employee emp=new Employee();
			emp.setEmployeeId(301);
			emp.setFirstName("Chanda");
			emp.setLastName("Despand");
			emp.setEmail("chandar@gmail.co");
			emp.setJobId("AC_ACCOUNT");
			emp.setSalary(703);
			java.util.Date dt= new java.util.Date();
			emp.setHireDate(new Date(dt.getTime()));
		/*	int val=service.joinNewEmployee(emp);
			System.out.println(val);*/
			
		}
}
