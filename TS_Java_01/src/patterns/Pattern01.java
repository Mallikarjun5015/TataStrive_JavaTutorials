package patterns;

public class Pattern01 {
	public static void main(String[] args) {
		// Loops inside the loops: Pattern printing
//            Triangle

//            *
//            * *
//            * * *
//            * * * *

//            for(int i = 1; i<=4;i++){
//                for(int j=1; j<=i;j++){
//                    System.out.print("* ");
//                }
//                System.out.println();
//            }

//          * * * * *
//          * * * *
//          * * *
//          * *
//          *

//            for(int i = 1; i<=5;i++){
//                for(int j=5; j>=i;j--){
//                    System.out.print("* ");
//                }
//                System.out.println();
//            }

//            1
//            2 3
//            4 5 6
//            7 8 9 10

//            int n=1;
//            for(int i = 1; i<=4;i++){
//                for(int j=1; j<=i;j++){
//                    System.out.print(n+" ");
//                    n++;
//                }
//                System.out.println();
//            }

//* * * *
//* * * *
//* * * *
//* * * *

//            for(int i = 1; i<=4;i++){
//                for(int j=1; j<=4;j++){
//                    System.out.print("* ");
//
//                }
//                System.out.println();
//            }

//* * * * *
//*       *
//*       *
//*       *
//* * * * *

//            int rows=5;
//            for (int i=1; i<=rows;i++)
//            {
//                for(int j=1;j<=rows;j++)
//                {
//                    if(i==1 || j==1 || i== rows|| j==rows)
//                    {
//                        System.out.print("*"+" ");
//                    }
//                    else
//                    {
//                        System.out.print(" "+" ");
//                    }
//                }
//                System.out.println();
//            }

//        *
//      * * *
//    * * * * *
//  * * * * * * *

//            int rows = 5;
//            for (int i = 1; i <= rows; i++) {
//                for (int j = 1; j <= (rows - i); j++) {
//                    System.out.print(" " + " ");
//
//                }
//                for (int j = 1; j <= i; j++) {
//                    System.out.print("*" + " ");
//                }
//                for (int j = 1; j <= (i - 1); j++) {
//                    System.out.print("*" + " ");
//                }
//                System.out.println();
//            }

//            int rows = 5;
//            for (int i = 5; i >=1; i--)
//            {
//                for (int j = 5; j >i; j--)
//                {
//                    System.out.print(" "+" ");
//                }
//                for (int k = 1; k <= 2*i-1; k++) {
//                    System.out.print("*"+" ");
//                }
//                System.out.println();
//            }

//*
//* *
//*   *
//*     *
//*       *
//* * * * * *
//
//            int rows=6;
//            for (int i=1; i<=rows;i++)
//            {
//                for(int j=1;j<=i;j++)
//                {
//                    if( j==1 || i==j || i==rows)
//                    {
//                        System.out.print("*"+" ");
//                    }
//                    else
//                    {
//                        System.out.print(" "+" ");
//                    }
//                }
//                System.out.println();
//            }

//* * * * * *
//*       *
//*     *
//*   *
//* *
//*

//            int rows=6;
//            for (int i=rows; i>=1;i--)
//            {
//                for(int j=1;j<=i;j++)
//                {
//                    if( j==1 || i==j || i==rows)
//                    {
//                        System.out.print("*"+" ");
//                    }
//                    else
//                    {
//                        System.out.print(" "+" ");
//                    }
//                }
//                System.out.println();
//            }

//        *
//      * *
//    * * *
//  * * * *
//* * * * *

//            int n=5;
//            for (int i = 1; i<=n; i++)
//            {
//                for (int j = n; j >i; j--)
//                {
//                    System.out.print(" "+" ");
//                }
//                for (int k = 1; k <= i; k++) {
//                    System.out.print("*"+" ");
//                }
//                System.out.println();
//            }

//* * * * *
//  * * * *
//    * * *
//      * *
//        *

//            int n=5;
//            for (int i = n; i>=1; i--)
//            {
//                for (int j = n; j >i; j--)
//                {
//                    System.out.print(" "+" ");
//                }
//                for (int k = 1; k <= i; k++) {
//                    System.out.print("*"+" ");
//                }
//                System.out.println();
//            }

//            int n=5;
//            for (int i = 1; i<=n; i++)
//            {
//                for (int j = n; j >i; j--)
//                {
//                    System.out.print(" "+" ");
//                }
//                for (int k = 1; k <= i; k++) {
//                    if(i==n || k==i || k==1)
//                        System.out.print("*"+" ");
//                    else System.out.print(" "+" ");
//                }
//                System.out.println();
//            }

//  * *   * *
//*     *     *
//*           *
//  *       *
//    *   *
//      *

		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j <= 6; j++) {
				if (i == 1 && j % 3 == 0 || i == 0 && j % 3 != 0 || i - j == 2 || i + j == 8) {
					System.out.print("*" + " ");
				} else {
					System.out.print(" " + " ");
				}
			}
			System.out.println();
		}
	}
}
