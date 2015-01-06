package com.lftechnology.jan5;

import java.util.Scanner;
import java.util.logging.Logger;

/**
 * Compare if two arrays have the same content (in the same order)
 * 
 * This class is use to compare to two arrays in which values are in same order.
 * 
 * @author bibhushan<bibhushanjoshi@lftechnology.com>
 * 
 */
public class ArrayCompare {

	private static Logger log = Logger.getLogger(ArraySearch.class.getName());

	public static void main(String[] args) {
		String[] arrayInput1 = new String[5];
		String[] arrayInput2 = new String[5];
		Scanner scan = new Scanner(System.in);
		log.info("Enter 5 values for first Array");
		takeInput(scan, arrayInput1);
		log.info("Enter 5 values for second Array");
		takeInput(scan, arrayInput2);
		if (compareArray(arrayInput1, arrayInput2)) {
			log.info("The two arrays have same content");
		} else {
			log.info("The two arrays have different content");
		}
		scan.close();
	}

	/**
	 * Takes input from the user and set it on an array.
	 * 
	 * @param scan
	 * @param array
	 */
	public static void takeInput(Scanner scan, String[] array) {
		for (int i = 0; i < array.length; i++) {
			log.info("Enter value " + (i + 1));
			array[i] = scan.nextLine();
		}
	}

	/**
	 * This method compares given two array contents.
	 * 
	 * @param arrayInput1
	 * @param arrayInput2
	 * @return
	 */
	public static boolean compareArray(String[] arrayInput1,
			String[] arrayInput2) {
		boolean sameContent = false;
		for (int i = 0; i < arrayInput1.length; i++) {
			if (arrayInput1[i].equalsIgnoreCase(arrayInput2[i])) {
				sameContent = true;
			} else {
				sameContent = false;
				break;
			}
		}
		return sameContent;
	}
}