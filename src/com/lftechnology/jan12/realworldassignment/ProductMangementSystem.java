package com.lftechnology.jan12.realworldassignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Some site has a product management system. Product management - High level - Products -> Electronic , Fashion-> HP, DELL, D&G, American
 * Eagle, Abercrombie & Fitch. WAP to model above Management system. User should be able to do CRUD operations.
 * 
 * This class is shows the implementation of products management system. The basic Create, Update, Retrieval and Delete operations are
 * performed.
 * 
 * @author bibhushan<bibhushanjoshi@lftechnology.com>
 * 
 */
public class ProductMangementSystem {

	public static void main(String[] args) {
		// Electronic product's fashion and product arrayList
		List<String> productFashion = new ArrayList<String>(Arrays.asList("American Eagle", "Abercrombie", "Fitch"));
		List<String> productName = new ArrayList<String>(Arrays.asList("Dell", "Hp", "Lenovo"));
		// creation Product object with required product names and fashion
		Product newProducts = new ElectronicProductFashion(productName, productFashion, 55, "Nepal Computer Udhyog");
		// Original list of electronic product and electronic products's fashion lists
		newProducts.display();
		// new electronic product added into product list and product fashion into product fashion list
		newProducts.addProduct("Sony");
		newProducts.addFashion("bossni");
		// Electronic product and product fashion list after addition of the new product and fashion.
		newProducts.display();
		// remove of specific electronic product from product list and product fashion from fashion list
		newProducts.removeProduct("Dell");
		newProducts.removeFashion("Abercrombi");
		newProducts.display();
		// update of specific electronic product and product fashion
		newProducts.updateFashion("Fitch", "dfdf");
		newProducts.updateProduct("Hp", "Nexus");
		// display of updated list of product and fashion
		newProducts.display();
	}
}
