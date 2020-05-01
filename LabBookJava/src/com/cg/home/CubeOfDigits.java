package com.cg.home;

import java.util.Scanner;

public class CubeOfDigits {
	static void sumOfCubes(){
		int c=0,a;  
	    int n;
	    Scanner sc = new Scanner (System.in);
	    System.out.println("Enter the number");
	    n=sc.nextInt();
	   
	    while(n>0)  
	    {  
	    a=n%10;  
	    n=n/10;  
	    c=c+(a*a*a);  
	    }  
	    System.out.println("the required number is: "+c );
	}

	public static void main(String[] args) {
		sumOfCubes();

	}

}
