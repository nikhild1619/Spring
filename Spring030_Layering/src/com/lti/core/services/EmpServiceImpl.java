package com.lti.core.services;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.lti.core.daos.EmpDao;

@Service("empService")
@Scope("singleton")
@Lazy(true)
public class EmpServiceImpl implements EmpService, InitializingBean {

	/*The initialization iimposes implementation of afterPropertiesSet()
	 * Spring container calls  this method after injections.
	 * purpose of the method
	 *   to ensure spring side initialization
	 *   to validate spring configuration*/
	public EmpServiceImpl()
	{
		System.out.println("Dao");
	}
	
	//field Injection
	//@Autowired // searches by bean  of type EmpDao.
	//@Disposible foe des
	@Resource (name="empDao")//it is doing by type injection
	private EmpDao empDao;
	
	
	
	@Override
		public String getAllEmps() {
			return empDao.getAllEmps();
		}

	@PostConstruct //constrcutor
	public void initBean()
	{
		System.out.println("iinit bean");
	}


	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Initizing bean here");
		
	}
	
	@PreDestroy
	public void cleanup()
	{
		System.out.println("Cleanup");
	}
	
}
