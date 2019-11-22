package test;

import java.util.List;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import entity.employee;
import service.empservice;

public class TestBean {
	
	private static ConfigurableApplicationContext ctx;
	public static void main(String[] args)  {		
		ctx = new ClassPathXmlApplicationContext("Spring.xml");
		empservice service=ctx.getBean("empService",empservice.class);
				List<employee> empList=service.showalldetails();

				for(employee emp:empList)
				{
			System.out.println(emp);
				}
}
	}
