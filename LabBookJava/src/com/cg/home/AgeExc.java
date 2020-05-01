package com.cg.home;

import java.util.Scanner;

public class AgeExc {
	 
	 public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  System.out.print("Enter ur age : ");
	  int age = sc.nextInt();
	  
	  try {
	   if(age < 15) 
	    throw new AgeException("Invalid age");
	   else
	    System.out.println("Valid age");
	  }
	  catch (AgeException e) {
	   System.out.println("age of person should be above 15");
	  }
	 }
}