package multi_D_Array;

import java.util.Scanner;

public class M_Array_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of rows and cols..");
		int rows = sc.nextInt();
		int cols = sc.nextInt();

		int arr1[][] = new int[rows][cols];
		int arr2[][] = new int[rows][cols];
		
		int res[][] = new int[rows][cols];
		
		

		System.out.println("Enter the " + rows + "*" + cols + " Arrays elements for Matrix 01 ..");

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				arr1[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Enter the " + rows + "*" + cols + " Arrays elements for Matrix 02 ..");

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				arr2[i][j] = sc.nextInt();
			}
		}
		
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				res [i][j]= arr1[i][j]+arr2[i][j];
			}
		}
		

		System.out.println("The " + rows + "*" + cols + " Resultant Matrix elemnts are...");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(res[i][j] + " ");
			}
			System.out.println();
		}

	}

}
