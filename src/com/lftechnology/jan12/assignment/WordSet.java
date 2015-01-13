package com.lftechnology.jan12.assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Suppose you want to know which words in the argument list occur only once and which occur more than once, but you do not want any
 * duplicates printed out repeatedly. This effect can be achieved by generating two sets one containing every word in the argument list and
 * the other containing only the duplicates. The words that occur only once are the set difference of these two sets
 * 
 * This class get the number of repeated word in a {@link List}.
 * 
 * @author bibhushan<bibhushanjoshi@lftechnology.com>
 * 
 */
public class WordSet {
	private static final Logger LOGGER = Logger.getLogger(ListMaipulation.class.getName());

	public static void main(String[] args) {
		List<String> nameList =
				new ArrayList<String>(Arrays.asList("bib", "ram", "shyam", "ram", "hari", "bib", "rajesh", "pramesh", "bib"));
		LOGGER.log(Level.INFO, "The word count of the given words are : \n {0}", manipulateWord(nameList));
	}

	/**
	 * This method gets the {@link List} String values and return number of times each value is repeated in the {@link List}.
	 * 
	 * @param nameList
	 *            is a {@link List} of which duplicated words are to be counted
	 * @return {@link Map} consisting of the {@link String} value and a {@link Integer} which shows the times the {@link String} value is
	 *         repeated
	 * 
	 * @author bibhushan<bibhushanjoshi@lftechnology.com>
	 */
	public static Map<String, Integer> manipulateWord(List<String> nameList) {
		Map<String, Integer> listValues = new HashMap<String, Integer>();
		Set<String> uniques = new HashSet<String>();
		// insert values of list into a hashSet
		for (String value : nameList) {
			if (!uniques.add(value)) {
				listValues.put(value, listValues.get(value) + 1);
			} else {
				listValues.put(value, 1);
			}
		}
		return listValues;
	}
}
