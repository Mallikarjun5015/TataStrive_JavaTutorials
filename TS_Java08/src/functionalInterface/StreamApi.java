package functionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamApi {

	public static void main(String[] args) {
		
		List<Integer> num = Arrays.asList(1,5,2,7,9,3,4,6,8,12);
		
//		Stream<Integer> s1 = num.stream();
//		
//		s1.forEach(System.out::print);
		
		//System.out.println("Soreted order..");
		//num.stream().sorted().forEach(System.out::print);
		
//		Predicate<Integer> p = new Predicate<Integer>() {
//			
//			@Override
//			public boolean test(Integer n) {
//				
//				return n%2==0;
//			}
//		};
		
		//Predicate<Integer> p = n-> n%2==0;
		//System.out.println("\nEven numbers: ");
		//num.stream().filter(n->n%2==0).forEach(System.out::println);
		
		Stream<Integer> s2 = num.stream();
		
		Function<Integer, Integer> f = n->n*2;
		//s2.map(f).forEach(System.out::println);
		
//		BinaryOperator<Integer> b = new BinaryOperator<Integer>() {
//			
//			@Override
//			public Integer apply(Integer a, Integer b) {
//				return (a+b);
//			}
//		};
		
		BinaryOperator<Integer> binary = (a,b)-> (a+b);
		
		Stream<Integer> s3 = num.stream();
		
		int result = s3.reduce(0, binary);
		int reduce = num.stream().reduce(0, (a,b)-> (a+b));
		System.out.println("The result is: "+result+" and the reduced output is: "+reduce);
		
		int ans = num.stream()
		.filter(n->n%2==0)
		.map(n->n*2)
		.reduce(0, (a,b)->(a+b));
		
		System.out.println("The finale one: "+ans);
		
	}

}
