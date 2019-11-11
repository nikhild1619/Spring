package com.lnt.core.services;

public class MyBeanServices {

	private String companyName;
	private int niftyRank;
	private String director;
	
	private Address addr;				//For dependency injection
	
	
	public MyBeanServices() {
		
		
		super();
		System.out.println("Bean created");
	}
	
	

	public MyBeanServices(String companyName, int niftyRank) {
		super();
		this.companyName = companyName;
		this.niftyRank = niftyRank;
	}

	public void setDirector(String director) {   // property name is director
		this.director = director;
	}


	//Getter setter for Address reference
	//For dependency injection

	public Address getAddr() {
		return addr;
	}



	public void setAddr(Address addr) {
		this.addr = addr;
	}



	@Override
	public String toString() {
		return "MyBeanServices [companyName=" + companyName + ", niftyRank=" + niftyRank + ", director=" + director
				+ ", addr=" + addr + "]";
	}



	
	}


	



	
	
	

