package dec29;

import java.util.Scanner;

/*
*
*
* Write a program using switch statement to develop a simple calculator for +, -, *,
* 	 /, and % operators.
*
*
*/
/**
* 
* This class helps in calculation of the number provided by the user. The two input
* numbers are provided by the user and then after calculation operation is selected
* using a switch case. 
* 
* @author Bibhushan Raj Joshi
*/

public class Calculator {
	
	private static Scanner scan;
	
	public static void main(String[] args) {
		float num1 = 0;
		float num2 = 0;
		float output = 0;
		int operation = 0;
		scan = new Scanner(System.in);
		boolean wrongInput = false;
		
		do {
			try {
				System.out.print("Enter first number: ");
				num1 = scan.nextFloat();
				wrongInput = false;
			} catch (Exception e) {
				System.out.println("Error: Please enter a number \n");
				scan.next();
				wrongInput = true;
			}
		}
		while(wrongInput);

		do {
			try {
				System.out.print("Enter second number: ");
				num2 = scan.nextFloat();
				wrongInput = false;
			} catch (Exception e) {
				System.out.println("Error: Please enter a number \n");
				scan.next();
				wrongInput = true;
			}
		}
		while(wrongInput);

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
			if(num2 == 0){
				System.out.println("Math Error : Division by 0 is not possible");
				System.exit(0);
			}
			else{
				output = num1 / num2;
			}
			break;
		case 5:
			if(num2 ==0){
				System.out.println("Math Error : Division by 0 is not possible");
				System.exit(0);
			}
			else{
				output = num1 % num2;
			}
			break;
			
		default:
			System.out.println("Error : Wrong choice entered");
			break;
		}
		System.out.println("The required output is:" + output);

	}
}
