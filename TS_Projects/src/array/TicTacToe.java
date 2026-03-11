package array;

import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) {
		
		 int a = 5, b = 10, c = 3;
	        
	        int largest = (a >= b && a >= c) ? a : ((b >= c) ? b : c);
	        System.out.println(largest);
	    }
		
}
