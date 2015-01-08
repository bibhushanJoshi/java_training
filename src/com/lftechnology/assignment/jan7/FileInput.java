package com.lftechnology.assignment.jan7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Logger;

/**
 * 5. Write a program called FileInput to read an int, a double, and a String form a text file called "in.txt", and produce the following
 * output: (Hint use Scanner to read from file) a. The integer read is 12 b. The floating point number read is 33.44 c. The String read is
 * "Peter" d. Hi! Peter, the sum of 12 and 33.44 is 45.44
 * 
 * This class takes in input provide in a text file and print the result in the specific format.
 * 
 * @author bibhushan<bibhushanjoshi@lftechnology.com>
 * 
 */
public class FileInput {
	private static final Logger LOGGER = Logger.getLogger(FileInput.class.getName());

	public static void main(String[] args) {
		Scanner scanUserInput = null;
		createOutputMessage(scanUserInput);
	}

	/**
	 * This method appends the string to create an output message.
	 * 
	 * @param scanUserInput
	 */
	private static void createOutputMessage(Scanner scanUserInput) {
		try {
			scanUserInput = new Scanner(new File("ab.txt"));
		} catch (FileNotFoundException e) {
			LOGGER.severe("The cant be scanned" + e);
		}
		FileContent newContent = new FileContent(scanUserInput);
		StringBuilder outputMsg = new StringBuilder();
		newContent.getContent();
		outputMsg.append("Hi! ");
		int length = FileContent.countString;
		for (int i = 0; i < length; i++) {
			outputMsg.append(newContent.getContentString()[i] + ", ");
		}
		float sum = 0;
		outputMsg.append("the sum of ");
		length = FileContent.countInt;
		for (int i = 0; i < length; i++) {
			outputMsg.append(newContent.getContentInt()[i]);
			if (i != (length - 1)) {
				outputMsg.append(", ");
			}
			sum = sum + newContent.getContentInt()[i];
		}
		outputMsg.append(" and ");
		length = FileContent.countFloat;
		for (int i = 0; i < length; i++) {
			outputMsg.append(newContent.getContentFloat()[i]);
			if (i != (length - 1)) {
				outputMsg.append(", ");
			}
			sum = sum + newContent.getContentFloat()[i];
		}
		outputMsg.append(" is " + sum);
		LOGGER.info("" + outputMsg);
	}

}

/**
 * This class helps in the int, float and string content extraction from the given content in a file.
 * 
 * @author bibhushan<bibhushanjoshi@lftechnology.com>
 * 
 */
class FileContent {
	private int[] contentInt = new int[10];
	private float[] contentFloat = new float[10];
	private String[] contentString = new String[10];
	public static int countInt;
	public static int countFloat;
	public static int countString;
	private Scanner fileScanner;

	/**
	 * This method sets the filename
	 * 
	 * @param fileName
	 */
	public FileContent(Scanner fileName) {
		this.fileScanner = fileName;
	}

	/**
	 * This method set the int, float and string in different array
	 * 
	 */
	public void getContent() {

		while (fileScanner.hasNext()) {
			if (fileScanner.hasNextInt()) {
				contentInt[countInt] = fileScanner.nextInt();
				countInt++;
			} else if (fileScanner.hasNextFloat()) {
				contentFloat[countFloat] = fileScanner.nextFloat();
				countFloat++;
			} else {
				contentString[countString] = (fileScanner.next());
				countString++;
			}
		}
		if (countInt == 0) {
			contentInt[0] = 0;
			countInt++;
		}
		if (countFloat == 0) {
			contentFloat[0] = 0;
			countFloat++;
		}
	}

	public int[] getContentInt() {
		return contentInt;
	}

	public void setContentInt(int[] contentInt) {
		this.contentInt = contentInt;
	}

	public float[] getContentFloat() {
		return contentFloat;
	}

	public void setContentFloat(float[] contentFloat) {
		this.contentFloat = contentFloat;
	}

	public String[] getContentString() {
		return contentString;
	}

	public void setContentString(String[] contentString) {
		this.contentString = contentString;
	}
}