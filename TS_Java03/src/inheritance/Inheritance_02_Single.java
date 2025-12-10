package inheritance;

class Cat {
	String name;
	String color;

	public Cat(String name, String color) {
		super();
		this.name = name;
		this.color = color;
	}

	public void demo01() {
		System.out.println(name + " " + color);
	}
}

class BabyCat extends Cat {
	int age;

	public BabyCat(String name, String color, int age) {
		super(name, color);
		this.age = age;
	}

	public void demo02() {
		System.out.println("Name : " + name + "\nColor: " + color + "\nAge: " + age);
	}
}

public class Inheritance_02_Single {
	public static void main(String[] args) {

		new BabyCat("Simba", "White", 8).demo02();
	}
}
