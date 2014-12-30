package dec26;
import java.util.Scanner;

public class CreateFullName {

		private static Scanner scan;

		public static void main(String[] args) {
			String fN;
			String mN;
			String lN;
			String initial;
			
			//get initial
			System.out.println("Enter name with Initials:");
			scan = new Scanner(System.in);
			initial = scan.nextLine();
			initial = initial.toUpperCase();
			
			//get first name
			System.out.println("Enter name with First Name:");
			scan = new Scanner(System.in);
			fN = scan.nextLine();
			
			//get first name
			System.out.println("Enter name with Middel Name:");
			scan = new Scanner(System.in);
			mN = scan.nextLine();
			
			//get first name
			System.out.println("Enter name with Last Name:");
			scan = new Scanner(System.in);
			lN = scan.nextLine();
			
			//concatenate of all the strings
			StringBuilder fullName = new StringBuilder();
			fullName.append(initial).append(".").append(" ").append(fN).append(" ").append(mN).append(" ").append(lN);
			System.out.println(fullName);
	}

}
