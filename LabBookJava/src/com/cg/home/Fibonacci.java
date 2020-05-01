package com.cg.home;

import java.util.Scanner;

public class Fibonacci {
	int n;
	static int fib(int n)
	{
		if (n==0){
			return 0;
			
		}
		if (n==1|| n==2){
			return 1;
		}
		return fib(n-2)+fib(n-1);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the value of n: ");
		int n=sc.nextInt();
		System.out.println("fibonacci series: "+n+ " numbers: ");
		for(int i=1;i<n;i++){
			System.out.println(fib(i)+" ");
		}
		System.out.println("the " +n+"th of the series is: "+fib(n));
	}

}
