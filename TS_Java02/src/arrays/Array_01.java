package arrays;

public class Array_01 {

	public static void sum(int [] arr) {
		
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			sum+=arr[i];
		}
		
		System.out.println("Sum is "+sum);
	}
	
	public static int[] array() {
		return new int[] {1,2,3,4,5,};
	}
	
	
	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,6,7,8,9};
		
		sum(arr);
		
		int[] ar = array();
		
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
		
	}

}
