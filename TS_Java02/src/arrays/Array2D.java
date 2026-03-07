package arrays;

public class Array2D {

	public static void main(String[] args) {
		
		int m = 3;
		int n = 3;
		
		int arr[][]= new int[m][n];
		
		int el = 1;
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j]=el;
				el++;
			}
		}
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
