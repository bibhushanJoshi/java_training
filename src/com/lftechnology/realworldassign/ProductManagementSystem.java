package com.lftechnology.realworldassign;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

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
public class ProductManagementSystem {
	private static final Logger LOGGER = Logger.getLogger(ProductManagementSystem.class.getName());

	public static void main(String[] args) {
		// Electronic product's fashion and product set
		Set<String> clothesList = new HashSet<String>(Arrays.asList("Jeans", "Tshirt", "Sweater"));
		Set<String> dellDevicesName = new HashSet<String>(Arrays.asList("Printer", "Laptops", "Laptops", "PC"));
		// addition of different clothes of abercrombie fashion
		ClothesFashion abercrombie = new ClothesFashion(clothesList, "Nepal udhyog");
		abercrombie.displayItem();
		abercrombie.addItem("Jacket");
		abercrombie.removeItem("Tshirt");
		abercrombie.updateItem("Sweater", "Coat");
		LOGGER.log(Level.INFO, "The poduct supplier is: {0}\n", abercrombie.getProductSupplier());
		abercrombie.displayItem();
		// addition of different products of dell company
		ElectronicProduct dell = new ElectronicProduct(dellDevicesName, "CG");
		dell.displayItem();
		dell.addItem("Tablet");
		dell.removeItem("PC");
		dell.updateItem("Laptops", "Mobiles");
		dell.displayItem();
		LOGGER.log(Level.INFO, "The poduct supplier is: {0}\n", dell.getProductSupplier());
		dell.displayItem();
	}
}
