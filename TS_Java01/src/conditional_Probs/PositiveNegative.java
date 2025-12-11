package conditional_Probs;

import java.util.Scanner;

public class PositiveNegative {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a: ");
		int a = sc.nextInt();

		System.out.println("Enter the value of b: ");
		int b = sc.nextInt();

		if (a > b) {
			System.out.println(a + " is larger...");
		} else {
			System.out.println(b + " is larger..");
		}

		if (a >= 0) {
			System.out.println(a + " is Positive Number...");
		} else {
			System.out.println(a + " is Negative Number..");
		}

	}

}
