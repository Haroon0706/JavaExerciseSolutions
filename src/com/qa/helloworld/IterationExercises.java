package com.qa.helloworld;

public class IterationExercises {
	
	public static void main(String[] args) {
		
//		flowchartOne();
		flowchartTwo();
		
	}
	
	public static void flowchartOne() {
		
		int flowCount = 100;
		boolean flowCountValue = true;
		
		while (flowCountValue) {
			System.out.println(flowCount);
			flowCount++;
		
		if (flowCount > 200) {
			flowCountValue = false;
			}
		
		}
		
		System.out.println("Final value: " + flowCount);
	}
	
	
	public static void flowchartTwo() {
		
		int flowCountTwo = 100;
		boolean flowCountValueTwo = true;
		
		while (flowCountValueTwo) {
			flowCountTwo++;
			
			if (flowCountTwo % 2 == 0) {
				System.out.println("-");
			
			} else {
				System.out.println("*");
		}
			if (flowCountTwo > 200) {
				flowCountValueTwo = false;
				System.out.println("Final value: " + flowCountTwo);
			
		}
			
		}
	}	
	
	public static void flowChartThree() {
		
		for(int i = 1; i<=10; i++) {
			
			
		}
			
	}
	
}
