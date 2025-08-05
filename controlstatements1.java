package my_Project;

import java.util.Scanner;

public class controlstatements1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Enter a number: ");
    int number = scanner.nextInt();
    
    if (number > 0) {
    	System.out.println("Positive");
    } else if (number == 0) {
    	System.out.println("Zero");
    } else {
    	System.out.println("Negative");
    }
    
    scanner.close();
	}

}
