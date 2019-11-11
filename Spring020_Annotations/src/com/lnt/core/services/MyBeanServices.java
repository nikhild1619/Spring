package com.lnt.core.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("myBean")
public class MyBeanServices {

	@Value("Lnt")
	private String companyName;
	
	@Value("104")
	private int niftyRank;
	
	@Value("Mr.S.K.Sinha")
	private String director;
	
	
	@Autowired
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


	



	
	
	

