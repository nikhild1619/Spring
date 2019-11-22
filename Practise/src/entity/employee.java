package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="emp")
public class employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="phno")
	int phno;
	
	
	@Column(name="Name")
	String name;
	
	
	@Column(name="Address")
	String addr;


	public int getPhno() {
		return phno;
	}


	public void setPhno(int phno) {
		this.phno = phno;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddr() {
		return addr;
	}


	public void setAddr(String addr) {
		this.addr = addr;
	}


	@Override
	public String toString() {
		return "employee [phno=" + phno + ", name=" + name + ", addr=" + addr + "]";
	}
	
	
	
}
