package com.lftechnology.jan12.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Create an array list with 49 Integer objects containing the numbers 1 through 49. It then randomly shuffles the list and selects the
 * first 6 values from the shuffled list. Finally, it sorts the selected values and prints them out. Hint: Use ArrayList,
 * Collections.shuffle(), ArrayList.subList(), and Collection.sort().
 * 
 * This class takes in adds 49 integer objects containing the numbers 1 through 49. Then randomly takes in 6 objects and displays them out.
 * 
 * @author bibhushan<bibhushanjoshi@lftechnology.com>
 * 
 */
public class ListShuffleRearrange {
	private static final Logger LOGGER = Logger.getLogger(ListShuffleRearrange.class.getName());
	private static final int SORT_VALUE = 6;

	public static void main(String[] args) {
		List<Integer> integerList = new ArrayList<Integer>();
		// add value to list
		insertListValues(integerList, 1, 49);
		LOGGER.log(Level.INFO, "The original List value  is " + integerList);
		// Shuffle of the list
		Collections.shuffle(integerList);
		LOGGER.log(Level.INFO, "The List value after shuffle is " + integerList);
		// Sorting of sublist
		List<Integer> sortedList = integerList.subList(0, SORT_VALUE);
		LOGGER.log(Level.INFO, "The List value after sorting is " + sortedList);
	}

	/**
	 * inserts {@link Integer} value form <code>start</code> to <code>end</code> to the {@link List}
	 * 
	 * @param numbers
	 * @{link List} in which the the values are inserted
	 * @param start
	 *            {@link Integer} value from which adding starts
	 * @param end
	 *            {@link Integer} value till which the value is added
	 * 
	 * @author bibhushan<bibhushanjoshi@lftechnology.com>
	 */
	public static void insertListValues(List<Integer> numbers, int start, int end) {
		for (int i = start; i <= end; i++) {
			numbers.add(i);
		}
	}
}
