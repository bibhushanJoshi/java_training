package com.lftechnology.jan5;

import java.util.Scanner;
import java.util.logging.Logger;

/**
 * Search for a specific value in an array.
 * 
 * This class takes in specific values in an array. Then uses
 * {@link ArraySearch#takeInput(Scanner)} to take inputs values from user and
 * {@link ArraySearch#searchValue(Scanner)} to search the definite value from
 * the list of inputs.
 * 
 * @author bibhushan<bibhushanjoshi@lftechnology.com>
 * 
 */

public class ArraySearch {
	private static Logger log = Logger.getLogger(ArraySearch.class.getName());
	private static String[] searchListArray = new String[5];

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try {
			log.info("Enter 5 values:");
			takeInput(scan);
			searchValue(scan);
		} finally {
			scan.close();
		}
	}

	/**
	 * This method is used to takes input from user and stores it in an array.
	 * 
	 * @param scan
	 */
	public static void takeInput(Scanner scan) {
		int arrayLength = searchListArray.length;
		for (int i = 0; i < arrayLength; i++) {
			log.info("Enter value " + (i + 1));
			searchListArray[i] = scan.nextLine();
		}
	}

	/**
	 * This method takes in value to be searched, and prints if value is not
	 * present with respect to return value from method
	 * {@link ArraySearch#checkPreseceValue(String)}
	 * 
	 * @param scan
	 */
	public static void searchValue(Scanner scan) {
		log.info("Enter the value to be searched");
		String searchValue = scan.nextLine();
		if (!checkPreseceValue(searchValue)) {
			log.info("Searched value is not present");
		}
	}

	/**
	 * This method check for the presence of specific values. The value is
	 * searched from the list of values in an array.
	 * 
	 * @param searchValue
	 * @return
	 */
	public static boolean checkPreseceValue(String searchValue) {
		boolean searchValuePresence = false;
		int count = 0;
		for (int i = 0; i < searchListArray.length; i++) {
			if (searchListArray[i].equalsIgnoreCase(searchValue)) {
				searchValuePresence = true;
				log.info("The value " + searchValue
						+ " is present in the given array at position "
						+ (i + 1));
			} else {
				count++;
				if (count == searchListArray.length) {
					searchValuePresence = false;
				}
			}
		}
		return searchValuePresence;
	}
}
