package my_Project;

public class wrapperclasses2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a = 2;
    
    Integer boxedA = Integer.valueOf(a);
    System.out.println("Manually Boxed Integer: " + boxedA);
    
    boolean b = true;
    Boolean boxedB = Boolean.valueOf(b);
    System.out.println("Manually Boxed Boolean: " + boxedB);
    
    char c = 'D';
    Character boxedC = c;
    System.out.println("Auto Boxed Character: " + boxedC);
    
    double d = 10.5;
    Double boxedD = d;
    System.out.println("Auto Boxed Double: " + boxedD);
	}

}
