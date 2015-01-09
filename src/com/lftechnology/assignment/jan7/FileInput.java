package com.lftechnology.assignment.jan7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
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
	private static Scanner scanUserInput = null;

	public static void main(String[] args) {
		createOutputMessage();
	}

	/**
	 * <p>
	 * This method appends the string to create an output message. The int,String and float are identified by reading the file which are
	 * stored in integer array, String array and float array respectively.Then after the value is displayed in a sentence as: Hi!
	 * StringArray[1], StringArray[2], the sum of intArray[1],intArray[2] and floatArray[1],floatArray[2] is sum, where
	 * sum=intArray+floatArray;
	 * </p>
	 * 
	 */
	private static void createOutputMessage() {
		try {
			scanUserInput = new Scanner(new File("ab.txt"));
			FileContent newContent = new FileContent(scanUserInput);
			StringBuilder outputMsg = new StringBuilder();
			newContent.getContent();
			outputMsg.append("Hi! ");
			int length = FileContent.countString;
			// appends the string values and comma for ever string value
			for (int i = 0; i < length; i++) {
				outputMsg.append(newContent.getContentString()[i] + ", ");
			}
			float sum = 0;
			outputMsg.append("the sum of ");
			length = FileContent.countInt;
			// appends the integer content and comma for ever integer value except last
			for (int i = 0; i < length; i++) {
				outputMsg.append(newContent.getContentInt()[i]);
				if (i != (length - 1)) {
					outputMsg.append(", ");
				}
				sum = sum + newContent.getContentInt()[i];
			}
			outputMsg.append(" and ");
			length = FileContent.countFloat;
			// appends the integer content and comma for ever float value except last
			for (int i = 0; i < length; i++) {
				outputMsg.append(newContent.getContentFloat()[i]);
				if (i != (length - 1)) {
					outputMsg.append(", ");
				}
				sum = sum + newContent.getContentFloat()[i];
			}
			outputMsg.append(" is " + sum);
			LOGGER.log(Level.INFO, "{0}", outputMsg);
		} catch (FileNotFoundException e) {
			LOGGER.log(Level.SEVERE, "The cant be scanned: {0} ", e.getMessage());
		} finally {
			if (scanUserInput != null) {
				scanUserInput.close();
			}
		}
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
	 * Default constructor
	 */
	public FileContent() {
	}

	/**
	 * This constructor sets the filename
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
		// sets the contentInt array with 0 value when then there is no integer value in the File content.
		if (countInt == 0) {
			contentInt[0] = 0;
			countInt++;
		}
		// sets the contentInt array with 0 value when then there is no integer value in the File content.
		if (countFloat == 0) {
			contentFloat[0] = 0;
			countFloat++;
		}
	}

	/**
	 * @return the contentInt
	 */
	public int[] getContentInt() {
		return contentInt;
	}

	/**
	 * @param contentInt
	 *            the contentInt to set
	 */
	public void setContentInt(int[] contentInt) {
		this.contentInt = contentInt;
	}

	/**
	 * @return the contentFloat
	 */
	public float[] getContentFloat() {
		return contentFloat;
	}

	/**
	 * @param contentFloat
	 *            the contentFloat to set
	 */
	public void setContentFloat(float[] contentFloat) {
		this.contentFloat = contentFloat;
	}

	/**
	 * @return the contentString
	 */
	public String[] getContentString() {
		return contentString;
	}

	/**
	 * @param contentString
	 *            the contentString to set
	 */
	public void setContentString(String[] contentString) {
		this.contentString = contentString;
	}

}