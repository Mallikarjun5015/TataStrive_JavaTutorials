package loops;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the n value....");
//		int n = sc.nextInt();
//		for (int i = 1; i <= n; i++) {
//			System.out.print(i + " ");
//		}

//		int a=5;
//		int b=10;
//		
//		System.out.println(a+ " 01 "+ b);
		// step 01
//		int temp;
//		temp = a;
//		a=b;
//		b= temp;
//		
//		// step 02
//		a = a+b;
//		b = a-b;
//		a = a-b;
//		
//		// step 03
//		a = a^b;
//		b = a^b;
//		a = a^b;

//		 for (int i ='B'-'A'; i < 'e'; i++) {
//	            System.out.println(i);
//	        }

//		for (int i = 1; i <= 3; i++) {
//			for (int j = 1; j <= 3; j++) {
//			System.out.print("(" + i + "," + j + ") ");
//			}
//			System.out.println();
//			}
		
		String s = sc.next();
		
		for (int i = 0; i < s.length()-1; i++) {
			if(i%2==0) {
				System.out.print(s.charAt(i));
			}
		}
	}
}
