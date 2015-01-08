package com.lftechnology.assignment.jan7;

import java.io.File;
import java.util.Scanner;

/**
 * Write a program to rename the given file, after renaming the file delete the renamed file. (Accept the file name using command line
 * arguments.)
 * 
 * This class renames a given file and then deletes it after asking the user.
 * 
 * @author bibhushan<bibhushanjoshi@lftechnology.com>
 * 
 */
public class FileManipulation {
	private static Scanner scanUserInput = new Scanner(System.in);

	public static void main(String[] args) {
		FileUtilities.createFile();
		File oldFile = FileUtilities.getExistingFile();
		try {
			File newFile = FileUtilities.renameFile(oldFile);
			FileUtilities.deleteFile(newFile);
		} finally {
			scanUserInput.close();
		}
	}
}
