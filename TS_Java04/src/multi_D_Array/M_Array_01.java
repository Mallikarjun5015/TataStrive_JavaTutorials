package multi_D_Array;

public class M_Array_01 {

	public static void main(String[] args) {

		int array [][]= { { 14, 25, 35 }, { 65, 76, 76 }, { 45, 98, 96 } };
		
		 for (int i = 0; i < array.length ;i++) { // i => rows
	         for (int j = 0; j < array.length ; j++) { //j => columns
	            System.out.print(array[i][j] + " ");
	         }
	         System.out.println();
	}
	}

}
