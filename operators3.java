package my_Project;

import java.util.Scanner;

public class operators3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner (System.in);
		    
		    System.out.print("Enter theory marks: ");
		    int theoryMarks = scanner.nextInt();
		    
		    System.out.print("Enter practical marks: ");
		    int practicalMarks = scanner.nextInt();
		    
		    if (theoryMarks >= 40 && practicalMarks >= 40) {
		    	System.out.println("The student passed both exams.");
		    } else {
		    	System.out.println("The student failed.");
		    }
		    scanner.close();
	}

}
