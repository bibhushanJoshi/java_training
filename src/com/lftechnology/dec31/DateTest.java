package com.lftechnology.dec31;

/**
 * 
 * Create a class called Date that includes three pieces of information as
 * instance variables a month (type int), a day (type int) and a year (type
 * int). Your class should have a constructor that initializes the three
 * instance variables and assumes that the values provided are correct. Provide
 * a set and a get method for each instance variable. Provide a method
 * displayDate that displays the month, day and year separated by forward
 * slashes (/). Write a test application named DateTest that demonstrates class
 * Date's capabilities.
 * 
 * This class is used constructor of class Date to initialize the values in one
 * way, while for other object it uses get and set methods of class Date to
 * Display the values.
 * 
 * 
 * @author bibhushan
 * 
 */
public class DateTest {

	public static void main(String[] args) {
		Date d1 = new Date(12, 01, 2014);
		d1.displayDate();
		Date d2 = new Date();
		d2.setDay(1);
		d2.setMonth(11);
		d2.setYear(2015);
		System.out.println(d2.getDay() + " / " + d2.getMonth() + " / "
				+ d2.getYear());
	}
}

/**
 * This class includes three pieces of information as instance variables a month
 * (type int), a day (type int) and a year (type int). This class has
 * constructor that initializes the three instance variables.This class also has
 * set and a get method for each instance variable. displayDate method displays
 * the month, day and year
 * 
 * @author bibhushan
 * 
 */
class Date {
	private int month;
	private int day;
	private int year;

	public Date() {

	}

	public Date(int mm, int dd, int yy) {
		month = mm;
		day = dd;
		year = yy;
	}

	/**
	 * @param month
	 */
	public void setMonth(int month) {
		this.month = month;
	}

	/**
	 * @param day
	 */
	public void setDay(int day) {
		this.day = day;
	}

	/**
	 * @param year
	 */
	public void setYear(int year) {
		this.year = year;
	}

	/**
	 * @return
	 */
	public int getMonth() {
		return month;
	}

	/**
	 * @return
	 */
	public int getDay() {
		return day;
	}

	/**
	 * @return
	 */
	public int getYear() {
		return year;
	}

	/**
	 * This method is used to display the date where day,month and year is
	 * seperate by /
	 */
	public void displayDate() {
		System.out.println(day + " / " + month + " / " + year);
	}
}
