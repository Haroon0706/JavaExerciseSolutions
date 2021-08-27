package com.qa.helloworld;

public class HelloWorld {

	public static void main(String[] args) {
		String message = "Hello World!";
		System.out.println(message);
		printMessage("Hello World!");
	}
	
	public static void printMessage(String message) {
		System.out.println(message);
	}
	
}

