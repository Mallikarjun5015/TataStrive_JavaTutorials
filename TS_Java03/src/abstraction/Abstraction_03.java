package abstraction;

abstract class Animal {
	
	String name;
	String color;

	public Animal(String name, String color) {
		super();
		this.name = name;
		this.color = color;
	}

	abstract void bird01();

	abstract void bird02(String name, String color, int age);

	void dog(String name, String breed, String color) {
		System.out.println("Name : " + name + " Breed : " + breed + " Color : " + color);
	}

}

class Animal01 extends Animal {

	public Animal01(String name, String color) {
		super(name, color);
	}

	@Override
	void bird01() {

		System.out.println("Bird 01 Name :"+name+" color : "+color);
	}

	@Override
	void bird02(String name, String color, int age) {

		System.out.println("Bird 01 Name :"+name+" color : "+color+" age : "+age);
	}

}

public class Abstraction_03 {

	public static void main(String[] args) {
		
		Animal01 a = new Animal01("Duck","White");
		a.bird01();
		
		a.bird02("Pecock", "Purple", 10);
		
		a.dog("Charlieee", "retriver", "Golden");

	}

}
