package bigInteger;

import java.math.BigInteger;




public class Prime {
	
	public static boolean isPrime(int n) {
		
		BigInteger num = new BigInteger(String.valueOf(n));
		
		return num.isProbablePrime(1);
	}

	public static void main(String[] args) {
		BigInteger a = new BigInteger("10");
		BigInteger b = new BigInteger("17");
		
		System.out.println(a.isProbablePrime(0));
		System.out.println(a.isProbablePrime(1));
		
		System.out.println(b.isProbablePrime(0));
		System.out.println(b.isProbablePrime(1));
		
		BigInteger c = new BigInteger("2345678909654321234567345");
		
		System.out.println(c.isProbablePrime(0));
		System.out.println(c.isProbablePrime(1));
		System.out.println(c.nextProbablePrime());
		
		int num = 136789;
		
		System.out.println("Is the vaue "+num+" is prime: "+isPrime(num));
		

	}

}
