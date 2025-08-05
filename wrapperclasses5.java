package my_Project;

public class wrapperclasses5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Integer numObject = 10;
    
    int numPrimitive = numObject;
    
    int result = numPrimitive + 10;
    
    
    System.out.println("Wrapper object (Integer): " + numObject);
    System.out.println("Auto-unboxed primitive (int): " + numPrimitive);
    System.out.println("Result after adding 10: " + result);
	}

}
