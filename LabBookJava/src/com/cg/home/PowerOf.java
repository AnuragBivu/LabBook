package com.cg.home;

public class PowerOf {
	static boolean checkNumber(int n) {
		if (n == 0)
			return false;
		while (n != 1) {
			if (n % 2 != 0)
				return false;
			n = n / 2;

		}
		return true;
	}

	public static void main(String[] args) {
		if (checkNumber(8))
			System.out.println("true");
		else 
			System.out.println("false");

	}

}
