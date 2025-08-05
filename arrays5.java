package my_Project;

import java.util.*;

public class arrays5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        // Input number of elements
	        System.out.print("Enter number of elements: ");
	        int n = scanner.nextInt();

	        int[] elements = new int[n];
	        System.out.println("Enter " + n + " elements:");
	        for (int i = 0; i < n; i++) {
	            elements[i] = scanner.nextInt();
	        }

	        // Use LinkedHashSet to maintain insertion order and remove duplicates
	        Set<Integer> uniqueElements = new LinkedHashSet<>();
	        for (int num : elements) {
	            uniqueElements.add(num);
	        }

	        // Print unique elements
	        System.out.println("Unique elements are:");
	        for (int num : uniqueElements) {
	            System.out.print(num + " ");
	        }

	        scanner.close();
	}

}
