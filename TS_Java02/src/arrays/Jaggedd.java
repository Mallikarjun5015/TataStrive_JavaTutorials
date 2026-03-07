package arrays;

import java.util.Scanner;

public class Jaggedd {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter sub array rows");
		int r = sc.nextInt();
		
		
		int arr[][] = new int[r][];
		
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter sub array "+(i+1)+" col size for");
			int m = sc.nextInt();
			arr[i] = new int[m];
		}


		System.out.println("Enter array elements");
		for (int i = 0; i < arr.length; i++)
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
				}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++)
				System.out.print(arr[i][j] + " ");
			System.out.println();
		}
		
	}

}
