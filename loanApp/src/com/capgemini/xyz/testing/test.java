package com.capgemini.xyz.testing;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.xyz.dao.LaonDao;

public class test {

	static LaonDao ld;
	   @BeforeAll
		public static void initialize() {  
		   ld=null;
	     }
	   @BeforeEach
	   public void beforeEach() {
	   	System.out.println("Starting connection");
	   }
	   @Test
	   public void tests() {
	   	System.out.println("Inside testing.");
	   }
	     @AfterEach
	     public void aftereach() {
	   	  System.out.println("Ending The Connection");
	      }
	     @AfterAll
	     public static void destroy() {
	    	 ld=null;
	     }
	}
