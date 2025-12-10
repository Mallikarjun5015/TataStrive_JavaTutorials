package com.mallu;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

interface A {
	void show(int i);
}

//class Ab implements A{
//
//	@Override
//	public void show() {
//		System.out.println("hello"+i);		
//	}
//}
public class LambdaDemo {

	public static void main(String[] args) {
//		A obj = new A() { // Anonymous Inner Class
//			public void show() {
//				System.out.println("hello"+i);
//			}
//		};
		
//		A obj=(int i)->System.out.println("hello "+i);
//		A obj=(i)->System.out.println("hello "+i);
		A obj=i->System.out.println("hello "+i);// Consumer INTERFACE

		obj.show(2);
		
		
		List<Integer> values = Arrays.asList(2,3,4,5,6);
		values.forEach(i->System.out.println(i));
		
		Stream<Integer> s = values.stream();
		s.forEach(System.out::println);
	}
}
