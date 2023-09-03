package com.bill.backend.entities;

public class customer 
{
   private String cname;
   private int cphone;
   private String cmail;
   private int mno;
   private int mvalue;
   private String cadd;
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public int getPhone() {
	return cphone;
}
public void setPhone(int phone) {
	this.cphone = phone;
}
public String getCmail() {
	return cmail;
}
public void setCmail(String cmail) {
	this.cmail = cmail;
}
public int getMno() {
	return mno;
}
public void setMno(int mno) {
	this.mno = mno;
}
public int getMvalue() {
	return mvalue;
}
public void setMvalue(int mvalue) {
	this.mvalue = mvalue;
}
public String getCadd() {
	return cadd;
}
public void setCadd(String cadd) {
	this.cadd = cadd;
}
@Override
public String toString() {
	return "Customer_name=  " + cname + ", phone_no=  " + cphone + ", email=  " + cmail + ", Meter_no =  " + mno + ", Bill/Month=  " + mvalue
			+ ", address =  " + cadd;
}
   
   
}
