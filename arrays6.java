package my_Project;

import java.util.Scanner;

public class arrays6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        // Input size of array
	        System.out.print("Enter number of elements: ");
	        int n = scanner.nextInt();

	        int[] elements = new int[n];

	        // Input elements
	        System.out.println("Enter " + n + " elements:");
	        for (int i = 0; i < n; i++) {
	            elements[i] = scanner.nextInt();
	        }

	        // Initialize min and max
	        int min = elements[0];
	        int max = elements[0];

	        // Find min and max
	        for (int i = 1; i < n; i++) {
	            if (elements[i] < min) {
	                min = elements[i];
	            }
	            if (elements[i] > max) {
	                max = elements[i];
	            }
	        }

	        // Output
	        System.out.println("Smallest element: " + min);
	        System.out.println("Largest element: " + max);

	        scanner.close();
	}

}
