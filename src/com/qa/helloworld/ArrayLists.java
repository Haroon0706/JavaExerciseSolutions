package com.qa.helloworld;

import java.util.ArrayList;

public class ArrayLists {

	public static void main(String[] args) {
		
		arrayListDemo();

	}

//	Downsides of arrays
//	Arrays are immutable, that means the length of the array
//	or the value of the array (not the value of the elements within) cannot be changed
//	Not as much functionality as other methods
//	Not as simple to read all of the data from an array

//	ArrayLists - A type of collection in Java (Random())
//	Make our arrays resizable and gives us extra functionality to work with

	public static void arrayListDemo() {

//		Create an array of types of pizza	
		String[] pizzaArray = new String[5];
		
//		create an array list for types of pizza
		ArrayList<String> pizzaList = new ArrayList<>();
		
//		Array list methods
		
//		Add - add something to the array list
		pizzaList.add("Pepperoni");
		pizzaList.add("Veggie");
		pizzaList.add("Four Cheese");
		System.out.println(pizzaList);
		
		
//		Get - Gets some data from the array list
		System.out.println(pizzaList.get(1));
		String retrievedPizza = pizzaList.get(1);
		System.out.println(retrievedPizza);
		
		
//		Set - Updating/replacing something in the array list
		pizzaList.set(0, "Pepperoni Passion");
		System.out.println(pizzaList.get(0));
		
//		Remove - removes something from the array list
		pizzaList.remove(1);
		System.out.println(pizzaList);
		
		
//		Size - returns the size/length of the array list
		System.out.println("Before adding pizzas " + pizzaList.size());
		pizzaList.add("Pepperoni");
		pizzaList.add("Veggie");
		pizzaList.add("Four Cheese");
		System.out.println("After adding pizzas " + pizzaList.size());
		
//		For each WORKS EXACTLY THE SAME
		for(String pizza : pizzaList) {
			System.out.println(pizza);
		}

		
//		clear - clears all data from the array list
		System.out.println("Before the clear " + pizzaList);
		pizzaList.clear();
		System.out.println("After the clear " + pizzaList);
		
			
	}

}
