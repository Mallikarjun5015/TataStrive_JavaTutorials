package com.mallu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

@FunctionalInterface
interface VTU{
	void show();
}
public class Demo {
	
	public static void show1() {
		System.out.println("Functional Interface..!!");
	}
	
	public static void main(String[] args) {
		Demo d = new Demo();
		VTU v=Demo::show1;
		v.show();
		
//		List<String> list = new ArrayList<>();
//		list.add("Mallu");
//		list.add("Harshiii");
//		
//		//list.forEach(n->System.out.println(n));
//		list.forEach(System.out::println);
		
//		Predicate <Integer> p = n -> n%2==0;
//		System.out.println(p.test(4));
//		
//		Consumer<String> print = s -> System.out.println(s);
//		print.accept("Hello!"); // Prints "Hello!"
//		
//		Function<Integer, String> intToString = n -> "Number: " + n;
//		System.out.println(intToString.apply(10)); // Number: 10
//
//		Supplier<Double> randomValue = () -> Math.random();
//		System.out.println(randomValue.get()); // Prints a random number

//		Stream <Integer> p = Stream.of(21,27,13,4);
//		p.sorted().forEach(System.out::println);
//		
//		ArrayList<String> al = new ArrayList<>();
//		al.add("Mallu");
//		al.add("Harshiii");
//		al.add("Dumma");
//		Stream<String> a = al.stream();
//		a.distinct().forEach(System.out::println);
		
//		List<Integer> al = Arrays.asList(1,3,5,7,2,2,2,2,9,2,4,6,8);
//		al.stream().filter(k->k%2==0).distinct().forEach(System.out::println);
		
		
		
		

	}
}
