package com.lti.core.daos;

import java.sql.SQLException;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.jdbc.core.RowMapper;

import com.lti.core.entities.Data;

public class LogincheckDaoImpl implements LogincheckDao{

	public LogincheckDaoImpl() {
		super();
	}

	@PersistenceContext
	private EntityManager manager;
	
	@Override
	public Data getpersonalByMail(String u) {
		Query qry2 = manager.createQuery("select p from Personal p where p.username= :username");
		qry2.setParameter("username", u);
		return (Data) (qry2.getSingleResult());
	}
	

}

