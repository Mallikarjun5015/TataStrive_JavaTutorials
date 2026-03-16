package functionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

class Printer{
	
	Printer(){
		System.out.println("Printer class construtor invoked..");
	}
	
	public void printNames(String name) {
		System.out.println("Name printed is: "+name);
	}
}



public class MethodReference {
	
	public static void printNum(int num) {
		System.out.println("Num is :"+num/2);
		
	}

	public static void printName(String names) {
		System.out.println("Name is :"+names);
	}

	public static void main(String[] args) {
		
		// 01. Static method..
		String [] names = {"Dinga", "Dingi", "Gunda", "Gundi"};
		Arrays.stream(names).forEach(MethodReference::printName);
		
		List<Integer> list = Arrays.asList(20,40,60,80);
		list.forEach(MethodReference::printNum);
		
		// 02. Instance method
		List<String> name = Arrays.asList("Manu", "Hanu", "Sunu", "Kanu");
		Printer p = new Printer();
		name.forEach(p::printNames);
		
		// 03. Arbitory object
		name.stream().map(String::toUpperCase).forEach(System.out::println);
		
		// 04. Constructor
		Supplier<Printer> supplier = Printer::new;
		supplier.get();
	}
	
	
	

}
