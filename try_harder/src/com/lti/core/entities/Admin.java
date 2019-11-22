package com.lti.core.entities;

import java.util.Date;

import javax.persistence.*;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope(scopeName="prototype")
@Entity(name="Admin")
@Table(name="PERSONAL_DETAILS")
public class Admin {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="USER_ID")
	private int userid;
	
	@Column(name="F_NAME")
	private String fname;
	
	@Column(name="M_NAME")
	private String mname;
	
	@Column(name="L_NAME")
	private String lname;
	
	
	@Column(name="PHONE")
	private int phone;
	
	
	@Column(name="DOB")
	private Date dob;
	
	
	@Column(name="GENDER")
	private String gender;
	
	@Column(name="NATIONALITY")
	private String nation;
	
	@Column(name="AADHAR_NO")
	private String aadhar;
	
	@Column(name="PAN_NO")
	private String pan;

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

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
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

	public Admin(int userid, String fname, String mname, String lname, int phone, Date dob, String gender,
			String nation, String aadhar, String pan) {
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
	}

	@Override
	public String toString() {
		return "Admin [userid=" + userid + ", fname=" + fname + ", mname=" + mname + ", lname=" + lname + ", phone="
				+ phone + ", dob=" + dob + ", gender=" + gender + ", nation=" + nation + ", aadhar=" + aadhar + ", pan="
				+ pan + "]";
	}

	
	
	
}
