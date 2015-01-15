package com.lftechnology.realworldassign;

import java.util.ArrayList;
import java.util.List;

public abstract class Product {
	protected List<String> electronicProductList = new ArrayList<String>();
	protected String productSupplier;
	protected List<String> clothesFashion = new ArrayList<String>();
	protected static final String EMPTY = "none";

	protected Product() {
		this.productSupplier = EMPTY;
	}

	protected Product(String productSupplier) {
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
		return clothesFashion;
	}

	/**
	 * @return the productSupplier
	 */
	public String getProductSupplier() {
		return productSupplier;
	}

	/**
	 * @param productSupplier
	 *            the productSupplier to set
	 */
	public void setProductSupplier(String productSupplier) {
		this.productSupplier = productSupplier;
	}
}
