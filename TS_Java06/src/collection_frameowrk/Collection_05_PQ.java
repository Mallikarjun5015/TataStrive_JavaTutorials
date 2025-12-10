package collection_frameowrk;

import java.util.PriorityQueue;

public class Collection_05_PQ {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> name = new PriorityQueue<Integer>();
		
		name.offer(20);
		name.offer(10);
		
		name.offer(25);
		name.offer(15);
		name.offer(30);
		name.offer(5);
		
		System.out.println(name); // 5,15, 10, 25,20, 30
		
		//name.remove();
		
		//System.out.println(name);
		
		

	}

}
