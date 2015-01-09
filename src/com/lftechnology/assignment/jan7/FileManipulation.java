package com.lftechnology.assignment.jan7;

import java.io.File;

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

	public static void main(String[] args) {
		FileUtilities.createFile();
		// check if the file exists
		File oldFile = FileUtilities.getExistingFile();
		// renames the file
		File newFile = FileUtilities.renameFile(oldFile);
		// deletes the file
		FileUtilities.deleteFile(newFile);
	}
}
