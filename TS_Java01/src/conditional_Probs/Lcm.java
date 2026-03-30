package conditional_Probs;

import java.util.Scanner;

public class Lcm {

	public static int lcm(int a, int b) {
       int ans = 1;
		
		for(int i = a; i<=a*b; i+=a) {
			if(i%b==0) {
				ans=i;
				break;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		  
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		System.out.println("LCM of "+a+" and "+b+" is: "+lcm(a,b));
	}

}
