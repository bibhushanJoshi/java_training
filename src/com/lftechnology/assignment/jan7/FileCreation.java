package com.lftechnology.assignment.jan7;

import java.io.File;
import java.io.IOException;
import java.util.logging.Logger;

/**
 * Write a program to create a text file in the path c:\java\abc.txt and check whether that file is exists. Using the command exists(),
 * isDirectory(), isFile(), getName() and getAbsolutePath().
 * 
 * This class creates a file and checks its existence after creation by using command exists,isDirectory,isFile and generates it name and
 * path.
 * 
 * @author bibhushan<bibhushanjoshi@lftechnology.com>
 * 
 */
public class FileCreation {
	private static final Logger LOGGER = Logger.getLogger(FileCreation.class.getName());

	public static void main(String[] args) {
		File file = new File("abc.txt");
		try {
			file.createNewFile();
			LOGGER.info("File created");
		} catch (IOException e) {
			LOGGER.severe("File cannot be created: " + e);
		}
		displayFileReport(file);
	}

	/**
	 * This method displays the file status about its existence, whether it is a directory and is it actually a file.
	 * 
	 * @param file
	 */
	private static void displayFileReport(File file) {
		if (checkFileExistence(file) | checkDirectoryExistence(file) | checkFile(file)) {
			fileNamePath(file);
		}
	}

	/**
	 * This method checks if the given file exits
	 * 
	 * @param file
	 * @return true if file exits otherwise false
	 */
	private static boolean checkFileExistence(File file) {
		boolean fileStatus = false;
		if (file.exists()) {
			LOGGER.info("File exists");
			fileStatus = true;
		} else {
			LOGGER.info("file doesnt exits");
		}
		return fileStatus;
	}

	/**
	 * This method checks if given file is a directory
	 * 
	 * @param file
	 * @return true if given file is not a directory otherwise false
	 */
	private static boolean checkDirectoryExistence(File file) {
		boolean fileStatus = false;
		if (file.isDirectory()) {
			LOGGER.info("This is a directory)");
		} else {
			LOGGER.info("This is not a directory");
			fileStatus = true;
		}
		return fileStatus;
	}

	/**
	 * This checks if the file is normal or not.
	 * 
	 * @param file
	 * @return true if the given file is a normal file
	 */
	private static boolean checkFile(File file) {
		boolean fileStatus = false;
		if (file.isFile()) {
			LOGGER.info("This is a file");
			fileStatus = true;
		} else {
			LOGGER.info("This is not a file");
		}
		return fileStatus;
	}

	/**
	 * This method displays the filename and absolute path of the file.
	 * 
	 * @param file
	 */
	private static void fileNamePath(File file) {
		LOGGER.info("File \"" + file.getName() + "\" exists at path " + file.getAbsolutePath());
	}
}
