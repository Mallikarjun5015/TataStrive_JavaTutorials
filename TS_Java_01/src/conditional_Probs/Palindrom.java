package conditional_Probs;

import java.util.Scanner;

public class Palindrom {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		int n = num;
		int rev = 0;

		while (num != 0) {
			int a = num % 10;
			rev = rev * 10 + a;
			num = num / 10;
		}
		if (n == rev) {
			System.out.println(n + " number is palindrome");
		} else {
			System.out.println(n + " number is not palindrome");
		}
	}
}
