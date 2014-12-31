package dec29;

/*
*
*
* 1. Write a program that displays the temperatures from 0 degrees Celsius to 100
*	 degrees Celsius and its Fahrenheit equivalent. Note that the conversion from
*	 Celsius to Fahrenheit uses the following formula: F = C * 9/5 + 32;
*
*
*
*
*/

/**
* 
* This class uses switch case to give user the option to do: Evaluation of the
* temperature from 0°C to 100°C. Also with its conversion into degree Fahrenheit.
* 
* @author Bibhushan Raj Joshi
*/

public class TempConverter {

	public static void main(String[] args) {
		
		float cDegree = 0;
		float fDegree = 0;
		String Degree  = "\u00b0";
		int count = 0;
		
		System.out.println("Converted temperature: ");

		/*celsius to farenheit conversion process*/
		for (int i=0; i < 100; i++) {
			fDegree = (i * 9 / 5 + 32);
			count++;
			System.out.println(count+"\t"+cDegree +Degree+"C equals to " + fDegree +Degree+"F");
		}
	}
}
