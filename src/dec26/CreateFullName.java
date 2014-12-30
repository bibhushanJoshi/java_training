package dec26;

import java.util.Scanner;

/*
 * WAP which gets 4 arguments from console: initial, firstname, middlename and lastname.
 * Then displays as a full-name.
 */

/**
 * 
 * @author bibhushan
 * 
 */

public class CreateFullName {

	private static Scanner scan;

	public static void main(String[] args) {
		String firstName;
		String middleName;
		String lastName;
		String initial;
		scan = new Scanner(System.in);

		// get initial
		System.out.println("Enter name with Initials:");
		initial = scan.nextLine();
		initial = initial.toUpperCase();

		// get first name
		System.out.println("Enter name with First Name:");
		firstName = scan.nextLine();

		// get first name
		System.out.println("Enter name with Middel Name:");
		middleName = scan.nextLine();

		// get first name
		System.out.println("Enter name with Last Name:");
		lastName = scan.nextLine();

		// concatenate of all the strings
		StringBuilder fullName = new StringBuilder();
		fullName.append(initial).append(".").append(" ").append(firstName)
				.append(" ").append(middleName).append(" ").append(lastName);
		System.out.println("Your full name is: " + fullName);
	}
}
