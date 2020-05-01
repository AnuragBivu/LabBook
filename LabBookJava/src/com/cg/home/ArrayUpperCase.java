package com.cg.home;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayUpperCase {

	public static void main(String[] args) {
	     String temp=null;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Size of the array you want to create");
		int size=sc.nextInt();
		String[] strArray=new String[size];
		System.out.println("Enter the String elements");
		for(int i=0;i<strArray.length;i++)
		{
			 String x=sc.next();
			 strArray[i]=x;
		 }
		for(int i=0;i<strArray.length;i++)
		{
			for (int j = i+1; j < strArray.length; j++) 
			{
				if(strArray[i].compareTo(strArray[j])>0)
				{
					temp=strArray[i];
					strArray[i]=strArray[j];
					strArray[j]=temp;
				}
	      
				
			}
			
		}
		 System.out.println("Strings in Sorted Order:" +Arrays.toString(strArray));
		
	 if(strArray.length%2!=0)
	 {
		 for(int i=0;i<(((strArray.length)/2)+1);i++)
		 {
			 strArray[i]=(strArray[i].toUpperCase());
		 }
		 for(int i=((strArray.length)+1);i<=strArray.length;i++)
		 {
			 strArray[i]=(strArray[i].toLowerCase());
		 }
		 for(int i=0;i<strArray.length;i++)
		 {
		 System.out.println(strArray[i]);
		 }
	 }
	 else
	 {
		 for(int i=0;i<(((strArray.length)/2));i++)
				 {
			        strArray[i]=(strArray[i].toUpperCase());
				 }
		 for(int i=0;i>(((strArray.length)/2)+1)&&i<strArray.length;i++)
		 {
			 strArray[i]=(strArray[i].toLowerCase());
		 }
		 for(int i=0;i<strArray.length;i++)
		 {
		 System.out.println(strArray[i]);
		 }
		 
	 }

}}
