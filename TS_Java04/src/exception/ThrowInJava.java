package exception;

public class ThrowInJava {

	public static void main(String[] args) {
		int c;

		try {
			c = devide(10, 5);
			System.out.println("C value is: " + c);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			c = devide(10, 0);
			System.out.println("C value is: " + c);
		} catch (Exception e) {
			System.out.println("Exception Occured..");
			System.out.println(e.getMessage());
		}

	}

	public static int devide(int a, int b) throws ArithmeticException{
		if (b == 0) {
			throw new ArithmeticException("Devide by Zero");
		}
		return b;

	}

}
