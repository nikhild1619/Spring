package com.lti.core.entities;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("emp")
@Scope("prototype")
public class Employee {

	
	private int empid;
	private String ename;
	

	public Employee()
	{
		System.out.println("Emplouee Object Created");
	}
	

	public Employee(int empid,String ename)
	{
		super();
		this.empid=empid;
		this.ename=ename;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}
	
	
}
