package sets;

import java.util.Iterator;
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

		System.out.println(num.getFirst() + " first");
		System.out.println(num.getLast() + " last");

		LinkedHashSet<String> set = new LinkedHashSet<>();
		set.add("Apple");
		set.add("Banana");
		set.add("Cherry");
		set.add("Apple");
		System.out.println("" + set);
		
		set.add("Grapes");
		set.add("Mango");
		
		System.out.println("" + set);
		
		System.out.println("The size of the set is: " + set.size());
		
		set.remove("Mango");
		
		System.out.println("The size of the set is: " + set.size());
		
		System.out.println("After removing element " + set);
		
		System.out.println(set.remove("Ananas"));
		
		Iterator<String> ir = set.iterator();
		
		while(ir.hasNext()) {
			System.out.print(ir.next()+" ");
		}
		
		System.out.println();
		
		for (String string : set) {
			System.out.print(string+" ");
		}
		
		Object[] arr = set.toArray();
		System.out.println();
		
		
		for (Object object : arr) {
			System.out.print(object+" ");
		}
		
		set.clear();
		System.out.println("\n" + set);
		
		
		

	}

}
