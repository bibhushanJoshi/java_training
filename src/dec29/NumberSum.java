package dec29;

/*
*
*
*
* 2. Write a program to find the number of and sum of all integers greater than 100 
* 	and less than 200 that are divisible by 7.
*
*
*
*/

/**
* 
* This class uses switch case to give user the option to do: 
* greater than 100 and less than 200 and divisible by 7 
* 
* 
* @author Bibhushan Raj Joshi
*/

public class NumberSum {

	public static void main(String[] args) {
		
		int min = 101;
		int max = 200;
		int sum = 0;
		int count = 0;

		/*sum of number greater than 100 and less than 200 which is divisible by 7*/
		for (int i = min; i < max; i++) {
			if (i % 7 == 0) {
				count++;
				System.out.println(count+"\t"+i);
				sum = sum + i;
			}
		}
		System.out.println("The required sum is:" + sum);

	}

}
