package dec26;
import java.util.Scanner;

/*
 * WAP that computes your Initial from your full name and displays them.
 * 
 */

/**
 * 
 * InitialExtractor class gets the name of the user and splits the name of the user to
 * get initial of the user.
 * 
 * 
 * @author bibhushan
 *
 */

public class InitialExtractor {

	private static Scanner scan;

	public static void main(String[] args) {
		String tempName;
		System.out.println("Enter name with Initials:");
		scan = new Scanner(System.in);
		tempName = scan.nextLine();
		String[] name = tempName.split(" ");
		System.out.println("Initial:"+name[0]);
	}
}
