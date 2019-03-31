package com.capgemini.xyz.dao;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.capgemini.xyz.bean.Customer;
import com.capgemini.xyz.bean.Loan;
import com.capgemini.xyz.services.LoanService;

public class LaonDao implements ILoanDao {
	
	LoanService ls = new LoanService();
	
	
	private Map<Integer,Customer> customerEntry;
	private Map<Integer,Loan> loanEntry;

	@Override
	public long applyLoan(Loan loan) {
		ls.applyLoan(loan);
		
		return 0;
	}

	@Override
	public long insertCust(Customer cust) {
		ls.insertCust(cust);
		
		
		return 0;
	}

}
