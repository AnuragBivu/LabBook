package com.cg.home;

import java.util.Scanner;

public class SecondSmallest {

	public static void main(String[] args) {
		int min = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of element you want to enter");
		int n = scan.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter the value You want to stoere in " + i + "th position");
			int x = scan.nextInt();
			a[i] = x;
		}
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (a[i] > a[j]) {
					min = a[i];
					a[i] = a[j];
					a[j] = min;
				}

			}

		}
		System.out.println("The Second Smallest element in the array is :" + a[1]);
	}
}
