package exception;

public class MethodStack {

	public static void methodE() {
		int[] num = new int[2];
		num[0] = num[1] = 16;

		System.out.println("Value 1 " + num[0]);

		try {
			num[2] = 0;
		} finally {
			System.out.println("num 2 is " + num[1]);
		}
	}

	public static void methodD() {
		methodE();
	}

	public static void methodC() {
		methodD();
	}

	public static void methodB() {
		methodC();
	}

	public static void methodA() {
		methodB();
	}

	public static void main(String[] args) {

		try {
			methodA();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
