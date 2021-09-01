package com.qa.helloworld;

public class EnhancedForLoops {
	
	public static void main(String[] args) {
		
//		enhancedForLoop();
		enhancedForLoopExercise();
		
	}
	
	public static void enhancedForLoop() {
		
		int[] intArray = {1,2,3,4,5,6,7,8};
		
		System.out.println(intArray.length);
		
		for(int i = 0; i < intArray.length; i++) {
			int number = intArray[i];
			System.out.println(number);
		}
		
		String[] nameArray = {"Greg", "Katie", "Alice", "Oscar"};
		
		for (String name: nameArray) {
			
			System.out.println(name);
		}
		
		for (int number: intArray) {
			
			System.out.println(number);
		}
		
	}
	
	public static void enhancedForLoopExercise() {
		
		int[] favNumber = { 77, 10, 231, 2, 51 };
		
		int[] squaredArray = new int[favNumber.length];
		int indexNumber = 0;
		

		for (int number: favNumber) {
			
			int squaredNumber = number * number;
			
			System.out.println(number);
			
			System.out.println(squaredNumber);
			
			squaredArray[indexNumber] = squaredNumber;
			indexNumber++;
			
			}
		
		for (int squaredNum: squaredArray) {
			System.out.println(squaredNum);
		}
		
		int[] reversedSquaredArray = new int[favNumber.length];
		
		int indexNumber2 = favNumber.length -1;
		
		for (int number: favNumber) {
			
			int squaredNumber = number * number;
			
			System.out.println(number);
			
			System.out.println(squaredNumber);
			
			reversedSquaredArray[indexNumber2] = squaredNumber;
			indexNumber2--;
			
			
		
		}
		
		for (int reverseNum: reversedSquaredArray) {
			
			System.out.println(reverseNum);
		}
	
	}
}