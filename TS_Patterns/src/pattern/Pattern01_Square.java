package pattern;

import java.util.Scanner;

public class Pattern01_Square {

	public static void main(String[] args) {
		
		int row = 5;
		
		System.out.println("Square Hollow Pattern \n");
		
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= row; j++) {
				if (i == 1 || j == 1 || 
					i == row || j ==row) {
					System.out.print("*" + " ");
				} else {
					System.out.print(" " + " ");
				}
			}
			System.out.println();
		}
		

		for (int i = 0; i <= row; i++) {
			for (int j = 0; j <= 6; j++) {
				if (i == 1 && j % 3 == 0 || 
					i == 0 && j % 3 != 0 || 
					i - j == 2 || 
					i + j == 8) {
					System.out.print("*" + " ");
				} else {
					System.out.print(" " + " ");
				}
			}
			System.out.println();
		}

		System.out.println();
		
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= i; j++) {
				if (j == 1 || i == j || i == row) {
					System.out.print("*" + " ");
				} else {
					System.out.print(" " + " ");
				}
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i = 1; i<=row;i++){
          for(int j=1; j<=i;j++){
              System.out.print("* ");
          }
          System.out.println();
      }
		
		System.out.println();
		
		for(int i = 1; i<=row;i++){
          for(int j=1; j<=row;j++){
              System.out.print("* ");

          }
          System.out.println();
      }
		
		System.out.println();

		for (int i = 1; i <= row; i++) {
			if (i % 2 == 0) {
				for (int j = row; j >= 1; j--) {
					System.out.print(j + " ");
				}
			} else {
				for (int j = 1; j <= row; j++) {
					System.out.print(j + " ");
				}
			}
			System.out.println();
		}

	}
}
