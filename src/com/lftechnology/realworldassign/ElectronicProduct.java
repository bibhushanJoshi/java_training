package com.lftechnology.realworldassign;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This class manages the Electronic products
 * 
 * @author bibhushan<bibhushanjoshi@lftechnology.com>
 * 
 */
public class ElectronicProduct extends Product implements ProductManagementLayout {
	private static final Logger LOGGER = Logger.getLogger(ElectronicProduct.class.getName());

	/**
	 * This constructor is calls the parent's default constructor and set value of {@link List} clothesFashion to empty
	 */
	protected ElectronicProduct() {
		super();
		this.electronicProductList = new ArrayList<String>(Arrays.asList(""));
	}

	/**
	 * This constructor calls the parent's parameterized constructor to set productSupplier and also help to set {@link List}
	 * 
	 * @param electronicProductList
	 *            is a {@link List} of product available
	 * @param productSupplier
	 *            is {@link String} which is productSupplier name
	 */
	protected ElectronicProduct(List<String> electronicProductList, String productSupplier) {
		super(productSupplier);
		this.electronicProductList = electronicProductList;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.lftechnology.jan12.realworldassignment.ElectronicProductLayout#removeProduct(java.lang.String)
	 */
	@Override
	public void removeItem(String value) {
		ProductServices.removeItem(electronicProductList, value);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.lftechnology.jan12.realworldassign.ProductManagementLayout#addItem(java.lang.String)
	 */
	@Override
	public void addItem(String newInput) {
		electronicProductList.add(newInput);
		LOGGER.log(Level.INFO, "added value: {0}\n", newInput);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.lftechnology.jan12.realworldassign.ProductManagementLayout#updateItem(java.lang.String, java.lang.String)
	 */
	@Override
	public void updateItem(String oldValue, String newValue) {
		ProductServices.updateItem(electronicProductList, oldValue, newValue);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.lftechnology.jan12.realworldassign.ProductManagementLayout#displayItem()
	 */
	@Override
	public void displayItem() {
		LOGGER.log(Level.INFO, "The product in stock are: {0} \n Supplier: {1}\n\n",
				new Object[] { electronicProductList, productSupplier });
	}
}
