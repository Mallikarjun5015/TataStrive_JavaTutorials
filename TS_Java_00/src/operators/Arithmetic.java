package operators;

import java.util.Scanner;

public class Arithmetic {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of a: ");
        int a= sc.nextInt();

        System.out.println("Enter the value of b: ");
        int b= sc.nextInt();

        System.out.println("Addition "+(a+b));
        System.out.println("Subtraction "+(a-b));
        System.out.println("Multiplication "+a*b);
        System.out.println("Division "+a/b);
        System.out.println("Modules "+(b%a));
        System.out.println("post increment "+a++);
        System.out.println("pre increment "+(++a));
        System.out.println("post decrement "+(b--));
        System.out.println("pre decrement "+--b);
	}

}
