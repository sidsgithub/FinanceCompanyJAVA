package com.capgemini.xyz.bean;

public class Customer {
	private long custId;
	private String custName;
	private String address;
	private long mobile;
	private String email;
	
	public long getCustId() {
		return custId;
	}
	public void setCustId(long custId) {
		this.custId = custId;
//		System.out.println(custId);
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
//		System.out.println(custName);
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
//		System.out.println(address);
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
//		System.out.println(mobile);
		
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
//		System.out.println(email);
	}
	
	public Customer() {
		
	}
	

}
