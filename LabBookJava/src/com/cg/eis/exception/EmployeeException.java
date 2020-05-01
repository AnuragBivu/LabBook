package com.cg.eis.exception;

import java.util.Scanner;

public class EmployeeException {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		  System.out.print("Enter salary of the employee : ");
		  int age = s.nextInt();
		  
		  try {
		   if(age < 3000) 
		    throw new SalaryException("Invalid salary");
		   else
		    System.out.println("Valid salary");
		  }
		  catch (SalaryException e) {
		   System.out.println("Salary of employee should be above 3000");
		  }

	}

}
