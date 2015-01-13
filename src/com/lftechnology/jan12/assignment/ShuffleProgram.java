package com.lftechnology.jan12.assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Write a program that uses Shuffle algorithm to print the words in its argument list in random order. Hint: Use List and Collection
 * 
 * This class is shuffles the given {@link List}
 * 
 * @author bibhushan<bibhushanjoshi@lftechnology.com>
 * 
 */
public class ShuffleProgram {
	private static final Logger LOGGER = Logger.getLogger(ShuffleProgram.class.getName());

	public static void main(String[] args) {
		List<String> nameList =
				new ArrayList<String>(Arrays.asList("bib", "ram", "shyam", "ram", "hari", "bib", "rajesh", "pramesh", "bib"));
		LOGGER.log(Level.INFO, "The original List is: " + nameList);
		Collections.shuffle(nameList);
		LOGGER.log(Level.INFO, "The shuffled List is: " + nameList);
	}
}
