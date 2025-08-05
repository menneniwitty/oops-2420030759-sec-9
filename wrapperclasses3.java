package my_Project;

public class wrapperclasses3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Integer boxedInt = Integer.valueOf(100);
    int unboxedInt = boxedInt.intValue();
    System.out.println("Manually Unboxed int: " + unboxedInt);
    
    Double boxedDouble = 10.50;
    double unboxedDouble = boxedDouble;
    System.out.println("Auto Unboxed double: " + unboxedDouble);
    
    Character boxedChar = 'W';
    char unboxedChar = boxedChar;
    System.out.println("Auto Unboxed char: " + unboxedChar);
    
    Boolean boxedBoolean = Boolean.TRUE;
    boolean unboxedBoolean = boxedBoolean.booleanValue();
    System.out.println("Manually Unboxed boolean: " + unboxedBoolean);
	}

}
