package com.lti;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("Emp")
public class Employee {
	
	@Value("10")
	private int empid;

	@Value("Nikhil")
	private String name;
	
	@Value("2000")
	private int salary;
	
	@Value("10.5")
	private int comission;
	
	@Autowired
	private Department dept1;


	public int getEmpid() {
		return empid;
	}


	public void setEmpid(int empid) {
		this.empid = empid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	public int getComission() {
		return comission;
	}


	public void setComission(int comission) {
		this.comission = comission;
	}


	public Department getDept1() {
		return dept1;
	}


	public void setDept1(Department dept1) {
		this.dept1 = dept1;
	}


	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + ", comission=" + comission
				+ ", dept1=" + dept1 + "]";
	}
	
	
	
	

}
