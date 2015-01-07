package com.lftechnology.jan5;

import java.util.Arrays;
import java.util.logging.Logger;

/**
 * 3. Compare if two arrays have the same content (doesn't matter if they aren't in order)
 * 
 * This class takes in two arrays and compares if the two arrays have same content when the order of value is not same.
 * 
 * @author bibhushan<bibhushanjoshi@lftechnology.com>
 * 
 */
public class DifferentOrderCompare {
	private static final Logger LOGGER = Logger.getLogger(DifferentOrderCompare.class.getName());

	public static void main(String[] args) {
		String[] arrayInput1 = { "abc", "abc", "abc", "name", "nnn" };
		String[] arrayInput2 = { "abc", "abc", "abc", "name", "nnn" };

		if (compareArray(arrayInput1, arrayInput2)) {
			LOGGER.info("The two arrays have same content");
		} else {
			LOGGER.info("The two arrays have different content");
		}
	}

	/**
	 * This method compares the two array by comparing the word count of each word present in the array.
	 * 
	 * @param arrayInput1
	 * @param arrayInput2
	 * @return
	 */
	private static boolean compareArray(String[] arrayInput1, String[] arrayInput2) {
		boolean sameContent = false;
		if (arrayInput1.length != arrayInput2.length) {
			sameContent = false;
			LOGGER.info("Length of two array is different");
		} else {
			Arrays.sort(arrayInput1);
			Arrays.sort(arrayInput2);
			int arrayLength = arrayInput1.length;
			for (int i = 0; i < arrayLength; i++) {
				if (arrayInput1[i] == arrayInput2[i]) {
					sameContent = true;
				} else {
					sameContent = false;
					break;
				}
			}
		}
		return sameContent;
	}
}