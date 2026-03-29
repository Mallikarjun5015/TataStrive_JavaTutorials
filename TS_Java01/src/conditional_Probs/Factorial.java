package conditional_Probs;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println("Factorial is "+factorial(n));
		
		System.out.println("Fact by recursive "+recursiveFact(n));
		
		System.out.println("Fact by big int "+bigIntFact(n));

	}

	private static BigInteger bigIntFact(int n) {
		BigInteger res= BigInteger.ONE;
		
		for (int i = 2; i <= n; i++) {
			res=res.multiply(BigInteger.valueOf(i));			
		}
		return res;
	}

	private static int recursiveFact(int n) {
		if(n==0 || n==1) {
			return 1;
		}
		return n*recursiveFact(n-1);
		
	}

	private static int factorial(int n) {
		int ans = 1;
		
		for(int i = 2; i<=n; i++) {
			ans*=i;
		}
		return ans;
	}

}
