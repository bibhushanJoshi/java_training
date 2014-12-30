package dec26;
import java.util.Scanner;

/*
 * WAP that computes your Initial from your full name and displays them.
 * 
 */

/**
 * 
 * @author bibhushan
 *
 */

public class InitialExtractor {

	private static Scanner scan;

	public static void main(String[] args) {
		String s;
		System.out.println("Enter name with Initials:");
		scan = new Scanner(System.in);
		s = scan.nextLine();
		String[] name = s.split(" ");
		System.out.println("Initial:"+name[0]);
	}

}
