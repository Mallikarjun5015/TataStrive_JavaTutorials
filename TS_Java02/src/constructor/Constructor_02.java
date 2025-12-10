package constructor;

import java.util.Scanner;

class Operation{
	public int addition(int a, int b) {
		return a+b;
	}
	
	public int substraction(int a,int b) {
		return a-b;
	}
	
	public int multiplication(int a, int b) {
		return a*b;	
	}
	
	public int devison(int a, int b) {
		return a/b;	
	}
	
}

public class Constructor_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Two numbers...");
		int num1= sc.nextInt();
		int num2= sc.nextInt();
		
		Operation op = new Operation();
		
		System.out.println("The Sum is: "+op.addition(num1, num2));
		System.out.println("The Result is :"+op.substraction(num1,num2));
		System.out.println("The Multiplication Result :"+op.multiplication(num1, num2));
		System.out.println("The devison is :"+op.devison(num1, num2));
	}

}
