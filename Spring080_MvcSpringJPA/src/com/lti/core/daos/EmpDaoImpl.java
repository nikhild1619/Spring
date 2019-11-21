package com.lti.core.daos;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import com.lti.core.entities.Employee;
import com.lti.core.exception.EmpException;

@Repository("empDao")
public class EmpDaoImpl implements EmpDao {
	
@PersistenceContext  
private EntityManager manager;

	@Override
	public List<Employee> getAllEmps() throws EmpException  {
		Query qry=manager.createQuery("from Emp123456");
		List<Employee>  empList=qry.getResultList();
		return empList;
	}

/*	@Override
	public Employee getEmpOnId(int empId) throws EmpException {
		String qry ="Select employee_Id,first_Name,last_Name,job_Id,hire_date,salary,email FROM employees where employee_id=?";
		Employee emp = jTemp.queryForObject(qry,new RowMapperFactory(), empId);
		
		return emp;
	}

	@Override
	public int insertNewEmployee(Employee emp) throws EmpException {
		String qry="INSERT INTO employees (employee_Id,first_Name,last_Name,job_Id,hire_date,salary,email) VALUES(?,?,?,?,?,?,?)";
	   Object[] params= {emp.getEmployeeId(),emp.getFirstName(),emp.getLastName(),emp.getJobId(),emp.getHireDate(),emp.getSalary(),emp.getEmail()};
	   int returnVal =jTemp.update(qry,params);
	   return returnVal;
	}	*/
}
class RowMapperFactory implements RowMapper<Employee>{

	@Override
	public Employee mapRow(ResultSet rs, int arg1) throws SQLException {
		int empId=rs.getInt("employee_id");
		String firstName=rs.getString("first_name");
		String lastName=rs.getString("last_name");
		String jobId=rs.getString("job_id");
		Date hireDate=rs.getDate("hire_date");
		Float salary =rs.getFloat("salary");
		String email=rs.getString("email");
		
		Employee emp=new Employee();
		emp.setEmployeeId(empId);
		emp.setFirstName(firstName);
		emp.setLastName(lastName);
		emp.setJobId(jobId);
		emp.setHireDate(hireDate);
		emp.setSalary(salary);
		emp.setEmail(email);
		
		return emp;
	}
}