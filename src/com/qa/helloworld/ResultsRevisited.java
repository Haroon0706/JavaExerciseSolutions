package com.qa.helloworld;

public class ResultsRevisited {
	
	public static void main(String[] args) {
		double biology = 150;
		double chemistry = 150;
		double physics = 150;
		double total = biology + chemistry + physics;
		double percentage = (total/450)*100;
		
		displayResults(biology, chemistry, biology, total);
		displayPercentage(percentage);
		
	}
	
	public static void displayResults(double physics, double chemistry, double biology, double total) {
		System.out.println("Biology: " + biology);
		System.out.println("Chemistry: " + chemistry);
		System.out.println("Physics: " + physics);
		System.out.println("Total: " + total);
	}
	
	public static void displayPercentage(double percentage) {
		System.out.println("Percentage: " + percentage);
	}

}
