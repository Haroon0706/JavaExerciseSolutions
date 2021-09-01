package com.qa.helloworld;

public class ForLoops {
	
	// Exercise - Using a For Loop that starts with 8 and subtracts 1 each time
	// Logs out "1 pizza slice eaten, there are x slices left"
	// When there are only 2 slices left, loop carries on but prints out 
	// "time to get another pizza"
	
	public static void main(String[] args) {
		
//		pizzaAlert();
		commandWordDemo();
		
	}
	
	public static void pizzaAlert() {
		
		for (int i = 7; i >= 0; i--) {
			
			
			System.out.println("1 Pizza slice eaten, there are " + i + " slices left");
			
			if (i <= 2) {
				
				System.out.println("Time to get another pizza");
			}
		}
	}
	
	public static void commandWordDemo() {
		
		for (int i = 0; i < 20; i += 3) {
			
			if (i == 6) {
				continue;
			} else if (i == 12) {
				break;				
			} else {
				System.out.println(i);
			}
		}
		
	}
	
}
	