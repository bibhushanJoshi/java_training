package dec26;
import java.util.Scanner;

public class SearchCity {
	
	private static Scanner scan;
	
	public static void main(String[] args) {
		
		//Take 5 cities names
		String [] initial = new String [5];
		System.out.println("Enter names of the city:");
		
		for(int i=0;i<5;i++){
			scan = new Scanner(System.in);
			initial[i] = scan.nextLine();
		}
		
		//get the search character
		System.out.println("Search the city");
			scan = new Scanner(System.in);
		String searchWord = scan.nextLine();
		
		//search the city required
		System.out.println("The required results are");
		for(int j=0;j<5;j++){
			if(initial[j].toLowerCase().contains(searchWord.toLowerCase())){
				System.out.println(initial[j]);
			}
		}
	}
}



