package conditional_probs;

import java.util.ArrayList;

public class Fact {

	public static ArrayList<Integer> printDivisors1(int n) {
		ArrayList<Integer> divisors = new ArrayList<>();
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				divisors.add(i);
			}
		}
		return divisors;
	}

	public static ArrayList<Integer> printDivisors2(int n) {

		ArrayList<Integer> divisors = new ArrayList<>();

		for (int i = 1; i * i <= n; i++) {
			if (n % i == 0) {

				divisors.add(i);

				if (i != n / i) {
					divisors.add(n / i);
				}
			}
		}
		return divisors;
	}

	public static void main(String[] args) {

		int number = 10;

		ArrayList<Integer> divisors = printDivisors2(number);

		for (int div : divisors) {
			System.out.print(div + " ");
		}
	}
}