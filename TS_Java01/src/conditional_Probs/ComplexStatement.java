package conditional_Probs;

import java.util.Scanner;

public class ComplexStatement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number...");
		int n = sc.nextInt();

		if (n > 0) {
			System.out.print("Positive ");
			if (n % 2 == 0) {
				System.out.print("Even..");
			} else {
				System.out.print("Odd..");
			}
		} else if (n < 0) {
			System.out.print("Negative ");
			if (n % 2 == 0) {
				System.out.print("Even..");
			} else {
				System.out.print("Odd..");
			}
		}
		else {
			System.out.println("Zero");
		}

	}

}
