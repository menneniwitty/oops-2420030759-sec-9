package my_Project;

public class wrapperclasses1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 byte byteVal = 127;              // 1 byte
	        short shortVal = 32000;          // 2 bytes
	        int intVal = 100000;             // 4 bytes
	        long longVal = 10000000000L;     // 8 bytes

	        float floatVal = 5.75f;          // 4 bytes
	        double doubleVal = 19.99;        // 8 bytes

	        char charVal = 'A';              // 2 bytes
	        boolean boolVal = true;          // 1 bit

	        // Non-primitive data types
	        String stringVal = "Hello, Java!";
	        int[] intArray = {1, 2, 3, 4, 5};

	        // Wrapper classes
	        Integer wrappedInt = Integer.valueOf(intVal);
	        Double wrappedDouble = Double.valueOf(doubleVal);

	        // Display all values
	        System.out.println("---- Primitive Data Types ----");
	        System.out.println("byte: " + byteVal);
	        System.out.println("short: " + shortVal);
	        System.out.println("int: " + intVal);
	        System.out.println("long: " + longVal);
	        System.out.println("float: " + floatVal);
	        System.out.println("double: " + doubleVal);
	        System.out.println("char: " + charVal);
	        System.out.println("boolean: " + boolVal);

	        System.out.println("\n---- Non-Primitive Data Types ----");
	        System.out.println("String: " + stringVal);

	        System.out.print("Array: ");
	        for (int num : intArray) {
	            System.out.print(num + " ");
	        }

	        System.out.println("\n\n---- Wrapper Classes ----");
	        System.out.println("Wrapped Integer: " + wrappedInt);
	        System.out.println("Wrapped Double: " + wrappedDouble);
	}

}
