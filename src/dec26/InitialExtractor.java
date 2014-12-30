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
 * 
 * @author bibhushan
 *
 */

public class InitialExtractor {

	private static Scanner scan;

	public static void main(String[] args) {
		
		String tempName;
		String [] name;

		do{
			System.out.println("Enter name with Initials:");
			scan = new Scanner(System.in);
			tempName = scan.nextLine();
			name = tempName.split(" ");
		}while(name.length == 1);
		System.out.println("Initial:"+name[0]);
	}
}
