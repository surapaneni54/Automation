package com.infinira.id.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Password {
	
	@Column (name="PASSWORD_ID")
	@Id @GeneratedValue
	private long passwordId;
	private long userId;
	private String password;
	private String passwordQus;
	private String passwordAns;
	
	public long getPasswordId() {
		return passwordId;
	}
	public void setPasswordId(long passwordId) {
		this.passwordId = passwordId;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
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
	
}
