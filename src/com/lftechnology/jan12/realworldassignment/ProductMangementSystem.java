package com.lftechnology.jan12.realworldassignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProductMangementSystem {
	private static final Logger LOGGER = Logger.getLogger(ProductMangementSystem.class.getName());

	public static void main(String[] args) {
		// Electronic product's fashion and product arrayList
		List<String> productFashion = new ArrayList<String>(Arrays.asList("American Eagle", "Abercrombie", "Fitch"));
		List<String> productName = new ArrayList<String>(Arrays.asList("Dell", "Hp", "Lenovo"));
		// creation Product object with required product names and fashion
		Product newProducts = new ElectronicProductFashion(productName, productFashion, 55, "Nepal Computer Udhyog");
		// displays manipulated products list
		displayOutput(newProducts);
	}

	public static void displayOutput(Product currentProducts) {
		// Original list of electronic product and electronic products's fashion lists
		LOGGER.log(Level.INFO, "The current products are{0} \n and fashions are: {1}\n\n",
				new Object[] { currentProducts.getElectronicProductList(), currentProducts.getElectronicProductFashion() });
		// new electronic product added into product list and product fashion into product fashion list
		currentProducts.addProduct("Sony");
		currentProducts.addFashion("bossni");
		// Electronic product and product fashion list after addition of the new product and fashion.
		LOGGER.log(Level.INFO,
				"The new product list after add of product is: {0} \n The new product list after add of fashion is:{1} \n\n", new Object[] {
						currentProducts.getElectronicProductList(), currentProducts.getElectronicProductFashion() });
		// remove of specific electronic product from product list and product fashion from fashion list
		currentProducts.removeProduct("Dell");
		currentProducts.removeFashion("Abercrombi");
		LOGGER.log(Level.INFO,
				"The new product list after delete of product is: {0} \n The new product list after delete of fashion is:{1} \n\n",
				new Object[] { currentProducts.getElectronicProductList(), currentProducts.getElectronicProductFashion() });
		// update of specific electronic product and product fashion
		currentProducts.updateFashion("Fitch", "dfdf");
		currentProducts.updateProduct("Hp", "Nexus");
		// display of updated list of product and fashion
		LOGGER.log(Level.INFO,
				"The new product list after update of product is: {0} \n The new product list after update of fashion is:{1}",
				new Object[] { currentProducts.getElectronicProductList(), currentProducts.getElectronicProductFashion() });
	}
}
