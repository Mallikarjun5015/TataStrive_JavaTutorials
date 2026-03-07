package arrays;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of rows");
		int m = sc.nextInt();

		System.out.println("Enter number of cols");
		int n = sc.nextInt();

		int arr[][] = new int[m][n];

		System.out.println("Enter Array Elements.. ");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		int even=0, odd=0;
		System.out.println("Array Elements are..");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(arr[i][j] + " ");
				if(arr[i][j]%2==0) {
					even++;
				}else {
					odd++;
				}
			}
			System.out.println();
		}
		
		System.out.println("Even "+even+" and odd "+odd);
	}
}
