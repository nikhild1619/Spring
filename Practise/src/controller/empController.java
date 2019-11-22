package controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import entity.employee;
import service.empservice;

@Controller
@RequestMapping(value="/")
public class empController {
	
	@Autowired(required=true)
	empservice es;
	
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView getHomePage() {
		String company="Larsen and Toubro Information Services";
		ModelAndView mAndV=new ModelAndView("HomePage");
		mAndV.addObject("companyName",company);
		return mAndV;
	}
//	@RequestMapping("empList.hr")                                            
//	public ModelAndView getEmpList(HttpServletRequest req,HttpServletResponse res,HttpSession session) {
//		List<employee> empList=es.showalldetails(); 
//		String jspName="EmpList";
//		ModelAndView mAndV=new ModelAndView();
//		mAndV.addObject("empList",empList);
//		mAndV.setViewName(jspName);
//		return mAndV;
//	} 
	

}
