package collection_frameowrk;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Test<String>{
	
	String name;
	
	Test(String name){
		this.name=name;
	}
	
	String getName() {return name;}
}

public class Collection_00 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("Dinga");
		list.add("Dingi");
		list.add("Gunda");
		list.add("Gundi");
		list.add("Manga");
		
		for(String name: list) {
			System.out.println("Name is: "+name);
		}
		
		System.out.println("Names are:"+list);
		
		Test<String> test = new Test<String>("Java");
		
		System.out.println("Get method: "+test.getName());
		
		System.out.println("Object reference: "+test.name);
		
		Iterator<String> it = list.iterator();
		
		while(it.hasNext()) {
			String name = it.next();
			System.out.print(name+" ");
		}
		
		
		
	}

}
