package com.qa.helloworld;

public class Blackjack {

	public static void main(String[] Args) {
		System.out.println(blackJack(27, 24));
		System.out.println(uniqueSum(2, 4, 4));
	}

	public static int blackJack(int num1, int num2) {
		if (num1 > 0 || num2 > 0) {
			if (num1 > 21 && num2 > 21)
				return 0;
			else if (num1 > 21)
				return num2;
			else if (num2 > 21)
				return num1;
			else if ((21 - num1) < (21 - num2)) {
				return num1;
			} else {
				return num2;
			}
		}

		return 0;
	}

	public static int uniqueSum(int num1, int num2, int num3) {
		if (num1 == num2 && num2 == num3)
			return 0;
		else if (num1 == num2)
			return num3;
		else if (num1 == num3)
			return num2;
		else if (num2 == num3)
			return num1;
		else
			return num1 + num2 + num3;
	}

}
