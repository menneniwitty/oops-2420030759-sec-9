package my_Project;

import java.util.Scanner;

public class arrays3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scanner = new Scanner(System.in);
    int[] marks = new int[6];
    int total = 0;
    
    System.out.println("Enter marks for six subjects:");
    for (int i=0;i<6;i++) {
    	System.out.print("Subject " + (i+1) + ": ");
    	marks[i] = scanner.nextInt();
    	total += marks[i];
    }
    
    double average = total / 6.0;
    
    System.out.println("\n Marks in each subject");
    for (int i=0;i<6;i++) {
    	System.out.println("Subject " + (i + 1) + ": " + marks[i]);
    }
    
    System.out.println("\nTotal Marks: " + total);
    System.out.println("Average Marks: " + average);
    
    scanner.close();
	}

}
