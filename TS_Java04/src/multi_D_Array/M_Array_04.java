package multi_D_Array;

import java.util.Scanner;

public class M_Array_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of rows and cols for Matrix 01..");
		int r1 = sc.nextInt();
		int c1 = sc.nextInt();

		System.out.println("Enter the number of rows and cols for Matrix 01..");
		int r2 = sc.nextInt();
		int c2 = sc.nextInt();

		if (c1 != r2) {
		
			System.out.println("Matrix multiplication NOT possible!");
			System.out.println("Columns of Matrix 01 must be same as Rows of Matrix 02");
			System.exit(1); 
		}

		int arr1[][] = new int[r1][c1];
		int arr2[][] = new int[r2][c2];

		int res[][] = new int[r1][c2];

		System.out.println("Enter the " + r1 + "*" + c1 + " Arrays elements for Matrix 01 ..");

		for (int i = 0; i < r1; i++) {
			for (int j = 0; j < c1; j++) {
				arr1[i][j] = sc.nextInt();
			}
		}

		System.out.println("Enter the " + r2 + "*" + c2 + " Arrays elements for Matrix 02 ..");

		for (int i = 0; i < r2; i++) {
			for (int j = 0; j < c2; j++) {
				arr2[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < r1; i++) {
			for (int j = 0; j < c2; j++) {
				res[i][j] = 0;
				for (int k = 0; k < c1; k++) {
					res[i][j] += arr1[i][k] * arr2[k][j];
				}
			}
		}

		System.out.println("The " + r1 + "*" + c2 + " Resultant Matrix elemnts are...");
		for (int i = 0; i < r1; i++) {
			for (int j = 0; j < c2; j++) {

				System.out.print(res[i][j] + " ");
			}
			System.out.println();
		}
	}

}
