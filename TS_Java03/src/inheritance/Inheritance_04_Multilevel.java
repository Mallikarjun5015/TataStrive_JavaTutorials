package inheritance;

class Vehicle {
	String color;

	public Vehicle(String color) {
		super();
		this.color = color;
	}

	public void demo01() {
		System.out.println("The vehicle color : " + color);
	}
}

class Car extends Vehicle {
	String registeNumber;
	double price;

	public Car(String color, String registeNumber, double price) {
		super(color);
		this.registeNumber = registeNumber;
		this.price = price;
	}

	public void demo02() {
		System.out.println("The Register no.  : " + registeNumber + "\nThe vehicle Price : " + price);
	}
}

class Bike extends Car {
	String name;

	public Bike(String color, String registeNumber, double price, String name) {
		super(color, registeNumber, price);
		this.name = name;
	}

	public void demo03() {
		System.out.println("The Vehicle Name  : " + name + "\nThe Register no.  : " + registeNumber
				+ "\nThe vehicle Price : " + price + "\nThe vehicle color : " + color);
	}
}

public class Inheritance_04_Multilevel {
	public static void main(String[] args) {
		Bike b = new Bike("White", "KA 01 M 5015", 450000.00, "BMW");
		b.demo03();
	}

}
