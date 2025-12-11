package loops;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the n value....");
//		int n = sc.nextInt();
//		for (int i = 1; i <= n; i++) {
//			System.out.print(i + " ");
//		}
		
		int a=5;
		int b=10;
		
		System.out.println(a+ " 01 "+ b);
		// step 01
		int temp;
		temp = a;
		a=b;
		b= temp;
		
		// step 02
		a = a+b;
		b = a-b;
		a = a-b;
		
		// step 03
		a = a^b;
		b = a^b;
		a = a^b;
		   
		
//		 for (int i ='B'-'A'; i < 'e'; i++) {
//	            System.out.println(i);
//	        }
		
		
	}

}
