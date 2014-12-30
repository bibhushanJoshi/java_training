package dec26;

/*
 * Create a class MutableImmutableDemo. Inside that class create object greeting
 * of string & another object welcome of stringBuilder.Try to modify both obj by 
 * concate. Some string on a suffix.
 */

/**
 * 
 * @author bibhushan
 *
 */

public class MutableImmutableDemo {
	public static void main(String args[]){
		String greeting = "Hello";
		String s1 ="Bibhushan";
		String s2 = " ";
		String s4;
		
		//using stringBuilder
		StringBuilder welcome = new StringBuilder();
		welcome.append(greeting).append(s2).append(s1);
		System.out.println(welcome);
		
		//using string concatenation
		s4 = greeting.concat(s2).concat(s1).concat(s2).concat("Joshi");
		System.out.println(s4);
	}

}
