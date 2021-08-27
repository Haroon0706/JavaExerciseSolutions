package com.qa.helloworld;

public class Flowcharts {

	public static void main(String[] args) {
		System.out.println(mathOperator(4, 2, true));
		System.out.println(mathOperator(4, 2, false));
		flowChartOne(400);

	}

	public static int mathOperator(int num1, int num2, boolean getSum) {
		if (getSum) {
			return num1 + num2;
		} else {
			return num1 * num2;
		}

	}

	public static void flowChartOne(int input) {
		if (input > 2000) {
			System.out.println("A");
			if (input > 6000) {
				System.out.println("C");
			} else {
				System.out.println("Print B");
				if (input > 4000) {
					System.out.println("D");
				} else {
					System.out.println("E");
				}
			}
		}

		else {
			System.out.println("1");
			if (input > 100) {
				System.out.println("3");
				if (input > 600) {
					System.out.println("5");
				} else {
					System.out.println("4");
					if (input > 500) {
						System.out.println("6");
					} else {
						System.out.println("7");
					}
				}
			} else {
				System.out.println("2");
			}
		}
	}
}
