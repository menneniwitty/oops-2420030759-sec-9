package my_Project;

public class Operators4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a=10;
    int b=8;
    
    int andResult = a & b;
    System.out.println("a & b = " + andResult);
    
    int orResult = a | b;
    System.out.println("a | b = " + orResult);
    
    int xorResult = a ^ b;
    System.out.println("a ^ b = " + xorResult);
    
    int notA = ~a;
    int notB = ~b;
    System.out.println("~a = " + notA);
    System.out.println("~b = " + notB);
	}

}
