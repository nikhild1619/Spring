package com.lti.core.services;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.core.daos.AdminDao;
import com.lti.core.entities.Admin;

@Service
public class AdminServicesImpl implements AdminServices{

	@Autowired
	private AdminDao adDao;
	
	@Override
	@Transactional
	public boolean joinNewAdmin(Admin ad) {
		int result = getAdDao().addNewAdmin(ad);
		if(result==1)
		{
			return true;
		}
		else {
			return false;
		}
	}

	public AdminDao getAdDao() {
		return adDao;
	}

	public void setAdDao(AdminDao adDao) {
		this.adDao = adDao;
	}
	
}
