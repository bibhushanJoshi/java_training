package com.lftechnology.dec31;

/**
 * Create class SavingsAccount. Use a static variable annualInterestRate to
 * store the annual interest rate for all account holders. Each object of the
 * class contains a private instance variable savingsBalance indicating the
 * amount the saver currently has on deposit. Provide method
 * calculateMonthlyInterest to calculate the monthly interest by multiplying the
 * savingsBalance by annualInterestRate divided by 12. This interest should be
 * added to savingsBalance. Provide a static method modifyInterestRate that sets
 * the annualInterestRate to a new value. Write a program to test class
 * SavingsAccount. Instantiate two savingsAccount objects, saver1 and saver2,
 * with balances of $2000.00 and $3000.00, respectively. Set annualInterestRate
 * to 4%, then calculate the monthly interest and print the new balances for
 * both savers. Then set the annualInterestRate to 5%, calculate the next
 * month's interest and print the new balances for both savers.
 * 
 * This method creates object of class {@link SavingAccount}. Get a set methods
 * are used to assign and retrieve values of the variables. This class gives out
 * the first and second month's saving amount of a saver.
 * 
 * 
 * @author bibhushan
 * 
 */
public class TestSavingAccount {

	public static void main(String[] args) {
		SavingAccount saver1 = new SavingAccount(2000, 4);
		SavingAccount saver2 = new SavingAccount(3000, 4);
		double firstSalary = saver1.getSavingBalance()
				+ saver1.calculateMonthlyInterest();
		saver1.setInterestRate(5);
		System.out.println("First month salary: $" + firstSalary);
		System.out.println("Second month salary: $"
				+ (firstSalary + saver1.calculateMonthlyInterest()));
		firstSalary = saver2.getSavingBalance()
				+ saver1.calculateMonthlyInterest();
		saver2.setInterestRate(5);
		System.out.println("First month salary: $" + firstSalary);
		System.out.println("Second month salary: $"
				+ (firstSalary + saver1.calculateMonthlyInterest()));
		saver2.setInterestRate(5);

	}
}

/**
 * 
 * This class consists of static variable annualInterestRate to store the annual
 * interest rate for all account holders and private variable savingsBalance
 * indicating the amount the saver currently has on deposit. The method get and
 * set are used to retrieve and assign variables while calculateMonthlyInterest
 * calculates each months interest.
 * 
 * @author bibhushan
 * 
 */
class SavingAccount {
	static float annualInterestRate;
	private double savingBalance;

	/**
	 * @param saveBalance
	 * @param annualIntRate
	 */
	public SavingAccount(double saveBalance, float annualIntRate) {
		this.savingBalance = saveBalance;
		annualInterestRate = annualIntRate;
	}

	/**
	 * @return the savingBalance
	 */
	public double getSavingBalance() {
		return savingBalance;
	}

	/**
	 * @param savingBalance
	 *            the savingBalance to set
	 */
	public void setSavingBalance(double savingBalance) {
		this.savingBalance = savingBalance;
	}

	/**
	 * the newInterest is set.
	 * 
	 * @param newInterest
	 */
	public void setInterestRate(float newInterest) {
		annualInterestRate = newInterest;
	}

	/**
	 * @return monthly interest amount of saver's Balance.
	 */
	public double calculateMonthlyInterest() {
		return savingBalance * annualInterestRate / (12 * 100);
	}
}
