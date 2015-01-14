package com.lftechnology.jan12.realworldassignment;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This class consists of resuable methods of the Product items such as remove and update of the items in the List.
 * 
 * @author bibhushan<bibhushanjoshi@lftechnology.com>
 * 
 */
public class ProductUtils {
	private static final Logger LOGGER = Logger.getLogger(ProductUtils.class.getName());

	/**
	 * This method removes {@link String} value from the {@link List}
	 * 
	 * @param inputList
	 *            is {@link List} from which value is to be removed
	 * @param value
	 *            is{@link String} to be removed
	 */
	public static void removeItem(List<String> inputList, String value) {
		if (inputList.contains(value)) {
			inputList.remove(value);
			LOGGER.log(Level.INFO, "removed value: " + value);
		} else {
			LOGGER.log(Level.WARNING, " value not present in the list : " + value);
		}
	}

	/**
	 * This method updates the {@link String} value in a {@link List}
	 * 
	 * @param inputList
	 *            is a {@link List} in which value is to be updated.
	 * @param oldValue
	 *            is a {@link String} value which is to be changed with new value.
	 * @param newValue
	 *            is a {@link String} value which replaces old value.
	 */
	public static void updateItem(List<String> inputList, String oldValue, String newValue) {
		if (inputList.contains(oldValue)) {
			int oldValueIndex = inputList.indexOf(oldValue);
			inputList.set(oldValueIndex, newValue);
			LOGGER.log(Level.INFO, "{0}  value updated to {1} ", new Object[] { oldValue, newValue });
		} else {
			LOGGER.log(Level.WARNING, "{0} value not present in the list ", oldValue);
		}
	}
}
