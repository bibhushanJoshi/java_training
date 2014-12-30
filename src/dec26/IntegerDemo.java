package dec26;
import java.util.Scanner;

/*
 * WAP called IntegerDemo which accepts Integer value beyond its range.Try to print
 * & see what exception the system throws.
 */

/**
 * 
 * @author bibhushan
 *
 */

public class IntegerDemo {
	private static final Scanner SCANNER = new Scanner(System.in);

	public static void main (String args[]){
		try {
			System.out.println("Enter integer number: ");
			int num = SCANNER.nextInt();
			System.out.println("The required value is:"+num);
		} catch (Exception e) {
		    System.out.println(e.getMessage()+" out of range");
		}
	}
}
