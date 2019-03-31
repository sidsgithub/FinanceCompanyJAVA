package com.capgemini.xyz.services;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.capgemini.xyz.bean.Customer;
import com.capgemini.xyz.bean.Loan;

public class LoanService implements ILoanService{
	Scanner sc = new Scanner(System.in);

	@Override
	public Loan applyLoan(Loan loan) {
		//insertion of loan info in hashmap.
			
				Map<Integer,Loan> loanEntry = new HashMap<Integer,Loan>();
				System.out.println("enter a key for your hashmap entry");
				int lkey = sc.nextInt();
				loanEntry.put(lkey,loan);
				
				Loan oc = loanEntry.get(lkey);
				long ll = oc.getLoanID();
				
				System.out.println("your loan ID is "+ll);
		
		
		return null;
	}

	@Override
	public Customer validateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long insertCust(Customer cust) {
		// to insert customer info in the hashmap with a key value.
		
		
				Map<Integer,Customer> customerEntry = new HashMap<Integer,Customer>();
				
				
				System.out.println("enter a key for your hashmap entry");
				
				int key = sc.nextInt();
				customerEntry.put(key,cust);
				
				
				
				
				
				Customer ob = customerEntry.get(key);
				long l = ob.getCustId();
				
			          
				System.out.println("-------------------------------------------");
				System.out.println("Customer Information saved successfully.");
				System.out.println();
				System.out.println("Your Customer Id is "+l);
				System.out.println("-------------------------------------------");
				
		
		return 0;
	}

	@Override
	public double calculateEMI(double amount, int duration) {
		LoanService ls = new LoanService();
		double r = 9.50;
		double P = amount;
		int n = duration;
		double EMI = (double)( P*r*((1+r)*n)/(((1+r)*n))-1 );
		System.out.println("-------------------------------------------");
		System.out.println("For Loan amount "+amount+ " and " + duration+" Year duration.");
		System.out.println();
		System.out.println("Your EMI per month will be "+EMI);
		System.out.println("-------------------------------------------");
		System.out.println("do you want to apply for loan now? (Yes/No)");
		String nowchoice = sc.next();
		if(nowchoice.equalsIgnoreCase("yes")) {
			System.out.println("Your Loan request is generated.");
			
		}
		
		
		
		return 0;
	}


}
