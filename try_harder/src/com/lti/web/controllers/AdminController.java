package com.lti.web.controllers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.lti.core.entities.Admin;
import com.lti.core.services.AdminServices;

@Controller
public class AdminController {
	@Autowired
	private AdminServices adService;
	
	@Autowired
	private Admin ad;
	
	@RequestMapping(path="/")
	public String adminLoginPage(){
		return "AdminLogin";
	}
	
	//http://localhost:8082/try_harder/adminSignup.do
	@RequestMapping(path="adminSignup.do", method=RequestMethod.GET)
	public String adminSignupPage(){
		return "AdminSignup";
	}
	@RequestMapping(path="adminSignup.do", method=RequestMethod.POST)
	public String addNewAdmin(@RequestParam("Userid") int Userid,@RequestParam("Fname") String Fname, @RequestParam("Mname") String Mname,@RequestParam("Lname") String Lname,@RequestParam("Phone") int Phone,@RequestParam("Dob") Date Dob,@RequestParam("Gender") String Gender,@RequestParam("Nation") int Nation,@RequestParam("Aadhar") Date Aadhar,@RequestParam("Pan") String Pan ) throws ParseException{
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy");
		
		ad.setUserid(12);
		ad.setFname("nikhil");
		ad.setMname("kumar");
		ad.setLname("dubey");
		ad.setPhone(123456789);
		ad.setDob(dateFormat.parse("16-02-1998"));
		ad.setGender("male");
		ad.setNation("indian");
		ad.setAadhar("999");
		ad.setPan("dasd123");
		
		
		
		boolean result = adService.joinNewAdmin(ad);
		if(result){
			return "redirect:adminDashboard.do";
		}
		return "Error";
	}
	
	
	
}
