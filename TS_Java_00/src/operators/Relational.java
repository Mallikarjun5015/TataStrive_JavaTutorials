package operators;

import java.util.Scanner;

public class Relational {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

      System.out.println("Enter the value of a: ");
      int a= sc.nextInt();

      System.out.println("Enter the value of b: ");
      int b= sc.nextInt();

      System.out.println(a==b);
      System.out.println(a!=b);
      System.out.println(a>b);
      System.out.println(a<b);
      System.out.println(a>=b);
      System.out.println(a<=b);

      System.out.println("Enter the value of c : ");
      int c= sc.nextInt();

	}

}
