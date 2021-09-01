package com.qa.helloworld;

import java.util.Random;

public class DiceGenerator {

//	create a method stack(s) for the following:
//		- Rolling 4 separate 6 sided dice and getting the total number
//		- Rolling 3 separate 6 six sided dice, adding the total to the total of 2 8 sided dice
//		- Roll a 2 sided, 3 sided, 4 sided, 5 sided, 6 sided dice, subtract a 7 sided dice from the total

	public static void main(String[] args) {

		randomDiceRoll();

	}

	public static void randomDiceRoll() {

		int total = 0;

		total += diceRoll();
		total += diceRoll();
		total += diceRoll();
		total += diceRoll();

		System.out.println("The total is " + total);

	}

	public static int diceRoll() {

		int addRoll = new Random().nextInt(6);
		addRoll += 1;
		return addRoll;
	}

}
