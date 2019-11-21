package com.lti.core.services;

import com.lti.core.entities.Employee;
import com.lti.core.exception.EmpException;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lti.core.daos.EmpDao;



@Service("empService")

public class EmpServiceImpl  implements EmpService {
	
	@Autowired
	private EmpDao empDao;

	@Override
	public List<Employee> getAllEmps() throws EmpException {
	return empDao.getAllEmps();
	}

	/*@Override
	public Employee getEmployeeDetails(int empId) throws EmpException {
		
		return empDao.getEmpOnId(empId);
	}

	@Override
	public int joinNewEmployee(Employee emp) throws EmpException {
		
		return empDao.insertNewEmployee(emp);
	}*/

	

	
	
	






}
