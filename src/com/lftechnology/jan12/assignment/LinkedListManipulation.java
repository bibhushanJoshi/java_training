package com.lftechnology.jan12.assignment;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * <ul>
 * <li>a. Create a linked list named one and two.</li>
 * <li>b. Add some elements to both one (one, two, three, four, five) and two (six, seven, eight, nine, and ten).</li>
 * <li>c. Merge the words from two into one.</li>
 * <li>d. Remove every second word from two.</li>
 * <li>e. Remove all words in two from one.</li>
 * <li>f. Print the value after each operation.</li>
 * </ul>
 * 
 * @author bibhushan<bibhushanjoshi@lftechnology.com>
 * 
 */
public class LinkedListManipulation {
	private static final Logger LOGGER = Logger.getLogger(LinkedListManipulation.class.getName());

	public static void main(String[] args) {
		List<String> one = new LinkedList<String>(Arrays.asList("one", "two", "three", "four", "five"));
		List<String> two = new LinkedList<String>(Arrays.asList("six", "seven", "eight", "nine", "ten"));
		LOGGER.log(Level.INFO, "Given Lists are:\n {0} \n {1}", new Object[] { one, two });
		// adds the given two linked list
		one.addAll(two);
		LOGGER.log(Level.INFO, "After two list added: {0}", one);
		// removes every second element from linked list
		removeSecond(one);
		LOGGER.log(Level.INFO, "After second element removed: {0}", one);
		// removes every remaining element of linked list two(second list)
		one.removeAll(two);
		LOGGER.log(Level.INFO, "After all second list element removed: {0} ", one);
	}

	/**
	 * This method takes in {@link LinkedList} and removes every second element from the list
	 * 
	 * @param inputList
	 *            {@link LinkedList} from which every second element is to be removed
	 * 
	 * @author bibhushan<bibhushanjoshi@lftechnology.com>
	 */
	public static void removeSecond(List<String> inputList) {
		int length = inputList.size();
		for (int i = 0; i < length / 2; i++) {
			inputList.remove(i + 1);
		}
	}
}
