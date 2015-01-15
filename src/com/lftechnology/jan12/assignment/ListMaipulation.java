package com.lftechnology.jan12.assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 1. Takes the words in its argument list and prints out any duplicate words, the number of distinct words, and a list of the words with
 * duplicates eliminated. Hint: Try with HashSet and List implementation
 * 
 * This class is extract to get unique, distinct and duplicate words from the given {@link List}.
 * 
 * @author bibhushan<bibhushanjoshi@lftechnology.com>
 * 
 * 
 * 
 */
public class ListMaipulation {
	private static final Logger LOGGER = Logger.getLogger(ListMaipulation.class.getName());

	public static void main(String[] args) {
		List<String> nameList = new ArrayList<String>(Arrays.asList("a", "b", "c", "c", "d", "e", "b"));
		ListUtility listChange = new ListUtility();
		Set<String> uniqueWords = new HashSet<String>();
		Set<String> duplicateWords = new HashSet<String>();
		Set<String> distinctWords = new HashSet<String>();
		// gets unique words
		uniqueWords = listChange.manipulateWord(nameList).get("unique");
		// get duplicate words
		duplicateWords = listChange.manipulateWord(nameList).get("duplicate");
		// get distinct words
		distinctWords = listChange.manipulateWord(nameList).get("distinct");
		LOGGER.log(Level.INFO,
				"Given words : {0} \n Unique words : {1} \n Duplicate words : {2} \n No of distinct words: {3} \n Distinct words : {4}",
				new Object[] { nameList, uniqueWords, duplicateWords, distinctWords.size(), distinctWords });
	}
}
