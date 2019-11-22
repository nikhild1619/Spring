package com.lti.core.daos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.lti.core.entities.Admin;
@Repository("adDao")
public class AdminDaoImpl implements AdminDao{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public int addNewAdmin(Admin ad) {
		
		
		entityManager.persist(ad);
		return 1;
	}
	
}
