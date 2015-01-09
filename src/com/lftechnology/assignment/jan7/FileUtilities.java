package com.lftechnology.assignment.jan7;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This class consists of the reusable component to handle the files.
 * 
 * @author bibhushan<bibhushanjoshi@lftechnology.com>
 * 
 */
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
				LOGGER.log(Level.INFO, "File cannot be created: {0}" + e);
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
				LOGGER.log(Level.SEVERE, "Directory cant be made {0} {1}", se.getCause());
			}
			if (dirMade) {
				LOGGER.log(Level.INFO, "Directory {0} created", newDir.getName());
			}
		} else {
			LOGGER.log(Level.INFO, "{0} Directory already exists", newDir.getName());
		}
	}

	/**
	 * This method get existing files name.
	 * 
	 * @return file if the file exists
	 */
	public static File getExistingFile() {
		LOGGER.info("Write the name of file to be renamed(E.g - filename)");
		String oldFileName = scanUserInput.nextLine();
		File oldFile = new File(oldFileName + ".txt");
		if (oldFile.exists() | oldFile.isDirectory() | oldFile.isFile()) {
			LOGGER.log(Level.INFO, "The given file {0} exists.", oldFile);
		} else {
			LOGGER.log(Level.INFO, "The given file {0} doesnt exists.", oldFile);
			System.exit(0);
		}
		return oldFile;
	}

	/**
	 * This method renames the given file in the parameter.
	 * 
	 * @param oldFile
	 *            is the file to be renamed.
	 * @return renamed file.
	 */
	public static File renameFile(File oldFile) {
		LOGGER.info("Enter new File name");
		String newFileName = scanUserInput.nextLine();
		File newFile = new File(newFileName + ".txt");
		oldFile.renameTo(newFile);
		LOGGER.log(Level.INFO, "The file name {0} is renamed to {1}", new Object[] { oldFile.getName(), newFile.getName() });
		return newFile;
	}

	/**
	 * This method deletes the file given in the parameter.
	 * 
	 * @param newFile
	 *            file to be deleted
	 */
	public static void deleteFile(File newFile) {
		LOGGER.log(Level.INFO, "Do you want to delete {0} file (yes/no)", newFile.getName());
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
			LOGGER.log(Level.INFO, "The file {0} is deleted", newFile.getName());
		} else {
			LOGGER.log(Level.INFO, "The file {0} is not deleted", newFile.getName());
		}
	}
}