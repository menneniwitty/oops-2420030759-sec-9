package my_Project;

import java.util.Scanner;

public class controlstatements7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Enter a number to print the multiplication table: ");
    int number = scanner.nextInt();
    
    
    System.out.println("Multiplication table for " + number + ":");
    for(int i=1; i<=10;i++) {
    	System.out.println(number + " X " + i + " = " + (number * i));
    }
    
    scanner.close();
	}

}
