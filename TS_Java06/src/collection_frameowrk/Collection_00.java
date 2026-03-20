package collection_frameowrk;

import java.util.ArrayList;
import java.util.List;

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
		
	}

}
