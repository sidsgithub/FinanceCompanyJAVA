package com.capgemini.xyz.ui;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

import com.capgemini.xyz.bean.Customer;
import com.capgemini.xyz.bean.Loan;
import com.capgemini.xyz.dao.LaonDao;
import com.capgemini.xyz.services.LoanService;

public class ExecuterMain {
	
	public Customer Info() {
		LaonDao ld = new LaonDao();
		//this method is added to call the info. section 
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		int flag = 0;//to exit form the while loop.
		Customer customer = new Customer();//getting the customer object to pass the values.
		Loan loan = new Loan();
		LoanService ls = new LoanService();
		//user interface which accepts the input and display the menu.
		while(flag == 0) 
		{
			
		System.out.println("Siddharth's Finance Company welcomes you");
		System.out.println();
		System.out.println("1) Register Customer");
		System.out.println("2) Exit");
		int n = sc.nextInt();
		switch(n) 
		{
			case 1://menu for customer details 
				try {
					long cusId = (long)rand.nextInt(1000000);
					customer.getCustId();
					customer.setCustId(cusId);
					
					System.out.println("Enter Customer Name:");
					String name = sc.nextLine();
					customer.getCustName();
					customer.setCustName(name);
					
					System.out.println("Enter Address:");
					String address = sc.next();
					customer.getAddress();
					customer.setAddress(address);
					
					System.out.println("Enter Mobile No.:");
					long mob = sc.nextLong();
					customer.getMobile();
					customer.setMobile(mob);
					
					System.out.println("Enter Email:");
					String email = sc.next();
					customer.getEmail();
					customer.setEmail(email);	
					
					ld.insertCust(customer);
					
					System.out.println("Do you wish to apply for Loan ?(Yes/No)");//registeration done ,loan logic
					
					String choice = sc.next();
					if(choice.equalsIgnoreCase("yes"))
					{
						System.out.println("Enter the loan amount:");
						long loanAmount = sc.nextLong();
						loan.getLoanAmount();
						loan.setLoanAmount(loanAmount);
						
						System.out.println("Enter the loan duration:");
						int duration = sc.nextInt();
						loan.getDuration();
						loan.setDuration(duration);
						
						ld.applyLoan(loan);
						ls.calculateEMI(loanAmount, duration);
						
						
						
						
					}
					else if(choice.equalsIgnoreCase("no")){
						
	
					}
					else {
						System.out.println("wrong choice.");
					}
					
					}
					catch(InputMismatchException e){
						System.out.println("enter the correct details");
					}
//				flag = 1;
//				break;
			case 2:
				flag = 1;
				break;
				
			default:
				System.out.println("Entered wrong choice.");
				break;
		}
				
				
			
		}
		return customer;
		
	}
	public static void main(String args[])
	{
		ExecuterMain m = new ExecuterMain();
		m.Info();
	}

}
