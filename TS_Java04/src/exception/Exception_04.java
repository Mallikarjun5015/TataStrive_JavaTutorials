package exception;

import java.io.File;
import java.io.FileNotFoundException;

import java.util.Scanner;

public class Exception_04 {
	public static void main(String[] args) throws InterruptedException {
		
		//Thread.sleep(10000);

		try {
			method();
		} catch (ArithmeticException  | ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}

		 catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("General Exception catch block");
		}

	}

	public static void method() throws FileNotFoundException {
		int a = 10, b = 5, c;

		c = a / b;
		System.out.println("The value of C: " + c);

		int d[] = new int[2];
		d[0] = d[1] = 10;
		// int e=d[2];
		
		int ab = Integer.parseInt("ABC");

		Scanner sc = new Scanner(new File("File.txt"));

	}

}
