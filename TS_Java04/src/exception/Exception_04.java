package exception;

import java.io.File;
import java.io.IOException;

public class Exception_04 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };

		try {
			System.out.println(arr[5]);
		} catch (ArithmeticException e) {
			System.out.println(e);
		}

		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		
	}

}
