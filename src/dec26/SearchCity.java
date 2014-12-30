package dec26;
import java.util.Scanner;

/*
 * WAP which accepts name of cities. Ask a user to enter character sequence to search
 * the city.Then display the searched cities.
 */

/**
 * 
 * @author bibhushan
 *
 */

public class SearchCity {
	
	private static Scanner scan;
	
	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		//Take 5 cities names
		String [] initial = new String [5];
		System.out.println("Enter names of the city:");
		
		for(int i=0;i<initial.length;i++){
			initial[i] = scan.nextLine();
		}
		
		//get the search character
		System.out.println("Search the city");
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



