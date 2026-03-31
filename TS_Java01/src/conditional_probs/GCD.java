package conditional_probs;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int ans = gcd4(a,b);
		System.out.println("GCD of "+a+" and "+b+" is "+ans);

	}

	private static int gcd4(int a, int b) {
		if(a == 0 || b == 0) return Math.max(a, b);
		
		int ans=1;
		for(int i=Math.min(a,b); i>=1; i--) {
			if(a%i==0 && b%i==0) {
				return i;
			}
		}
		return ans;
	}
	
	public static int gcd2(int a, int b) {
		if(a==0 || b==0 ) 
			return Math.max(a,b);
		
		if(a==b) return a;
		
		if(a>b) {
			return gcd2(a-b, b);
		}
		return gcd2(a, b-a);
	}
	
	
	public static int gcd3(int a, int b) {
		if(a==0 || b==0 ) 
			return Math.max(a,b);
		
		if(a==b) return a;
		
		if(a>b) {
			if(a%b==0)
				return a;
			return gcd3(a-b,b);
		}
		if(b%a==0) 
			return b;
			
		return gcd3(a, b-a);
	}
}
