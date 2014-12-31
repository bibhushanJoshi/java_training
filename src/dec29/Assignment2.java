package dec29;

import java.util.Scanner;

/*
 *
 *
 * 1. Write a program that displays the temperatures from 0 degrees Celsius to 100
 *	 degrees Celsius and its Fahrenheit equivalent. Note that the conversion from
 *	 Celsius to Fahrenheit uses the following formula: F = C * 9/5 + 32;
 *
 * 2. Write a program to find the number of and sum of all integers greater than 100 
 * 	and less than 200 that are divisible by 7.
 *
 *
 *
 */
/**
 * 
 * This class uses switch case to give user the option to do: Evaluation of the
 * temperature from 0°C to 100°C. Also with its conversion in Fahrenheit
 * greater than 100 and less than 200 and divisible by 7
 * 
 * @author Bibhushan Raj Joshi
 */

public class Assignment2 {

	private static Scanner scan;

	public static void main(String[] args) {
		int choice = 0;
		scan = new Scanner(System.in);
		
		System.out.println("choices: ");
		System.out.println("1:Temperature Converter");
		System.out.println("2:Sum of number greater than 100-200 divisible by 7");
		
		choice = scan.nextInt();

		switch (choice) {
		case 1:
			tempConverter();
			break;
		case 2:
			numberSum();
			break;
		default:
			System.out.println("Error : wrong choice");
			break;
		}
	}

	
	// Function to sum the number between 100-200
	public static void numberSum() {
		int min = 101;
		int max = 200;
		int sum = 0;
		int count = 0;

		// sum of number greater than 100 and less than 200
		for (int i = min; i < max; i++) {
			if (i % 7 == 0) {
				count++;
				System.out.println(count+"\t"+i);
				sum = sum + i;
			}
		}
		System.out.println("The required sum is:" + sum);
	}

	// Function to convert the temperature
	public static void tempConverter() {
		float cDegree = 0;
		float fDegree = 0;
		int count = 0;
		
		System.out.println("Required temperature: ");

		// celsius to farenheit conversion process
		int i = 0;
		for (i=0; i < 100; i++) {
			cDegree = i;
			fDegree = (cDegree * 9 / 5 + 32);
			count++;
			System.out.println(count+"\t"+cDegree + "°C equals to " + fDegree + "°F");
		}
	}
}
