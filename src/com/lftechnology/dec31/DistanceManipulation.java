package com.lftechnology.dec31;

import java.util.Scanner;

/**
 * 
 * Create a class called Distance that includes two private data members feet
 * (type int) and inches (type float). Use a method setData to set values to
 * instance variables. Provide a method display that displays the feet and
 * inches, a member function addDistance for adding two distances, and a member
 * function compareDistance for comparing two distances. Implement your program
 * in Java.
 * 
 * 
 * 
 * @author bibhushan
 * 
 */
public class DistanceManipulation {

	public static void main(String[] args) {
		Distance distance1 = new Distance();
		Distance distance2 = new Distance();
		Scanner scan = new Scanner(System.in);
		Boolean wrongInput = false;
		try {
			do {
				try {
					System.out
							.println("Enter First distance's feet(Integer) and inch(Float): ");
					int feet1 = scan.nextInt();
					float inch1 = scan.nextFloat();
					distance1.setData(feet1, inch1);
					System.out
							.println("Enter Second distance's feet and inch: ");
					int feet2 = scan.nextInt();
					float inch2 = scan.nextFloat();
					distance2.setData(feet2, inch2);
					System.out.println("The given distances are \n");
					wrongInput = false;
				} catch (Exception e) {
					System.out
							.println("--Please enter feet in Integer and inch in Float");
					scan.next();
					wrongInput = true;
				}
			} while (wrongInput);
		} finally {
			scan.close();
		}
		distance1.displayDistance();
		distance2.displayDistance();
		distance1.addDistance(distance2);
		distance1.compareDistance(distance2);
	}
}

/**
 * 
 * This class includes two private data members feet (type int) and inches (type
 * float). This class has method setData to set values to instance variables,
 * displayDistance method to displays the feet and inches,method addDistance for
 * adding two distances and method compareDistance for comparing two distances.
 * 
 * @author bibhushan
 * 
 */
class Distance {
	private int feet;
	private float inches;
	static float inchSum;
	static int feetSum;

	/**
	 * @param feet
	 * @param inches
	 */
	public void setData(int feet, float inches) {
		this.feet = feet;
		this.inches = inches;
	}

	/**
	 * This method is used to display feet and inches of the given object.
	 * 
	 */
	public void displayDistance() {
		System.out.println(this.feet + " feet" + " and " + this.inches
				+ " inches");
	}

	/**
	 * This method is used to convert the given value into inches.
	 * 
	 * @return
	 */
	public float toInches() {
		return feet * 12 + inches;
	}

	/**
	 * This method is used to add distance given in feet and inches.
	 * 
	 * @param another
	 */
	public void addDistance(Distance another) {
		float sum = (this.toInches() + another.toInches());
		feetSum = (int) (sum / 12);
		inchSum = sum % 12;
		System.out.println("The sum of distance is:");
		System.out.println(feetSum + " feet " + inchSum + " inch");
	}

	/**
	 * This method compares the distance given by the user by converting the
	 * given data into inches
	 * 
	 * @param input2
	 */
	public void compareDistance(Distance input2) {
		if (this.toInches() > input2.toInches()) {
			System.out.println("First number: " + this.feet + " feet and "
					+ this.inches + " inches" + " is greater than "
					+ input2.feet + " feet and " + input2.inches + " inches");
		} else if (this.toInches() < input2.toInches()) {
			System.out.println("Second number: " + input2.feet + " feet and "
					+ input2.inches + " inches" + " is greater than "
					+ this.feet + " feet and " + this.inches + " inches");
		} else {
			System.out.println("Both number are equal");
		}
	}
}
