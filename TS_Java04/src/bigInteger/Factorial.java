package bigInteger;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {

	 static BigInteger factorial(int N)
	    {
	        
	        BigInteger f = new BigInteger("1");
	        
	        for (int i = 2; i <= N; i++)
	            f = f.multiply(BigInteger.valueOf(i));

	        return f;
	    }
	    public static void main(String args[]) throws Exception
	    {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter a number of which factorial uh want: ");
	        int N = sc.nextInt();
	        System.out.println(factorial(N));
	    }
}
