package arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Arrayss {

	public static void main(String[] args) {
		
//		String [] name={"Dinga","Dingi", "Gunda","Gundi", "Manga"};
//		
//		List<String> list = Arrays.asList(name);
//		
//		System.out.println(list);
		
		final int arr[]= {1,9,2,8,3,7,4,5,6,11};
		
		Integer ar[]= {1,9,2,8,3,7,4,5,6,11};
		
		
		//Arrays.sort(ar, Collections.reverseOrder());
		
		Arrays.sort(arr);
		arr[0]=100;
		
		
		System.out.println(Arrays.toString(arr));
		
//		for (int i : arr) {
//			System.out.print(arr[i-1]+" ");
//		}
		
//		System.out.println("\nFound at "+Arrays.binarySearch(arr,2,6,3));
		
//		int ar[]= {1,2,3,4,5};
//		
//		System.out.println(Arrays.compare(arr, ar)+" compare ");
		
//		int intArr[] = { 10, 15, 22, 35 };
//
//        
//        int intArr1[] = { 10, 15, 22, 35 };
//
//        
//        System.out.println("Integer Arrays on comparison: "+ Arrays.compare(intArr, intArr1));
	}

}
