package com.cg.home;

import java.util.Scanner;

public class Summation {
	public static void calculateSum()
	{
		int n;
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no. upto which u want the sum");
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			if ((i%3==0)||(i%5==0))
			{
				sum+=i;
			}
		}
		System.out.println(sum);
		
	}

	public static void main(String[] args) {
		calculateSum();
		
	}

}
