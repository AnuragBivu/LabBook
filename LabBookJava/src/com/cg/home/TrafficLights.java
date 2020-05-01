package com.cg.home;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TrafficLights {
	public static void getLights()
	{
		Scanner sc= new Scanner (System.in);
		int choice =0;
		while (true)
		{
			System.out.println("Enter the color option: ");
			choice=getChoice(sc);
			switch (choice) {
			case 1:
				System.out.println("STOP");
				break;
			case 2:
				System.out.println("READY TO GO");
				break;
			case 3:
				System.out.println("GO");
				break;

			default:
				System.out.println("PLEASE ENTER UR CHOICE BETWEEN 1-3");
				break;
			}
		}
	}

	private static int getChoice(Scanner sc) {
		int choice = 0;
		System.out.println("1. RED");
		System.out.println("2. YELLOW");
		System.out.println("3. GREEN");
		System.out.println(" Enter Your Choice");
		try {
			choice = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("please enter a number nothing else");
			sc.nextLine();
		}
		return choice;
	}

	public static void main(String[] args) {
		
		getLights();
	
	}

}