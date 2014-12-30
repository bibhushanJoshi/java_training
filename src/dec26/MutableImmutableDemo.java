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
		String user ="Bibhushan";
		String space = " ";
		
		//using stringBuilder
		StringBuilder welcome = new StringBuilder();
		welcome.append(greeting).append(space).append(user);
		System.out.println("Mutable: "+welcome);
		
		//using string is immutable since its value doesn't change after concatenation
		greeting.concat(space).concat(user).concat(space).concat("Joshi");
		System.out.println("Immutable: "+greeting);
	}
}
