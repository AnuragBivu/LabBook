
package com.cg.home;

import java.util.*;

public class MirrorImage {
	public static String getImage(String str) {
		return new StringBuilder(str).reverse().toString();
	}

	public static void main(String[] args) {
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		str = sc.nextLine();
		String temp=str;
		str = getImage(str);
		String str1= temp+ '|'+str;
		System.out.println(str1);
	}
}