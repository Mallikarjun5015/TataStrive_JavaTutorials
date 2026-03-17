package exception;

import java.io.File;
import java.io.FileNotFoundException;

import java.util.Scanner;

public class Exception_04 {
	public static void main(String[] args) {

		try {
			method();
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}

		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public static void method() throws FileNotFoundException {
		int a = 10, b = 5, c;

		c = a / b;
		System.out.println("The value of C: " + c);

		int d[] = new int[2];
		d[0] = d[1] = 10;
		// int e=d[2];

		Scanner sc = new Scanner(new File("File.txt"));

	}

}
