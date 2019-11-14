package com.lti.core.daos;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

@Repository("empDao")
@Scope("singleton")
//@Lazy(true)//by default sigleton bean is @Lazy False i.e eager.
public class EmpDaoImpl implements EmpDao {

	
	public EmpDaoImpl()
	{
			System.out.println("hiiii");
	}
	
	@Override
	public String getAllEmps() {
		return "Hello";
	}

}
