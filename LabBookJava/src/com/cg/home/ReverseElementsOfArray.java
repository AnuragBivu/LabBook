package com.cg.home;

import java.util.Scanner;

public class ReverseElementsOfArray {
	public static void getSorted() {
		int temp = 0;
		int rem;
		int length;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length: ");
		length = sc.nextInt();
		int[] arr = new int[length];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
	
		  for (int i = 0; i < arr.length; i++) { System.out.print(arr[i]+" ");
		  }
		  System.out.println();
		 
		for (int i = 0; i < arr.length; i++) {
			temp=0;
			while (arr[i] > 0) {
				rem = arr[i] % 10;
				temp = temp * 10 + rem;
				arr[i] = arr[i] / 10;
			}
			arr[i]=temp;

		}
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j]+" ");

		}

	}

	public static void main(String[] args) {
		getSorted();

	}

}
