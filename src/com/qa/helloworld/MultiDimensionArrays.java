package com.qa.helloworld;

public class MultiDimensionArrays {
	
	public static void main(String[] args) {
		
		multiDimensionDemo();
		multiDimensionLoop();
		
	}
	
//	Previous arrays covered were single dimension arrays
//	A single axis from 0 - max length with values in between
	
//	Multi dimension arrays are more sophisticated with each "dimension" being a nested array
//	Nested - Contains something
//	Nested array - Array containing an array as a value/element
	
	public static void multiDimensionDemo() {
		
//		Single dimension array
		int[] idArray = {1, 56, 36, 78};
		
		
//		Arrays containing arrays
//		Array of arrays containing 2x ints
//		2D array
		
		int[][] gridArray = {{24,32}, {17,89}, {83,62}};
		
//		an array of 3 values each value contains 2 values		
		int [][] emptyGridArray = new int[3][2];
		
//		How to system out 89
		System.out.println(gridArray[1][1]);
		
	}
	
	
	public static void multiDimensionLoop() {
		
		int[][] gridArray = {{24,32,45}, {17,89,47}, {83,62,123}};
		
//		2D+ arrays can be looped through using nested loops
		
//		gridArray contains arrays of ints and not just ints
//		int [] must be used
		
		for (int[] parentArray: gridArray) {
//			For every integer in the parent array do this
			for(int child: parentArray) {
				System.out.println(child);
			}
		}
	}

}
