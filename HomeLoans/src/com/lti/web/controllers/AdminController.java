package com.lti.web.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.lti.core.entities.Data;
import com.lti.core.exception.EmpException;
import com.lti.core.services.AdminService;


@Controller
public class AdminController {

	@Autowired
	private AdminService as;
	
	
	@RequestMapping(path="UsersList.loan")                                            
	public ModelAndView getEmpList(HttpServletRequest req,HttpServletResponse res,HttpSession session) throws EmpException {
		List<Data> userList=as.getAllCustomer(); 
		String jspName="UsersList";
		ModelAndView mAndV=new ModelAndView();
		mAndV.addObject("usersList",userList);
		mAndV.setViewName(jspName);
		return mAndV;
	}
	
	
	
}
