package com.lftechnology.assignment.jan7;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Logger;

class FileUtilities {
	private static final Logger LOGGER = Logger.getLogger(FileUtilities.class.getName());
	private static Scanner scanUserInput = new Scanner(System.in);
	private static final String YES = "yes";
	private static final String NO = "no";

	/**
	 * This method creates a new file
	 * 
	 */
	public static void createFile() {
		LOGGER.info("Do you want to create a file ?");
		String fileName = "";
		String createCondition = "";
		do {
			LOGGER.info("Please Enter yes or no:");
			createCondition = scanUserInput.nextLine();
		} while (!createCondition.equalsIgnoreCase(YES) && !createCondition.equalsIgnoreCase(NO));
		if (createCondition.equalsIgnoreCase(YES)) {
			try {
				LOGGER.info("Please, enter file name:");
				fileName = scanUserInput.nextLine();
				File newFile = new File(fileName + ".txt");
				newFile.createNewFile();
				LOGGER.info("File created");
			} catch (IOException e) {
				LOGGER.severe("File cannot be created: " + e);
			}
		} else {
			LOGGER.info("File is not created");
		}
	}

	/**
	 * This method creates a new directory if the same name directory doesn't exists.
	 */
	public static void createNewDirectory() {
		LOGGER.info("Enter new directory name:");
		String dirName = "";
		try {
			dirName = scanUserInput.nextLine();
		} finally {
			scanUserInput.close();
		}
		File newDir = new File(dirName);
		// if the directory does not exist, create it
		if (!newDir.exists()) {
			LOGGER.info("creating directory: " + newDir.getName());
			boolean dirMade = false;
			try {
				newDir.mkdir();
				dirMade = true;
			} catch (SecurityException se) {
				LOGGER.info("Directory cant be made" + se);
			}
			if (dirMade) {
				System.out.println("Directory " + newDir.getName() + " created");
			}
		} else {
			LOGGER.info(newDir.getName() + " Directory already exists");
		}
	}

	/**
	 * This method get existing files name.
	 * 
	 * @param oldFile
	 */
	public static File getExistingFile() {
		LOGGER.info("Write the file name(E.g - filename)");
		String oldFileName = scanUserInput.nextLine();
		File oldFile = new File(oldFileName + ".txt");
		if (oldFile.exists() | oldFile.isDirectory() | oldFile.isFile()) {
			LOGGER.info("The given file " + oldFile + " exists");
		} else {
			LOGGER.info("The given file " + oldFile + " doesnt exists");
			System.exit(0);
		}
		return oldFile;
	}

	/**
	 * This method renames the given file.
	 * 
	 * @param oldFile
	 * @return
	 */
	public static File renameFile(File oldFile) {
		LOGGER.info("Enter new File name");
		String newFileName = scanUserInput.nextLine();
		File newFile = new File(newFileName + ".txt");
		oldFile.renameTo(newFile);
		LOGGER.info("The file name " + oldFile.getName() + " is renamed to " + newFile.getName());
		return newFile;
	}

	/**
	 * This method deletes the file given.
	 * 
	 * @param newFile
	 */
	public static void deleteFile(File newFile) {
		LOGGER.info("Do you want to delete " + newFile.getName() + " file " + " (yes/no)");
		String deleteCondition = "";
		int count = 0;
		do {
			if (count > 0) {
				LOGGER.info("Please enter yes/no");
			}
			deleteCondition = scanUserInput.nextLine();
			count++;
		} while (!deleteCondition.equalsIgnoreCase(YES) && !deleteCondition.equalsIgnoreCase(NO));

		if (deleteCondition.equalsIgnoreCase(YES)) {
			newFile.delete();
			LOGGER.info("The file " + newFile.getName() + " is deleted");
		} else {
			LOGGER.info("The file " + newFile.getName() + " is not deleted");
		}
	}
}