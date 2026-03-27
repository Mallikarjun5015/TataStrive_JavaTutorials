package methods;

import java.util.ArrayList;

public class PrimeFactor {

	public static void main(String[] args) {

		int num = 700;

		ArrayList<Integer> list = primeFactor(num);

		for (Integer integer : list) {
			System.out.print(integer + " ");
		}
	}

	private static ArrayList<Integer> primeFactor(int num) {

		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 2; i <= num; i++) {
			while (num % i == 0 && num > 0) {
				list.add(i);
				num = num / i;
			}
		}
		return list;
	}
}
