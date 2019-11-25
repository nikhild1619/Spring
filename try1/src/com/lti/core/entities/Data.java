package com.lti.core.entities;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity(name="Personal")
@Table(name="Personal")
public class Data {
	
	@Column(name="USER_ID")
	private int userid;
	
	@Column(name="F_NAME")
	private String fname;
	
	@Column(name="M_NAME")
	private String mname;
	
	@Column(name="L_NAME")
	private String lname;
	
	
	@Column(name="PHONE")
	private long phone;
	
	
	@Column(name="DOB")
	private String dob;
	
	
	@Column(name="GENDER")
	private String gender;
	
	@Column(name="NATIONALITY")
	private String nation;
	
	@Id
	@Column(name="AADHAR_NO")
	private String aadhar;
	
	@Column(name="PAN_NO")
	private String pan;
	
	@Column(name="Username")
	private String username;
	
	@Column(name="Password")
	private String password;

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dateofbirth) {
		this.dob = dateofbirth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getNation() {
		return nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}

	public String getAadhar() {
		return aadhar;
	}

	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	
	
	
	public Data() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Data(int userid, String fname, String mname, String lname, long phone, String dob, String gender,
			String nation, String aadhar, String pan, String username, String password) {
		super();
		this.userid = userid;
		this.fname = fname;
		this.mname = mname;
		this.lname = lname;
		this.phone = phone;
		this.dob = dob;
		this.gender = gender;
		this.nation = nation;
		this.aadhar = aadhar;
		this.pan = pan;
		this.username = username;
		this.password = password;
	}

	@Override
	public String toString() {
		return "Data [userid=" + userid + ", fname=" + fname + ", mname=" + mname + ", lname=" + lname + ", phone="
				+ phone + ", dob=" + dob + ", gender=" + gender + ", nation=" + nation + ", aadhar=" + aadhar + ", pan="
				+ pan + ", username=" + username + ", password=" + password + "]";
	}

	

		
	
	
	
	
}
