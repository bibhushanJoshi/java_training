package com.lftechnology.realworldassign;

import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This class consists of reusable methods of the Product items such as remove and update of the items in the List.
 * 
 * @author bibhushan<bibhushanjoshi@lftechnology.com>
 * 
 */
public class ProductServices {
	private static final Logger LOGGER = Logger.getLogger(ProductServices.class.getName());

	/**
	 * This method removes {@link String} value from the {@link Set}
	 * 
	 * @param inputList
	 *            is {@link Set} from which value is to be removed
	 * @param value
	 *            is{@link String} to be removed
	 */
	public static void removeItem(Set<String> inputList, String value) {
		if (inputList.remove(value)) {
			LOGGER.log(Level.INFO, "removed value: {0}\n", value);
		} else {
			LOGGER.log(Level.WARNING, " value not present in the list : {0}\n", value);
		}
	}

	/**
	 * This method updates the {@link String} value in a {@link Set}
	 * 
	 * @param inputList
	 *            is a {@link Set} in which value is to be updated.
	 * @param oldValue
	 *            is a {@link String} value which is to be changed with new value.
	 * @param newValue
	 *            is a {@link String} value which replaces old value.
	 */
	public static void updateItem(Set<String> inputList, String oldValue, String newValue) {
		if (inputList.remove(oldValue)) {
			inputList.add(newValue);
			LOGGER.log(Level.INFO, "{0}  value updated to {1}\n", new Object[] { oldValue, newValue });
		} else {
			LOGGER.log(Level.WARNING, "{0} value not present in the list {0}\n", oldValue);
		}
	}
}
