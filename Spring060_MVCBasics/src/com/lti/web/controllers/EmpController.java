package com.lti.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//http://localhost:9090/Spring060_MVCBasics/home.hr
@Controller
public class EmpController {
	
	@RequestMapping(name="/home.hr")
	public ModelAndView getHomePage() {
		String company="Larson And Toubro Information Services";
		String jspName="/pages/HomePage.jsp";

		ModelAndView mAndV = new ModelAndView();
		mAndV.addObject("companyName", company);
		mAndV.setViewName(jspName);
		return mAndV;
		
}
}