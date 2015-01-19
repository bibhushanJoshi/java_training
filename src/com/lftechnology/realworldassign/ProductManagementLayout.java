package com.lftechnology.realworldassign;

/**
 * This interface gives out the general requirement of the Electronic's Fashion required methods.
 * 
 * @author bibhushan<bibhushanjoshi@lftechnology.com>
 * 
 */
public interface ProductManagementLayout {
	/**
	 * This method is use to remove Fashion items
	 * 
	 * @param removeValue
	 *            is {@link String} value to be removed.
	 * 
	 * @author bibhushan<bibhushanjoshi@lftechnology.com>
	 */
	public void removeItem(String removeValue);

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
	public void updateItem(String oldValue, String newValue);

	/**
	 * This method is use to add new value in Fashion list
	 * 
	 * @param newInput
	 *            is a {@link String} value which is to be added into Fashion list.
	 * 
	 * @author bibhushan<bibhushanjoshi@lftechnology.com>
	 */
	public void addItem(String newInput);

	/**
	 * This method displays the items in the {@link List}
	 * 
	 * @author bibhushan<bibhushanjoshi@lftechnology.com>
	 */
	public void displayItem();
}
