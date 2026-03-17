package exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileNotFound {

	public static void main(String[] args) {
		
		int [] num = new int[10];
		
		try {
			Scanner sc = new Scanner(new File("file01.txt"));
			System.out.println("File found successfully..!!");
			num[11]=10;
		} catch (FileNotFoundException e) {
			System.out.println("Fine not found..");
			System.out.println(e);
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
		catch (IndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		
		finally {
			System.out.println("Program Execution continues..");
		}

	}

}
