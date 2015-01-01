package com.lftechnology.dec31;

import java.util.Scanner;

/**
 * 
 * 1. Write a Guessing a number game application: User will select the guessing
 * value from the keyboard and application will generate a random no between 1
 * and 100. Check if the guess value matched with random no. or not, if matched
 * show the guessing value, random value and the no. of attempts.
 * 
 * 
 * This class for guessing game in which the user has to guess a random number
 * that the program generates.
 * 
 * @author bibhushan
 * 
 */
public class GuessingGame {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean wrongInput = false;
		int guessCount = 0;
		int guessNum = 0;
		int num = randomNumGenerator(1, 100);
		/* System.out.println(num); */
		try {
			do {
				try {
					System.out.println("Guess a random number between 1-100: ");
					guessCount++;
					System.out.println("Guess-" + guessCount + ":");
					guessNum = scan.nextInt();
					wrongInput = false;
				} catch (Exception e) {
					System.out
							.println("Please enter a integer number between 1-100:");
					scan.next();
					wrongInput = true;
				}
			} while (wrongInput || num != guessNum);
		} finally {
			scan.close();
		}
		System.out.println("You have Guessed the right number: " + num);
		System.out.println("Number of Guess attemps:" + guessCount);
	}

	/**
	 * 
	 * This method helps to generate random number.
	 * 
	 * @param min
	 * @param max
	 * @return a int value which a random number generated between min and max
	 */
	public static int randomNumGenerator(int min, int max) {
		return (int) (Math.random() * max) + min;
	}
}
