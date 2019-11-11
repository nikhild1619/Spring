package com.lti;

public class Employee {
	
	private int empid;
	private String name;
	private int salary;
	private int comission;
	
	
	private Department dept1;
	







	public Department getDept1() {
		return dept1;
	}




	public void setDept1(Department dept1) {
		this.dept1 = dept1;
	}


	private Department dept;
	public Employee(int empid, String name, int salary, int comission) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
		this.comission = comission;
		
	}




	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + ", comission=" + comission
				+ ", dept1=" + dept1+"]";
	}
	
	
	
	



	
	}
	
	
	
	
	
	


