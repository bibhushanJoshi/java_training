package com.lftechnology.jan12.realworldassignment;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ElectronicProductFashion extends ElectronicProducts implements ElectronicProductFashionLayout {
	private static final Logger LOGGER = Logger.getLogger(ElectronicProductFashion.class.getName());

	protected ElectronicProductFashion() {
		super();
	}

	protected ElectronicProductFashion(List<String> electronicProductList, List<String> electronicProductFashion, int quantity,
			String productSupplier) {
		super(electronicProductList, electronicProductFashion, quantity, productSupplier);
	}

	@Override
	public void removeFashion(String value) {
		ProductUtils.removeItem(electronicProductFashion, value);
	}

	@Override
	public void updateFashion(String oldValue, String newValue) {
		ProductUtils.updateItem(electronicProductFashion, oldValue, newValue);
	}

	@Override
	public void addFashion(String newInput) {
		electronicProductFashion.add(newInput);
		LOGGER.log(Level.INFO, "added value: " + newInput);
	}
}
