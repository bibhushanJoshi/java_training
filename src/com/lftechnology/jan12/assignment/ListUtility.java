package com.lftechnology.jan12.assignment;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * This class consists of reusable methods in the list.
 * 
 * @author bibhushan<bibhushanjoshi@lftechnology.com>
 * 
 */
public class ListUtility {

	/**
	 * This method helps to get specific list values . Using this method key such as <code>duplicate</code>,<code>distinct</code> and
	 * <code>unique</code> are passed in a {@link Map} to get dublicate, distinct and unique words respectively from the given {@link list}
	 * 
	 * @param nameList
	 *            {@link list} from which duplicate, distinct and unique value is to be manipulated
	 * @return {@link Map} which according to <code>duplicate</code>,<code>distinct</code> and <code>unique</code> key with respective
	 *         duplicate, distinct and unique values of {@link List}.
	 * 
	 * @author bibhushan<bibhushanjoshi@lftechnology.com>
	 */
	public Map<String, HashSet<String>> manipulateWord(List<String> nameList) {
		Map<String, HashSet<String>> listValues = new HashMap<String, HashSet<String>>();
		Set<String> uniques = new HashSet<String>();
		Set<String> dups = new HashSet<String>();
		// insert values of list into a hashSet
		for (String listValue : nameList) {
			if (!uniques.add(listValue)) {
				dups.add(listValue);
			}
		}
		listValues.put("unique", (HashSet<String>) uniques);
		// remove duplicate words from the distinct set
		Set<String> distinct = new HashSet<String>(uniques);
		for (String dupsValue : dups) {
			if (distinct.contains(dupsValue)) {
				distinct.remove(dupsValue);
			}
		}
		listValues.put("duplicate", (HashSet<String>) dups);
		listValues.put("distinct", (HashSet<String>) distinct);
		return listValues;
	}
}
