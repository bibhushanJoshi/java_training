package com.lftechnology.dec31;

/**
 * 
 * 3. Write a program that calculates percentage and GPA of 5 students. Each of
 * the students has following attributes: name, class, rollNo, and marks
 * obtained in 5 subjects.
 * 
 * This class uses the object of class {@link Student}. Student statistics are
 * store and displayed using set and {@link #displayStudentStatistics()
 * displayStudentStatisics} methods. #getComponentAt(int, int) getComponentAt
 * 
 * @author bibhushan
 * 
 */
public class StudentsReport {

	public static void main(String[] args) {
		Student student1 = new Student();
		Student student2 = new Student();
		Student student3 = new Student();
		Student student4 = new Student();
		Student student5 = new Student();
		student1.setData("Ram", "Bct", 504, new float[] { 60, 70, 60, 50, 50 });
		student2.setData("Shyam", "Bex", 504,
				new float[] { 60, 75, 61, 58, 51 });
		student3.setData("Hari", "Bce", 504, new float[] { 80, 77, 61, 40, 30 });
		student4.setData("Seeta", "Bcscit", 504, new float[] { 50, 90, 20, 10,
				50 });
		student5.setData("Ramesh", "Bim", 504,
				new float[] { 30, 50, 90, 70, 10 });
		System.out.println("Name\t\t Class\t Roll.no\t GPA\t Percentage");
		student1.displayStudentStatistics();
		student2.displayStudentStatistics();
		student3.displayStudentStatistics();
		student4.displayStudentStatistics();
		student5.displayStudentStatistics();
	}
}

/**
 * 
 * This class consists of variables: name, className, rollNo, marks. The method
 * get and set are used to retrieve and initialize the variables.This class also
 * consists of method to calculate gpa and pecentage.
 * 
 * @author bibhushan
 * 
 */
class Student {
	private String name;
	private String className;
	private int rollNo;
	private float[] marks;

	/**
	 * this method is used to initialize the variables.
	 * 
	 * @param name
	 * @param className
	 * @param rollNo
	 * @param marks
	 */
	public void setData(String name, String className, int rollNo, float[] marks) {
		this.name = name;
		this.className = className;
		this.rollNo = rollNo;
		this.marks = marks;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the className
	 */
	public String getClassName() {
		return className;
	}

	/**
	 * @return the rollNo
	 */
	public int getRollNo() {
		return rollNo;
	}

	/**
	 * @return the marks
	 */
	public float[] getMarks() {
		return marks;
	}

	/**
	 * This method is used to make sum of marks a student.
	 * 
	 * @return sum of marks
	 */
	public float getTotal() {
		float total = 0;
		for (int i = 0; i < marks.length; i++) {
			total = total + marks[i];
		}
		return total;
	}

	/**
	 * This method calculates GPA of a student
	 * 
	 * @return calculated gpa
	 */
	public float calculateGPA() {
		return this.getTotal() / 500 * 4;
	}

	/**
	 * This method calculates percentage of student
	 * 
	 * @return calculated percentage
	 */
	public float calculatePercentage() {
		return this.getTotal() / 500 * 100;
	}

	/**
	 * 
	 * This method displays students: name, class name, rollno , gpa and
	 * percentage.
	 * 
	 */
	public void displayStudentStatistics() {
		System.out.println(name + "\t\t " + className + "\t " + rollNo
				+ "\t\t " + this.calculateGPA() + "\t "
				+ this.calculatePercentage());
	}

}
