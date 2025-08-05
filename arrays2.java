package my_Project;

import java.util.Scanner;

public class arrays2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Enter the number of elements: ");
    int n = scanner.nextInt();
    
    int[] elements = new int[n];
    
    System.out.println("Enter " + n + " elements:");
    for (int i=0; i<n;i++) {
    	elements[i] = scanner.nextInt();
    }
    
    System.out.println("Enter:");
    for (int i=0;i<n;i++) {
    	System.out.println(elements[i]);
    }
    
    scanner.close();
	}

}
