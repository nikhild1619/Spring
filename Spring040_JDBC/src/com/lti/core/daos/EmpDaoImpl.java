package com.lti.core.daos;



import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.lti.core.entities.Employee;
import com.lti.core.exceptions.EmpException;


@Repository("empDao")

//@Lazy(true)//by default sigleton bean is @Lazy False i.e eager.
public class EmpDaoImpl implements EmpDao {

	private DataSource datasource;
	
	public EmpDaoImpl()
	{
			System.out.println("DAO CREATED");
	}
	
	@Override
	public List<Employee> getAllEmps() throws EmpException {
		
		Connection connect = null;
		Statement stmt=null;
		ResultSet rs = null;
		ArrayList<Employee> emplist = new ArrayList<>();
		
		try {
			connect = datasource.getConnection();
			stmt = connect.createStatement();
			rs=stmt.executeQuery("select EMPLOYEE_ID,FIRST_NAME from EMPLOYEE");
		    
			while(rs.next()) {
				int empid=rs.getInt("EMPLOYEE_ID");
				String ename=rs.getString("FIRST_NAME");
				Employee emp=new Employee(empid,ename);
				emplist.add(emp);
			}
			
		} 
		
		catch (SQLException e) {
			throw new EmpException("Exception From getAllEmps()",e); //Exception Chaining
		}
		
		finally {
			try {
				if(rs != null)
				rs.close();
				
				if(stmt != null)
				stmt.close();
				
				if(connect != null)
				connect.close();
			} catch (SQLException e) {
				throw new EmpException("Exception while closing",e);
			}
		}
		
		return null;
	}

}
