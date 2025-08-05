package my_Project;

import java.util.Scanner;

public class arrays4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner scanner = new Scanner(System.in);

	        // Input number of elements
	        System.out.print("Enter number of elements: ");
	        int n = scanner.nextInt();

	        int[] elements = new int[n];

	        // Input elements
	        System.out.println("Enter " + n + " elements:");
	        for (int i = 0; i < n; i++) {
	            elements[i] = scanner.nextInt();
	        }

	        // Input element to search
	        System.out.print("Enter element to search: ");
	        int key = scanner.nextInt();

	        // Linear search
	        boolean found = false;
	        for (int i = 0; i < n; i++) {
	            if (elements[i] == key) {
	                System.out.println("Element " + key + " found at position " + (i + 1));
	                found = true;
	                break;
	            }
	        }

	        if (!found) {
	            System.out.println("Element " + key + " not found.");
	        }

	        scanner.close();
	}

}
