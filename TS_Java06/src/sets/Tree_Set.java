package sets;

import java.util.Set;
import java.util.TreeSet;

public class Tree_Set {

	public static void main(String[] args) {

		TreeSet<Integer> num = new TreeSet<Integer>();

		num.add(15);
		num.add(25);
		num.add(5);
		num.add(10);
		num.add(20);
		System.out.println(num);

		num.add(0);
		num.add(30);
		System.out.println(num);

		num.remove(20);
		System.out.println(num);
		System.out.println(num.first() + " first");
		System.out.println(num.last() + " last");
		
		num.pollFirst();
		System.out.println("After removing first "+num);
		
		num.pollLast();
		System.out.println("After removing last "+num);

		System.out.println(num.ceiling(18) + " > or = : ceiling");
		System.out.println(num.floor(18) + " < or == : floor");

		System.out.println(num.higher(18) + " > : higher");
		System.out.println(num.lower(18) + " < : lower");

		Set<String> ts = new TreeSet<>();

		ts.add("Dinga");
		ts.add("Subba");
		ts.add("Gunda");
		ts.add("Munda");
		ts.add("Banda");
		ts.add("Subba");
		// ts.add(null);

		System.out.println(ts);

		String s = "Munda";

		System.out.println("The Treeset contains " + s + " ? " + ts.contains(s));
		
		for (String string : ts) {
			System.out.print(string+" ");
		}
		
	}

}
