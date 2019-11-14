package com.lti;

import org.springframework.stereotype.Component;

@Component("dept")
public class Department {
	
	int Deptid;
	String name;
	String location;
	public int getDeptid() {
		return Deptid;
	}
	public void setDeptid(int deptid) {
		Deptid = deptid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	
	

}
