package com.capgemini.xyz.services;

import com.capgemini.xyz.bean.Customer;
import com.capgemini.xyz.bean.Loan;

public interface ILoanService {
	public Loan applyLoan(Loan loan);
	public Customer validateCustomer(Customer customer);
	public long insertCust(Customer cust);
	public double calculateEMI(double amount,int duration);

}
