package loops;

import java.util.Scanner;

public class SwitchCalsci {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the numbers: ");
		
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		
		System.out.println("Enter the operator (+,-,*,/)..");
		char c = sc.next().charAt(0);
		
		double result=0;
		
		switch (c) {
		case '+':
			result = num1+num2;
			break;
		case '-':
			result = num1- num2;
			break;
		case '*':
			result = num1* num2;
			break;
		case '/':
			result = num1 /num2;
			break;
		case '%':
			result = num1 %num2;
		default:
			System.out.println("Invalid Operator..!!");
			break;
		}
		System.out.println(num1+" "+c+" "+num2+" = "+result);
	}

}

 