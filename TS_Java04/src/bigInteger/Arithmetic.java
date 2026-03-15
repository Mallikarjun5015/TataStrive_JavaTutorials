package bigInteger;

import java.math.BigInteger;

public class Arithmetic {

	public static void main(String[] args) {
		
		BigInteger a = new BigInteger("100");
		System.out.println("The value of a is: "+a);
		
		BigInteger b = new BigInteger("50");
		System.out.println("The value of b is: "+b);
		
		
		
		BigInteger a1= a.add(b);
		System.out.println("Addition: "+a1);
		
		BigInteger a2= a.subtract(b);
		System.out.println("Substraction: "+a2);
		
		BigInteger a3= a.multiply(b);
		System.out.println("Multiplication: "+a3);
		
		BigInteger a4= a.divide(b);
		System.out.println("Division: "+a4);
		
		BigInteger a5= a.remainder(b);
		System.out.println("Reminder: "+a5);
		
		System.out.println(a.compareTo(a3));
		System.out.println(b.compareTo(a2));
		System.out.println(a.compareTo(b));
		
		System.out.println(a2.equals(b));	
		

	}

}
