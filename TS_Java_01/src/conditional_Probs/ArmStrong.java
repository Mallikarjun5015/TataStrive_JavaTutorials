package conditional_Probs;

import java.util.Scanner;

public class ArmStrong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		int n = num;
		int rev = 0;

		while (num != 0) {
			int a = num % 10;
			rev = rev + a * a * a;
			num = num / 10;
		}
		if (n == rev) {
			System.out.println(n + " number is armstrong...");
		} else {
			System.out.println(n + " number is not armstrong...");
		}
	}
}
