package my_Project;

public class strings3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String text = "  Java Programming Language  ";

	        System.out.println("Original: '" + text + "'");

	        String trimmed = text.trim();
	        System.out.println("Trimmed: '" + trimmed + "'");

	        System.out.println("Uppercase: " + trimmed.toUpperCase());

	        System.out.println("Lowercase: " + trimmed.toLowerCase());
	        
	        System.out.println("Length: " + trimmed.length());

	        System.out.println("Character at index 5: " + trimmed.charAt(5));

	        System.out.println("Substring (5 to 15): " + trimmed.substring(5, 15));

	        System.out.println("Contains 'Programming': " + trimmed.contains("Programming"));
	        
	        System.out.println("Replace 'Java' with 'Python': " + trimmed.replace("Java", "Python"));
	}

}
