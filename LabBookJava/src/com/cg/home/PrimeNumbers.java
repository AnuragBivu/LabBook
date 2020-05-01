package com.cg.home;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		int num;
		int promt;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the number: ");
		num=sc.nextInt();
		for (int i=2;i<num;i++)
		{
			promt=0;
			for (int j=2;j<i;j++)
			{
				if(i%j==0)
					promt=1;
			}
			if (promt==0)
				System.out.println(i);
		}

	}

}
