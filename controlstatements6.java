package my_Project;

import java.util.Scanner;

public class controlstatements6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scanner = new Scanner(System.in);
    int number;
    
    System.out.println("Enter numbers (enter 0 to stop):");
    
    do  {
    	number = scanner.nextInt();
    	if (number != 0) {
    		System.out.println("You entered: " + number);
    	}
    } while (number != 0);
    
    System.out.println("Program ended.");
    scanner.close();
	}

}
