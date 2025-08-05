package my_Project;

import java.util.Scanner;

public class strings1 {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);

	       
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();

	        
	        System.out.println("You entered: " + input);

	        scanner.close();
	}

}
