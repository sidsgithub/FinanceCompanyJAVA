package com.capgemini.xyz.bean;

public class Loan {
	private long loanID;
	private double loanAmount;
	private long custId;
	private int duration;
	
	
	public long getLoanID() {
		return loanID;
	}
	public void setLoanID(long loanID) {
		this.loanID = loanID;
	}
	public double getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
//		System.out.println(loanAmount);
	}
	public long getCustId() {
		return custId;
	}
	public void setCustId(long custId) {
		this.custId = custId;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
//		System.out.println(duration);
	}
	
	public Loan(){
		
	}

}
