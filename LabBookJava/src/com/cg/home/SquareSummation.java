package com.cg.home;

import java.util.Scanner;

public class SquareSummation {
	public static void calculateDifference()
	{
		int n;
		int squaresum=0;
		double numsquaresum=0;
		double result=0;
		double temp = 0;
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the vaue upto where u wnat the sum");
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			numsquaresum+=i*i;
			squaresum+=i;
			temp=Math.pow(squaresum, 2);
		}
			result=temp-numsquaresum;	
			System.out.println(result);
	}


public static void main(String[] args){
	calculateDifference();
}
}
