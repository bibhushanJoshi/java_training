package dec26;
import java.util.Scanner;

/*
 * WAP called IntegerDemo which accepts Integer value beyond its range.Try to print
 * 
 */

/**
 * 
 * @author bibhushan
 *
 */

public class IntegerDemo {
	
	private static Scanner scan;

	public static void main (String args[]){
		try {
			System.out.println("Enter integer number: ");
			scan = new Scanner(System.in);
			int num = scan.nextInt();
			System.out.println("The required value is:"+num);
		} catch (Exception e) {
		    System.out.println("out of range");
		}
	}
}
