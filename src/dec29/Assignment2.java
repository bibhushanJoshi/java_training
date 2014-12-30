package dec29;

import java.util.Scanner;

/*
 *
 *
 * 1. Write a program that displays the temperatures from 0 degrees Celsius to 100
 *	 degrees Celsius and its Fahrenheit equivalent. Note that the conversion from
 *	 Celsius to Fahrenheit uses the following formula: F = C * 9/5 + 32;
 *
 * 2. A palindrome is a sequence of characters that reads the same backward as forward.
 * 	 For example, each of the following five-digit integers  * is a palindrome: 12321,
 * 	 55555, 45554 and 11611. Write an application that reads in a five-digit integer 
 *	and determines whether it is a palindrome. If the number is not five digits long, 
 * 	display an error message and allow the user to enter a new value.
 *
 * 3. Write a program to find the number of and sum of all integers greater than 100 
 * 	and less than 200 that are divisible by 7.
 *
 * 4. Write a program using switch statement to develop a simple calculator for +, -, *,
 * 	 /, and % operators.
 *
 *
 */
/**
 * 
 * This class uses switch case to give user the option to do: Evaluation of the
 * temperature from 0°C to 100°C. Also with its conversion in Fahrenheit
 * Calculation of number by using different operator and using switch case.
 * Calculation of the palindrome number for 5 digit number sum of all integers
 * greater than 100 and less than 200 and divisible by 7
 * 
 * @author Bibhushan Raj Joshi
 */

public class Assignment2 {

	private static Scanner scan;

	public static void main(String[] args) {
		int choice;

		System.out.println("choices: ");
		System.out.println("1:Temperature Converter");
		System.out.println("2:Palindrome checker");
		System.out.println("3:Sum of number greater than 100-200 divisible by 7");
		System.out.println("4:Calculator");
		scan = new Scanner(System.in);
		choice = scan.nextInt();

		switch (choice) {
		case 1:
			tempConverter();
			break;
		case 2:
			palindrome();
			break;
		case 3:
			numberSum();
			break;
		case 4:
			calculator();
			break;
		}
	}

	// Function for calculator
	public static void calculator() {
		float num1;
		float num2;
		float output = 0;
		int operation;

		System.out.println("Enter two numbers");
		num1 = scan.nextFloat();
		scan = new Scanner(System.in);
		num2 = scan.nextFloat();

		System.out.println("Choose the operation");
		System.out.println("1.add (+)");
		System.out.println("2.subtract (-)");
		System.out.println("3.multiply (*)");
		System.out.println("4.divide (/)");
		System.out.println("5.remainder (%)");

		operation = scan.nextInt();

		switch (operation) {
		case 1:
			output = num1 + num2;
			break;
		case 2:
			output = num1 - num2;
			break;
		case 3:
			output = num1 * num2;
			break;
		case 4:
			output = num1 / num2;
			break;
		case 5:
			output = num1 % num2;
			break;

		}
		System.out.println("The required output is:" + output);
	}

	// Function to sum the number between 100-200
	public static void numberSum() {
		int min = 100;
		int max = 200;
		int sum = 0;

		// sum of number greater than 100 and less than 200
		for (int i = min; i < max; i++) {
			if (i % 7 == 0) {
				System.out.println(i);
				sum = sum + i;
			}
		}
		System.out.println("The required sum is:" + sum);
	}

	// Function to convert the temperature
	public static void tempConverter() {
		float cDegree;
		float fDegree;
		System.out.println("Required temperature: ");

		// celsius to farenheit conversion process
		for (int i = 0; i < 100; i++) {
			cDegree = i;
			fDegree = (cDegree * 9 / 5 + 32);
			System.out.println(cDegree + "°C equals to " + fDegree + "°F");
		}
	}

	// Function to check palindrome number
	public static void palindrome() {
		int temp;
		int num = 0;
		int revnum = 0;
		String numS;
		int tempNum = 0;

		// check length of the number
		do {
			System.out.println("Please enter a 5 digit number:");
			num = scan.nextInt();
			tempNum = num;
			numS = Integer.toString(num);
		} while (numS.length() != 5);

		// reverse number generation
		while (tempNum > 0) {
			temp = tempNum % 10;
			tempNum = tempNum / 10;
			revnum = revnum * 10 + temp;
		}
		System.out.println(revnum);

		// check if reverse number equals to original number
		if (num == revnum)
			System.out.println("The given number is a palindrome");
		else
			System.out.println("The given number is not a palindrome");

	}
}
