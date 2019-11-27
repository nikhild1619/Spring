package com.lti.core.daos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.jdbc.core.JdbcTemplate;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.lti.core.entities.Data;
import com.lti.core.exception.EmpException;

@Repository("admindao")
public class AdminDaoImpl implements AdminDao {

	@PersistenceContext  
	private EntityManager manager;

		@Override
		public List<Data> getAllCustomer() throws EmpException  {
			Query qry=manager.createQuery("from PERSONAL_DETAILS");
			List<Data> cList=qry.getResultList();
			return cList;
		}

		@Override
		public List<Data> getCustomer(int cId) {
		
			// TODO Auto-generated method stub
			Query qry=manager.createQuery("from PERSONAL_DETAILS");
			List<Data> cusList= qry.getResultList();
			return cusList;
			
			
		}

		
		
		
		

}


 