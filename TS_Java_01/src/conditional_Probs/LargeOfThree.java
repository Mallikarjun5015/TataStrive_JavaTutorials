package conditional_Probs;

import java.util.Scanner;

public class LargeOfThree {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the a value : ");
		int a = sc.nextInt();

		System.out.println("Enter the b value : ");
		int b = sc.nextInt();

		System.out.println("Enter the c value : ");
		int c = sc.nextInt();

		if (a > b && a > c) {
			System.out.println(a + " is Largest...");
		} else if (b > a && b > c) {
			System.out.println(b + " is Largest..");
		} else {
			System.out.println(c + " is Largest..");
		}

	}

}
