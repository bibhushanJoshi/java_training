package com.lftechnology.realworldassign;

import java.util.HashSet;
import java.util.Set;

public abstract class Product {
	protected Set<String> electronicProductList = new HashSet<String>();
	protected String productSupplier;
	protected Set<String> clothesFashion = new HashSet<String>();
	private static final String EMPTY = "none";

	protected Product() {
		this.productSupplier = EMPTY;
	}

	protected Product(String productSupplier) {
		this.productSupplier = productSupplier;
	}

	/**
	 * @return the electronicProductList
	 */
	public Set<String> getElectronicProductList() {
		return electronicProductList;
	}

	/**
	 * @return the electronicProductFashion
	 */
	public Set<String> getElectronicProductFashion() {
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