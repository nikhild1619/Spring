package com.lti.core.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.core.daos.AdminDao;
import com.lti.core.entities.Data;
import com.lti.core.exception.EmpException;


@Service("adminservice")
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminDao ad;
	
	@Override
	public List<Data> getAllCustomer() throws EmpException {
	return ad.getAllCustomer();
	}

	
}
