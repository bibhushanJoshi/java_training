package com.lftechnology.jan12.realworldassignment;

/**
 * This interface gives out the general requirement of the Electronic's Fashion required methods.
 * 
 * @author bibhushan<bibhushanjoshi@lftechnology.com>
 * 
 */
public interface ElectronicProductFashionLayout {
	/**
	 * This method is use to remove Fashion items
	 * 
	 * @param removeValue
	 *            is {@link String} value to be removed.
	 * 
	 * @author bibhushan<bibhushanjoshi@lftechnology.com>
	 */
	public void removeFashion(String removeValue);

	/**
	 * This method is use to update old value with new one.
	 * 
	 * @param oldValue
	 *            is a {@link String} value which is to be updated
	 * @param newValue
	 *            is a {@link String} value which replaces the old value.
	 * 
	 * @author bibhushan<bibhushanjoshi@lftechnology.com>
	 */
	public void updateFashion(String oldValue, String newValue);

	/**
	 * This method is use to add new value in Fashion list
	 * 
	 * @param newInput
	 *            is a {@link String} value which is to be added into Fashion list.
	 * 
	 * @author bibhushan<bibhushanjoshi@lftechnology.com>
	 */
	public void addFashion(String newInput);
}
