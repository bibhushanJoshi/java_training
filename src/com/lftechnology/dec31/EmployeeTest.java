package com.lftechnology.dec31;

/**
 * 
 * 5. Create a class called Employee that includes three pieces of information
 * as instance variables a first name (type String), a last name (type String)
 * and a monthly monthSalary (double). Your class should have a constructor that
 * initializes the three instance variables. Provide a set and a get method for
 * each instance variable. Write a test application named EmployeeTest that
 * demonstrates class Employee's capabilities. Create two Employee objects and
 * display each object's yearly monthSalary. Then give each Employee a 10% raise
 * and display each Employee's yearly monthSalary again.
 * 
 * 
 * This class uses object of class {@link Employee}. The set and get methods are
 * used to retrieve and assign the variables, while display is used to show
 * employee details.
 * 
 * @author bibhushan
 * 
 */
public class EmployeeTest {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		e1.setFirstName("Ram");
		e1.setLastName("Sharma");
		e1.setMonthSalary(100);
		System.out
				.println("First name\t Last name\t yearSalary\t raisedSalary");
		e1.displayEmployeeDetail();
		e2.setFirstName("Hari");
		e2.setLastName("Sharma");
		e2.setMonthSalary(200);
		e2.displayEmployeeDetail();

	}
}

/**
 * This class includes variables first name (type String), last name (type
 * String) and a monthly monthSalary (double). This has a constructor that
 * initializes the three instance variables.The set and get method for each made
 * for each variable. getRaisedSalary and displayEmployeeDetail are use to show
 * employee information
 * 
 * @author bibhushan
 * 
 */
class Employee {
	private String firstName;
	private String lastName;
	private double monthSalary;

	public Employee() {
		firstName = "";
		lastName = "";
		monthSalary = 0;
	}

	public void setMonthSalary(double monthSalary) {
		this.monthSalary = monthSalary;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName
	 *            the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName
	 *            the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the monthSalary
	 */
	public double getMonthSalary() {
		return monthSalary;
	}

	/**
	 * returns yearly salary
	 * 
	 * @return
	 */
	public double getYearSalary() {
		return monthSalary * 12;
	}

	/**
	 * returns the salary with 10% raise
	 * 
	 * @return
	 */
	public double getRaisedSalary() {
		return monthSalary * 0.1 + monthSalary;
	}

	/**
	 * Displays the details of the Employee.
	 */
	public void displayEmployeeDetail() {
		System.out.println(firstName + "\t\t " + lastName + "\t\t "
				+ this.getYearSalary() + "\t\t " + this.getRaisedSalary());
	}
}