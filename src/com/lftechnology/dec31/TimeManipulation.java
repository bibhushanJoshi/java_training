package com.lftechnology.dec31;

/**
 * 
 * 4. Create a class called Time with three attributes hours, minutes, and
 * seconds. Use appropriate constructor (s) to initialize instance variables.
 * Also, use a display method to display the time in hh:mm:ss format. Modify the
 * class to add two time objects that correctly results in addition of times.
 * 
 * This class uses object of class {@link Time}. The display method is used to
 * show formatted date while addTime method is used to add the time.
 * 
 * @author bibhushan
 * 
 */
public class TimeManipulation {

	public static void main(String[] args) {
		Time day = new Time(12, 1, 15);
		Time evening = new Time(06, 05, 6);
		System.out.println("First set of Time: ");
		day.displayDate();
		System.out.println("Seconnd set of Time: ");
		evening.displayDate();
		day.addTime(evening);
	}

}

/**
 * This class includes variables hours, minutes and seconds. This has a
 * parameterized constructor that initializes the variables.The set and get
 * method for each made for each variable. addTime and displayDate are used add
 * and show the data provided respectively.
 * 
 * @author bibhushan
 * 
 */
class Time {
	private int hours;
	private int minutes;
	private int seconds;

	public Time(int hr, int min, int sec) {
		hours = hr;
		minutes = min;
		seconds = sec;
	}

	/**
	 * @return given value converted into seconds
	 */
	public double toSeconds() {
		return hours * 3600 + minutes * 60 + seconds;
	}

	/**
	 * This function adds the time provided as an object.
	 * 
	 * @param another
	 */
	public void addTime(Time another) {
		Double total = this.toSeconds() + another.toSeconds();
		hours = (int) (total / 3600);
		minutes = (int) ((total - (hours * 3600)) / 60);
		seconds = (int) (total % 60);
		System.out.println("The sum of Time is:");
		System.out.println(hours + " : " + minutes + " : " + seconds);
	}

	/**
	 * 
	 * this method displays the date in format.
	 * 
	 */
	public void displayDate() {
		System.out.format("%02d : ", hours);
		System.out.format("%02d : ", minutes);
		System.out.format("%02d\n", seconds);
	}
}
