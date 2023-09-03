package com.survey.entities;

public class ADMIN 
{
	 private String username;
	  private String password;
	  private int empid;
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
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	@Override
	public String toString() {
		return "ADMIN [username=" + username + ", password=" + password + ", empid=" + empid + "]";
	}
	  
}
