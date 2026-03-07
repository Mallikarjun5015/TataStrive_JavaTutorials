package arrays;

import java.util.Iterator;

public class Array {

	public static void main(String[] args) {
		
		int [] num = {1,4,2,6,8,9};
		
		for (int i : num) {
			System.out.println("NUmber: "+i);
		}
		
		String[] name = {"Dinga","Dingi","Gunda","Gundi"};
		
//		for (String string : name) {
//			System.out.println("Names: "+name);
//		}
		
		for (int i = 0; i < name.length; i++) {
			System.out.println("Names: "+name[i]);
		}
		
		System.out.println("Name at first is "+name[0]);
		name[0]="Manga";
		System.out.println("Name at first is "+name[0]);
		
		System.out.println(name.length+" this is size of array ");
		

	}

}
