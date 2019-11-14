package com.lti.core.daos;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

@Repository
@Scope("prototype")
public class EmpDaoImpl2 implements EmpDao {
	
	@Override
	public String getAllEmps() {
		return "Hello";
	}
}
