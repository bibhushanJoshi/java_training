package dec29;

import java.util.Scanner;

/**
 * 
 * 
 * 2. A palindrome is a sequence of characters that reads the same backward as
 * forward. For example, each of the following five-digit integers * is a
 * palindrome: 12321, 55555, 45554 and 11611. Write an application that reads in
 * a five-digit integer and determines whether it is a palindrome. If the number
 * is not five digits long, display an error message and allow the user to enter
 * a new value.
 * 
 * 
 * 
 * This class scan a 5 digit integer number from the user. The scan number is
 * then reversed and later checked with original number to find whether the
 * given number is a palindrome.
 * 
 * @author Bibhushan Raj Joshi
 */

public class CheckPalindrome {

	private static Scanner scan;

	public static void main(String[] args) {
		int num = 0;
		int revNum = 0;
		String numS;
		int tempNum = 0;
		boolean wrongInput = false;
		scan = new Scanner(System.in);

		/* check length of the number and whether the number is integer */
		do {
			do {
				System.out.println("Please enter a 5 digit number:");
				try {
					num = scan.nextInt();
					wrongInput = false;
				} catch (Exception e) {
					System.out
							.println("Error : Please enter interger number \n");
					scan.next();
					wrongInput = true;
				}
			} while (wrongInput);
			tempNum = num;
			numS = Integer.toString(num);
		} while (numS.length() != 5);

		/* reverse number generation */
		int temp = 0;
		while (tempNum > 0) {
			temp = tempNum % 10;
			tempNum = tempNum / 10;
			revNum = revNum * 10 + temp;
		}

		/* check if reverse number equals to original number */
		if (num == revNum) {
			System.out.println("The given number " + num
					+ " is a palindrome number");
		} else {
			System.out.println("The given number " + num
					+ " is not a palindrome number");
		}
	}
}
