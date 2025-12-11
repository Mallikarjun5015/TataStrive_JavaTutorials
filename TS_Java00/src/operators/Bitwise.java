package operators;

import java.util.Scanner;

public class Bitwise {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of a: ");
        int a= sc.nextInt();

        System.out.println("Enter the value of b: ");
        int b= sc.nextInt();

        System.out.println(a&b);
        System.out.println(a|b);
        System.out.println(a^b);
        System.out.println(~a); // -(a+1)
        System.out.println(a<<2); // a* 2^n
        System.out.println(a>>2); // a / 2^n

	}

}
