package com.lti;

public class Department {
	
	int Deptid;
	String name;
	String location;
	
	
	
	public int getDeptid() { //deptid
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
	@Override
	public String toString() {
		return "Department [Deptid=" + Deptid + ", name=" + name + ", location=" + location + "]";
	}
	
	
	
	

}
