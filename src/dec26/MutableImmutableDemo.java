package dec26;
public class MutableImmutableDemo {
	public static void main(String args[]){
		String s1 = "greeting";
		String s2 = "welcome";
		String s4 ="Everyone";
		
		//using stringBuilder
		StringBuilder s3 = new StringBuilder();
		s3.append("dfd").append(s1).append(s2);
		System.out.println(s3);
		
		//using string concatenation
		s4 = s4.concat("heheheh").concat(s1);
		System.out.println(s4);
	}

}
