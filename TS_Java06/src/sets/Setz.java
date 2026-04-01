package sets;

import java.util.HashSet;
import java.util.Set;

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
	        
	        String s1 = "D";

	        System.out.println("Contains " + s + " " + s.contains(s1));
	        
	        s.remove("B");
	        System.out.println("After removing element " + s);
	        
	        for (String value : s)

	            System.out.print(value + ", ");
	        
	        System.out.println();

	}

}
