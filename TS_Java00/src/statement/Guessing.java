package statement;

import java.util.Scanner;

public class Guessing {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int number = 1+(int)(100*Math.random());
		
		int limit = 5;
		
		System.out.println("Enter a guessed number between 1 to 100 and your limits are 5...");
		System.out.println(number);
		
		for(int i =1; i<=limit; i++) {
			
			int guess = sc.nextInt();
			
			if(guess==number) {
				
				System.out.println("Wow!! Your guess is correct...");
				sc.close();
				return;						
			}
			else if(guess < number ) {
				System.out.println("Your guess is lesser than number");
			}
			else {
				System.out.println("Your guess is greater than the number");
			}
		}
		
		System.out.println("Your guessing limits are over!!");
		sc.close();
	}

}
