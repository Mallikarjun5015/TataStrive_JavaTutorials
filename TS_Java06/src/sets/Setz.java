package sets;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Setz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Set<String> s = new  HashSet<String>();
	        s.add("B");
	        s.add("B");
	        s.add("C");
	        s.add("A");
	        s.add("D");
	        s.add("E");

	        System.out.println(s);
	        
	        String ss = "D";

	        System.out.println("Contains " + s + " " + s.contains(ss));
	        
	        System.out.println("Is empty? "+s.isEmpty());
	        
	        System.out.println("Size ? "+s.size());
	        
	        s.remove("B");
	        System.out.println("After removing element " + s);
	        
	        for (String value : s)

	            System.out.print(value + ", ");
	        
	        System.out.println();
	        
	        Object[] arr = s.toArray();
	        
	        for (Object object : arr) {
	        	System.out.print(object+" ");
			}
	        
	        s.clear();
	        
	        System.out.println("\nAfter clearing "+s);
	        
	        Set<String> s1 = new TreeSet<String>(); 

			s1.add("A"); 
			s1.add("B"); 
			s1.add("C"); 
			 
			System.out.println("Initial Set: " + s1); 

			Set<String> s2 = new TreeSet<String>(); 

			s2.add("D"); 
			s2.add("E"); 

			s1.addAll(s2); 

			System.out.println("Final Set: " + s1); 

	}

}
