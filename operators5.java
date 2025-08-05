package my_Project;

public class operators5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int num = 20;
    
    System.out.println("Initial value: " + num);
    
    num += 7;
    System.out.println("After += 7: " + num);
    
    num -= 9;
    System.out.println("After -= 9: " + num);
    
    num *= 5;
    System.out.println("After *= 5: " + num);
    
    num /= 2;
    System.out.println("After /= 2: " + num);
    
    num %= 10;
    System.out.println("After %= 10: " + num);
    
    
    num = 16;
    num &= 8;
    System.out.println("After &= 8: " + num);
    
    num |= 4;
    System.out.println("After |= 4: " + num);
    
    num ^= 2;
    System.out.println("After ^= 2: " + num);
    
    num <<=1;
    System.out.println("After <<=1: " + num);
    
    num >>=1;
    System.out.println("After >>= 1: " + num);
    
	}

}
