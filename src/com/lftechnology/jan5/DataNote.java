package com.lftechnology.jan5;

import java.util.Scanner;
import java.util.logging.Logger;

/**
 * Try to do a program that constantly prompts the user to enter something
 * (using the Scanner class) until the user enters a specific word (such as quit
 * for example)
 * 
 * This class constantly prompts user to enter the text using Scanner class
 * until user enters word "exit".
 * 
 * @author bibhushan<bibhushanjoshi@lftechnology.com>
 * 
 */
public class DataNote {
	private static Logger log = Logger.getLogger(DataNote.class.getName());

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		printWrittenSentence(takeInputSentence(scan));

	}

	/**
	 * This method get the value from user until the exit is entered or value
	 * exceed array size.
	 * 
	 * @param scan
	 * @return array of sentences which was entered by the user
	 */
	static String[] takeInputSentence(Scanner scan) {
		String sentence[] = new String[10];
		int count = -1;
		try {
			do {
				count++;
				log.info("Write text (Enter \"exit\" to halt):");
				sentence[count] = scan.nextLine();
			} while (!sentence[count].equalsIgnoreCase("exit"));
		} catch (Exception e) {
			log.info("Only " + sentence.length
					+ " lines of text can be entered");
		} finally {
			scan.close();
		}
		return sentence;
	}

	/**
	 * The method prints the value present in the array of string until exit
	 * appears.
	 * 
	 * @param sentence
	 */
	static void printWrittenSentence(String[] sentence) {
		StringBuilder inputSentence = new StringBuilder();
		for (int i = 0; i < sentence.length; i++) {
			if (sentence[i].equalsIgnoreCase("exit")) {
				break;
			}
			inputSentence.append(sentence[i]).append(" ");
		}
		log.info("The text you have written is: " + inputSentence);
	}
}
