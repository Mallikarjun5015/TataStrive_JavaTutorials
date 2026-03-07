package arrays;

public class Jagged {

	public static void main(String[] args) {

		int r = 5;
		int arr[][] = new int[r][];
		
//		int[][] arr_name = {
//                {10, 20, 30 ,40},
//                {50, 60, 70, 80, 90, 100},
//                {110, 120}
//            };
//
//		arr[0] = new int[2];
//		arr[1] = new int[3];
		
		for (int i = 0; i < arr.length; i++)
			arr[i] = new int[i+1];

		int count = 0;

		for (int i = 0; i < arr.length; i++)
			for (int j = 0; j < arr[i].length; j++)
				arr[i][j] = count++;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++)
				System.out.print(arr[i][j] + " ");
			System.out.println();
		}
		
		
//		for (int i = 0; i < arr_name.length; i++) {
//			for (int j = 0; j < arr_name[i].length; j++)
//				System.out.print(arr_name[i][j] + " ");
//			System.out.println();
//		}
	}

}
