package sets;

import java.util.LinkedHashSet;

public class Linked_hashSet {

	public static void main(String[] args) {
		
		LinkedHashSet<Integer> num = new LinkedHashSet<Integer>();
		
		num.add(15);
		num.add(25);
		num.add(5);
		num.add(10);
		num.add(20);
		System.out.println(num);
		
		num.add(30);
		System.out.println(num);
		
		num.addFirst(0);
		num.addLast(40);
		System.out.println(num);
		
		num.remove(5);
		System.out.println(num);
		
		System.out.println(num.getFirst()+" first");
		System.out.println(num.getLast()+" last");
		
		

	}

}
