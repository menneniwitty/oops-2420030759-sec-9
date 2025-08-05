package my_Project;

import java.util.Scanner;

public class controlstatements5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Enter the value of N: ");
    int N = scanner.nextInt();
    
    for (int i = 1; i <= N; i++) {
    	System.out.println(i);
    }
    
    scanner.close();
	}

}
