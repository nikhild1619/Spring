package com.lti.web.controllers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.sql.Date;
import java.util.Formatter;
import java.util.List;
import java.util.Map;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;

import com.lti.core.entities.Data;

import com.lti.core.exception.EmpException;
import com.lti.core.services.DataService;
import com.lti.core.services.LogincheckService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

//http://localhost:9090/Homeloanss/home.hr
//http://localhost:8082/Spring080_MvcSpringJPA/empList.hr
@Controller
public class DataController {
	@Autowired
	private DataService service;
	
	public LogincheckService lcs;
	
	@RequestMapping("home.hr")
	public ModelAndView getHomePage() {
		String company="Home Loans";
		String jspName="HomePage";
		
		ModelAndView mAndV=new ModelAndView();
		mAndV.addObject("Show Details",company);
		mAndV.setViewName(jspName);
		return mAndV;
	}
	@RequestMapping("empList.hr")                                            
	public ModelAndView getEmpList(HttpServletRequest req,HttpServletResponse res,HttpSession session) throws EmpException {
		List<Data> empList=service.getAllEmps(); 
		String jspName="EmpList";
		ModelAndView mAndV=new ModelAndView();
		mAndV.addObject("empList",empList);
		mAndV.setViewName(jspName);
		return mAndV;
	}
	
/*	@RequestMapping("empDetails.hr")
	public ModelAndView getEmpDetails(@RequestParam("id")int empId) throws EmpException {
		System.out.println(empId);
		Employee emp=service.getEmployeeDetails(empId); 
		String jspName="EmpDetails";
		
		ModelAndView mAndV=new ModelAndView();
		mAndV.addObject("emp",emp);
		mAndV.setViewName(jspName);
		return mAndV;
}*/
	
	@RequestMapping(path="registration.hr",method=RequestMethod.GET)
	public String adduserpage(){
		return "Registration";
	}
	
	//http://localhost:8081/Homeloanss/registration.hr
	@RequestMapping(path="registration.hr",method=RequestMethod.POST)
	public String adduser(@RequestParam("firstname") String firstname, @RequestParam("middlename") String middlename,@RequestParam("lastname") String lastname,@RequestParam("contactnumber") long contactnumber,@RequestParam("dateofbirth") String dateofbirth,@RequestParam("gender") String gender,@RequestParam("nationality") String nationality,@RequestParam("aadharnumber") String aadharnumber,@RequestParam("pass") String pass,@RequestParam("emailid")String emailid,@RequestParam("password")String password ) throws EmpException
	{
		
		System.out.println(firstname);
		Data d = new Data();
		
		d.setFname(firstname);
		d.setMname(middlename);
		d.setLname(lastname);
		d.setPhone(contactnumber);
		d.setDob(dateofbirth);
		d.setGender(gender);
		d.setNation(nationality);
		d.setAadhar(aadharnumber);
		d.setPan(pass);
		
		boolean result = service.adduser(d);
		if(result){
			return "redirect:empList.hr";
		}
		return "error";
	
	}
	
	
	//About Us Page here
	
	@RequestMapping("AboutUs.hr")
	public ModelAndView getAboutusPage() {
		//String company="Home Loans";
		String jspName="AboutUs";
		
		ModelAndView mAndV=new ModelAndView();
		//mAndV.addObject("Show Details",company);
		mAndV.setViewName(jspName);
		return mAndV;
	}
	
	
	@RequestMapping("MainCalculator.hr")
	public ModelAndView getcalcPage() {
		//String company="Home Loans";
		String jspName="MainCalculator";
		
		ModelAndView mAndV=new ModelAndView();
		//mAndV.addObject("Show Details",company);
		mAndV.setViewName(jspName);
		return mAndV;
	}

	
	@RequestMapping(path="LoginPage.hr", method=RequestMethod.GET)
	public String LoginpersonalByMailPage(){
		return "LoginPage";
	}

	@RequestMapping(path="LoginPage.hr", method=RequestMethod.POST)
	public String login(@RequestParam("username")String u ,@RequestParam("password")String password,HttpSession session,HttpServletRequest request)
	{
		
		Data d1 = lcs.LoginpersonalByMail(u);
		
		String c = d1.getUsername();
		System.out.println(c);
		
		if(d1.getUsername().contentEquals(u)) {
			if(d1.getPassword().contentEquals(password)) {
				return "registration.hr";
			}
			else {
				return "LoginPage.hr";
			}
		}
		else
		{
			return "username wrong";
		}		
	}

}

	
	
	
	
