package my_Project;

public class wrapperclasses4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int intVal = 10;
    double doubleVal = 20.50;
    char charVal = 'B';
    boolean boolVal = true;
    
    Integer boxedInt = intVal;
    Double boxedDouble = doubleVal;
    Character boxedChar = charVal;
    Boolean boxedBool = boolVal;
    
    System.out.println("Auto-boxed Integer: " + boxedInt);
    System.out.println("Auto-boxed Double: " + boxedDouble);
    System.out.println("Auto-boxed Character: " + boxedChar);
    System.out.println("Auto-boxed Boolean: " + boxedBool);
    
    
	}

}
