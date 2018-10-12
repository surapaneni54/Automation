 package com.infinira.id.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity (name="USER_DETAILS")
//@Table (name="USER_DETAILS")
public class UserDetails {
	
	@Column (name="USER_ID")
	@Id @GeneratedValue
	private long userId;
	
	@Column (name="USER_NAME")
	private String userName;
	
	@Column (name="EMAIL")
	private String email;
	

	//@Transient 
	@Column (name="DOB")
	private Date dob;
	
	@Enumerated
	private Address homeAddress;
	
	
	@Column (name="PASSWORD")
	private String password;
	
	@Column (name="PASSWORD_QUS")
	private String passwordQus;

	@Column (name="PASSWORD_ANS")
	private String passwordAns;
	
	
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPasswordQus() {
		return passwordQus;
	}
	public void setPasswordQus(String passwordQus) {
		this.passwordQus = passwordQus;
	}
	public String getPasswordAns() {
		return passwordAns;
	}
	public void setPasswordAns(String passwordAns) {
		this.passwordAns = passwordAns;
	}
	
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Address getHomeAddress() {
		return homeAddress;
	}
	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}

	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	
}
