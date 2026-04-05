package map;

import java.util.Map;

public class HashMap {

	public static void main(String[] args) {

		Map<String, Integer> m = new java.util.HashMap<String, Integer>();

		m.put("Gunda", 1);
		m.put("Gundi", 2);
		m.put("Manga", 3);

		Map<String, Integer> hm1 = new java.util.HashMap<String, Integer>();

		
		Map<String, Integer> hm2 = new java.util.HashMap<String, Integer>();

		hm1.put("Pinda", 1);
		hm1.put("RCB", 2);
		hm1.put("Virat", 3);

		
		hm2.put("Maka", 1);
		hm2.put("For", 2);
		hm2.put("waste", 3);

		System.out.println(hm1);
		System.out.println(hm2);

	}

}
