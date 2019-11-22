package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import entity.employee;

public class DaoImpl implements empdao {

	@PersistenceContext
	private EntityManager manager;
	public List<employee> showalldetails() {
		// TODO Auto-generated method stub
		
		Query qry = manager.createQuery("select * from emp1");
		List<employee> employee = qry.getResultList();
		return employee;
	}

}
