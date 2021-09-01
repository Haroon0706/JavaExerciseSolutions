package com.qa.helloworld;

public class BasicArrays {

	public static void main(String[] args) {

		basicArray();
		arrayManipulation();
		arrayManipulationExercise();

	}

// Exercise -
// Create 4 arrays for the following fields, names,
// favColour, favNumber, likesPineappleOnPizza for 5 random people
// System.out atleast 1 different index from each array
// Stretch goal - To alter / modify an existing value in an array

	public static void basicArray() {

		String[] nameArray = { "Jacob", "Kate", "Robin", "Ted", "Barney" };

		String[] favColour = { "Red", "Blue", "Green", "Yellow", "Purple" };

		int[] favNumber = { 77, 10, 231, 2, 51 };

		boolean[] likesPineappleOnPizza = { true, true, false, true, false };

		System.out.println(nameArray[3]);

		System.out.println(favColour[0]);

		for (int i = 0; i <= 4; i++) {

			System.out.println(favNumber[i]);

		}

		System.out.println(likesPineappleOnPizza[2]);

	}

	public static void arrayManipulation() {

//		Creating an empty array of length 4

		String[] pizzaArray = new String[4];

		System.out.println(pizzaArray[2]);

		pizzaArray[2] = "Pepperoni";

		System.out.println(pizzaArray[2]);

		pizzaArray[2] = "Hawwaiaan";

		System.out.println(pizzaArray[2]);

//		Create an array of random numbers of length 5

		float[] floatArray = { 52.45f, 13.63f, 78.96f, 123.45f, 0.78f };

		System.out.println(floatArray[1]);
		floatArray[1] = 5678.85f;
		System.out.println(floatArray[1]);

	}

	public static void arrayManipulationExercise() {

// Exercise - Either doing it manually OR using a for loop,
// modify the fav numbers you've got to their squared values
// favNumber[1] = 9
// favNumber[1] = 81

		int[] favNumber = { 77, 10, 231, 2, 51 };

		for (int i = 0; i <= 4; i++) {
			
			int number = favNumber[i];
			int squaredNumber = number * number;
			
			System.out.println(number);
			
			System.out.println(squaredNumber);
			
//			permanently modify array
			
			favNumber[i] = squaredNumber;
			
		}

	}

}
