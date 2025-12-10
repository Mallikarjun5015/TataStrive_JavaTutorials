package multi_D_Array;

import java.util.Scanner;

public class M_Array_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of rows and cols..");
		int rows = sc.nextInt();
		int cols = sc.nextInt();
		
		int arr [][]= new int[rows][cols];
		
		System.out.println("Enter the "+rows+"*"+cols+" Arrays elements..");
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				 arr[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("The "+rows+"*"+cols+" Arrays elemnts are...");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		

	}

}
