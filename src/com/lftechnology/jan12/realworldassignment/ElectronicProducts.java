package com.lftechnology.jan12.realworldassignment;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class ElectronicProducts extends Product {
	private static final Logger LOGGER = Logger.getLogger(ElectronicProducts.class.getName());

	protected ElectronicProducts() {
		super();
	}

	/**
	 * This is constructor the calls the parent constructor
	 * 
	 * @param electronicProductList
	 *            is a {@link List} that consists of product list
	 * @param electronicProductFashion
	 *            is a {@link List} that consists of fashion list of the product
	 * @param quantity
	 *            is a {@link Integer} that consists of quantity of the product
	 * @param productSupplier
	 *            is a {@link String} value that consists of Supplier name.
	 */
	protected ElectronicProducts(List<String> electronicProductList, List<String> electronicProductFashion, int quantity,
			String productSupplier) {
		super(electronicProductList, electronicProductFashion, quantity, productSupplier);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.lftechnology.jan12.realworldassignment.ElectronicProductLayout#removeProduct(java.lang.String)
	 */
	@Override
	public void removeProduct(String value) {
		ProductUtils.removeItem(electronicProductList, value);
	}

	@Override
	public void addProduct(String newInput) {
		electronicProductList.add(newInput);
		LOGGER.log(Level.INFO, "added value: " + newInput);
	}

	@Override
	public void updateProduct(String oldValue, String newValue) {
		ProductUtils.updateItem(electronicProductList, oldValue, newValue);
	}
}
