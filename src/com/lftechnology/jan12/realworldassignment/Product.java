package com.lftechnology.jan12.realworldassignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class Product implements ElectronicProductLayout, ElectronicProductFashionLayout {
	private static final Logger LOGGER = Logger.getLogger(Product.class.getName());
	protected List<String> electronicProductList = new ArrayList<String>();
	protected List<String> electronicProductFashion = new ArrayList<String>();
	protected int quantity;
	protected String productSupplier;
	protected static final String EMPTY = "none";

	protected Product() {
		this.electronicProductList = new ArrayList<String>(Arrays.asList(""));
		this.electronicProductFashion = new ArrayList<String>(Arrays.asList(""));
		this.quantity = 0;
		this.productSupplier = EMPTY;
	}

	protected Product(List<String> electronicProductList, List<String> electronicProductFashion, int quantity, String productSupplier) {
		this.electronicProductList = electronicProductList;
		this.electronicProductFashion = electronicProductFashion;
		this.quantity = quantity;
		this.productSupplier = productSupplier;
	}

	/**
	 * @return the electronicProductList
	 */
	public List<String> getElectronicProductList() {
		return electronicProductList;
	}

	/**
	 * @return the electronicProductFashion
	 */
	public List<String> getElectronicProductFashion() {
		return electronicProductFashion;
	}

	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * @return the productSupplier
	 */
	public String getProductSupplier() {
		return productSupplier;
	}

	public void display() {
		LOGGER.log(Level.INFO, "The new product is: {0} \n The new product fashion list is:{1} \n\n", new Object[] { electronicProductList,
				electronicProductFashion });
	}
}
