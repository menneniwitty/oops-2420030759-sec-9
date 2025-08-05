package my_Project;

import java.util.Scanner;

public class controlstatements2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Enter a number: ");
    int number = scanner.nextInt();
    
    
    if (number % 2 == 0) {
    	System.out.println("Even");
    } else {
    	System.out.println("Odd");
    }
    
    scanner.close();
	}

}
