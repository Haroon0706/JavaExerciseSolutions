package com.qa.helloworld;

public class SwitchCase {
	
	public static void main(String[] args) {
		
		switchCaseMethod();
		
	}
	
	public static void switchCaseMethod() {
		
		String day = "Thursday";
				
		switch(day) {
		
		case "Monday":
			System.out.println("The day is Monday!");
			break;
			
		case "Tuesday":
			System.out.println("The day is Tuesday!");
			break;
			
		case "Wednesday":
			System.out.println("The day is Wednesday!");
			break;
			
		default:
			System.out.println("Not a day of the week :( ");
		}
	}

}
