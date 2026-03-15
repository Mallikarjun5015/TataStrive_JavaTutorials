package bigInteger;

import java.math.BigInteger;

public class BigIntJava {

	public static void main(String[] args) {
		
		// Initializing BigInteger in Java
		
		// 01. Using New Keyword
		
		BigInteger a = new BigInteger("12345");
		System.out.println("The value of a is: "+a);
		
		// 02. Passing String Variable
		
		String b = "43215";
		a=new BigInteger(b);
		System.out.println("The value of a is: "+a);
		
		// 03. Using valueOf() static method 
		
		a=BigInteger.valueOf(34567);
		System.out.println("The value of a is: "+a);
		
		System.out.println(a.intValue()+" is Integer value");
		System.out.println(a.longValue()+" is long value");
		System.out.println(a.toString()+" is String value");
		
		

	}

}
