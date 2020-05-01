package com.cg.home;

import java.util.Scanner;

public class DuplicateChar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int length;
		
		System.out.println("Enter the length");
		length=sc.nextInt();
		System.out.println("enter the string");
		char crr[] = new char[length];
		char new_array [] = new char[length];
		for (int i = 0; i < crr.length; i++) 
		{
			char c = sc.next().charAt(0);
			crr[i] = c;
		}
		for (int i = 0; i < crr.length; i++)
		{
			System.out.print( crr[i]+" ");
			int count=0;
			for (int j = i+1; j < crr.length; j++) {
				if (crr[i]==crr[j]&& j!=i){
					count=count+1;
				}
				if (count == 1)  
	                System.out.println("Number of Occurrence of " + 
	                 crr[i] + " is:" + count[crr[i]);             
	        } 
			}
			
		
		
		
		
		
		
		}
		
		
		
	}
	
}
