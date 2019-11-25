package com.lti.core.services;

import javax.annotation.Resource;

import com.lti.core.daos.LogincheckDao;
import com.lti.core.entities.Data;

public class LogincheckServiceImpl {
	
	public LogincheckServiceImpl() {
		super();
	}

	@Resource(name="LogincheckDao")
	private LogincheckDao ldao;
	
	public Data LoginpersonalByMail(String username) {
		Data d1 = new Data();
		d1=ldao.getpersonalByMail(username);
		return d1;
	}
	
}
