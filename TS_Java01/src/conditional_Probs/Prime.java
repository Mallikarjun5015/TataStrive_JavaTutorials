package conditional_Probs;

import java.util.Scanner;

public class Prime {
	
	public static boolean isPrime(int n) {
		
		if(n==1) return false;
		
		if(n==2 || n==3) return true;
		
		if(n%2==0 || n%3==0) return false;
		
		for(int i = 6; i*i<n; i++) {
			if(n%i==0 || n%(i+2)==0) return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println("The Values "+n+" is Prime? "+isPrime(n));
		
		
		
		

	}

}
