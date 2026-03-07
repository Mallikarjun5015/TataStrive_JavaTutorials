package conditional_Probs;

import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        //a%3==0 && a%5==0
        if(a%3==0 ) {
        	System.out.println("Fizz");
        }else if(a%5==0){
        	System.out.println("Buzz");
        }else
        	
        	
        	//here 
        	if(a%3==0 && a%5==0){
        		
        		 if(a%3==0 ) {
        	        	System.out.println("Fizz");
        	        }else if(){
        	        	System.out.println("Buzz");
        	        }
        	System.out.println("FizzBuzz");
        }
        else {
        	System.out.println(7);
        }
	}

}
