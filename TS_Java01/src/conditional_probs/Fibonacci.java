package conditional_probs;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Entered number is: "+n);
		
		int result = fibonacci(n);
		
		System.out.println("\nFibonacco of "+n+" is "+ result);
	}
	
	private static int fibonacci(int n) {
		int f[] = new int[n+2];
		
		f[0]=0; f[1]=1;
		
		for(int i=2; i<=n; i++) {
			f[i]=f[i-1]+f[i-2];
		}
		
		return f[n];
	}

//	private static int fibonacci(int n) {
//		if(n<=1) return n;
//		
//		return fibonacci(n-1)+fibonacci(n-2);
//	}
	
//	private static int fibonacci(int n) {
//		
//		int n1= 0; int n2=1; int n3;
//		
//		for(int i =0; i<n; i++) {
//			System.out.print(n2+" ");
//			n3= n2+n1;
//			n1=n2;
//			n2=n3;
//		}
//		return n1;
//	}

}
