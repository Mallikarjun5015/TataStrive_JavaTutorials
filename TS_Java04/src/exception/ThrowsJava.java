package exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ThrowsJava {

	public static void main(String[] args) {
		try {
			methodA();
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			System.out.println("Exception handled in main method..");
		}
	}
	
	public static void methodA() throws FileNotFoundException {
		methodB();
	}
	
	public static void methodB() throws FileNotFoundException {
		methodC();
	}
	
	public static void methodC() throws FileNotFoundException {
		methodD();
	}
	
	public static void methodD() throws FileNotFoundException {
		Scanner sc = new Scanner(new File("file01.txt"));
	}

}
