package com.lftechnology.jan5;

import java.util.logging.Logger;

/**
 * 3. Compare if two arrays have the same content (doesn't matter if they aren't
 * in order)
 * 
 * This class takes in two arrays and compares if the two arrays have same
 * content when the order of value is not same.
 * 
 * @author bibhushan<bibhushanjoshi@lftechnology.com>
 * 
 */
public class DifferentOrderCompare {
	private static Logger log = Logger.getLogger(DifferentOrderCompare.class
			.getName());

	public static void main(String[] args) {
		String[] arrayInput1 = { "abc", "abc", "abc", "name", "nnn" };
		String[] arrayInput2 = { "abc", "abc", "df", "name", "s" };

		if (compareArray(arrayInput1, arrayInput2)) {
			log.info("The two arrays have same content");
		} else {
			log.info("The two arrays have different content");
		}
	}

	/**
	 * This method compares the two array by comparing the word count of each
	 * word present in the array.
	 * 
	 * @param arrayInput1
	 * @param arrayInput2
	 * @return
	 */
	public static boolean compareArray(String[] arrayInput1,
			String[] arrayInput2) {
		boolean sameContent = false;
		if (arrayInput1.length != arrayInput2.length) {
			sameContent = false;
			log.info("Length of two array is different");
		} else {
			int arrayLength = arrayInput1.length;
			for (int i = 0; i < arrayLength; i++) {
				if (wordCount(arrayInput1[i], arrayInput1) == wordCount(
						arrayInput1[i], arrayInput2)) {
					sameContent = true;
				} else {
					log.info("Required no of word " + arrayInput1[i]
							+ " not present");
					sameContent = false;
					break;
				}
			}
		}
		return sameContent;
	}

	/**
	 * Gives the word count of the given word in an array.
	 * 
	 * @param compareWord
	 * @param array
	 * @return
	 */
	public static int wordCount(String compareWord, String[] array) {
		int counter = 0;
		int arrayLength = array.length;
		for (int i = 0; i < arrayLength; i++) {
			if (compareWord == array[i]) {
				counter++;
			}
		}
		return counter;
	}
}