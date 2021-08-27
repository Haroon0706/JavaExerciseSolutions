package com.qa.helloworld;

public class Calculator {
	
	public static void main(String[] args) {
		addInt(7, 3);
		multInt(20, 5);
		subInt(17, 4);
		diviInt(38, 5);
	}
	
	public static void addInt(int i, int j) {
		int result = (i+j);
		System.out.println(result);
	}
	
	public static void multInt(int i, int j) {
		int result = (i*j);
		System.out.println(result);
	}
	
	public static void subInt(int i, int j) {
		int result = (i-j);
		System.out.println(result);
	}
	
	public static void diviInt(double i, double j) {
		double result = (i/j);
		System.out.println(result);
	}
}