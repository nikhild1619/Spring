package com.lti.core.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="Emp123456")
@Table(name="Employees")
public class Employee {
	@Id
	@Column(name="EMPLOYEE_ID")
	private int employeeId;
	
	@Column(name="FIRST_NAME")
	private String firstName;
	@Column(name="LAST_NAME")
	private String lastName;
	@Column(name="EMAIL")
	private String email;
	@Column(name="SALARY")
	private float salary;
	@Column(name="JOB_ID")
	private String jobId;
	@Column(name="HIRE_DATE")
	private Date hireDate;
	
	
	public Employee() {
		super();
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String getJobId() {
		return jobId;
	}
	public void setJobId(String jobId) {
		this.jobId = jobId;
	}
	public Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + ", salary=" + salary + ", jobId=" + jobId + ", hireDate=" + hireDate + "]";
	}
	
	
	
}