package bigInteger;

import java.math.BigInteger;
import java.util.Scanner;

public class Fibonacci {
	
	
	private static BigInteger fibonacci(int n) {
		BigInteger a = new BigInteger("1");
		BigInteger b = new BigInteger("1");
		
		BigInteger c = null;
		if(n<=2) {
			return a;
		}
		
		for( int i=3; i<=n; i++) {
			c=a.add(b);
			a=b;
			b=c;
		}
		return b;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the fibonacci num uh want of: ");
		int n = sc.nextInt();
		
		System.out.println("Fibonacci of "+n+" is: "+fibonacci(n));
		
		sc.close();

	}
}
