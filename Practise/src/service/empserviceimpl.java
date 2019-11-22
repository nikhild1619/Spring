package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.empdao;
import entity.employee;


@Service("empservice")
public class empserviceimpl implements empservice {
	
	@Autowired(required= true)
	private empdao empd;

	public List<employee> showalldetails() {
		// TODO Auto-generated method stub
		
		return empd.showalldetails();
	}

}
