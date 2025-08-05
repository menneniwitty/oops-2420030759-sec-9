package my_Project;

import java.util.Scanner;

public class controlstatements3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Enter the student's marks (0 - 100): ");
    int marks = scanner.nextInt();
    
    if (marks < 0 || marks > 100) {
    	System.out.println("Invalid marks. Enter a value between 0 and 100.");
    } else if (marks >= 90) {
    	System.out.println("Grade A");
    } else if (marks >= 80) {
    	System.out.println("Grade B");
    } else if (marks >= 70) {
    	System.out.println("Grade C");
    } else if (marks >= 60) {
    	System.out.println("Grade D");
    } else {
    	System.out.println("Grade F");
    }
    scanner.close();
	}

}
