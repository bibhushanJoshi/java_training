package com.lftechnology.jan12.realworldassignment;

/**
 * This interface gives out the general requirement of the Electronic's Fashion required methods.
 * 
 * @author bibhushan<bibhushanjoshi@lftechnology.com>
 * 
 */
public interface ElectronicProductLayout {

	/**
	 * This method is use to remove Electronic product's items
	 * 
	 * @param removeValue
	 *            is {@link String} value to be removed.
	 * 
	 * @author bibhushan<bibhushanjoshi@lftechnology.com>
	 */
	public void removeProduct(String removeValue);

	/**
	 * This method is use to add new value in Electronic product's list
	 * 
	 * @param newInput
	 *            is a {@link String} value which is to be added into Fashion list.
	 * 
	 * @author bibhushan<bibhushanjoshi@lftechnology.com>
	 */
	public void addProduct(String newInput);

	/**
	 * This method is use to update old value of Electronic product's with new one
	 * 
	 * @param oldValue
	 *            is a {@link String} value which is to be updated
	 * @param newValue
	 *            is a {@link String} value which replaces the old value.
	 * 
	 * @author bibhushan<bibhushanjoshi@lftechnology.com>
	 */
	public void updateProduct(String oldValue, String newValue);
}
