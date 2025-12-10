package inheritance;

class Car01 {
	String fuel_type;
	int seats;

	public Car01(String fuel_type, int seats) {
		super();
		this.fuel_type = fuel_type;
		this.seats = seats;
	}

	public void details() {

		System.out.println("Fuel Type is: " + fuel_type + " and seats capacity is: " + seats);
	}
}

class HyundaiCreta extends Car01 {

	String color;
	double price;
	String model;

	public HyundaiCreta(String fuel_type, int seats, String color, double price, String model) {
		super(fuel_type, seats);
		this.color = color;
		this.price = price;
		this.model = model;
	}

	public void carDetails() {

		System.out.println("The Car HyundaiCreta color: " + color + "\nCar price is : " + price + "\nModel name is : "
				+ model + "\nFuel Type is: " + fuel_type + "\nSeats capacity is: " + seats);
	}

}

class HyundaiVerna extends Car01 {

	String color;
	double price;
	String model;

	public HyundaiVerna(String fuel_type, int seats, String color, double price, String model) {
		super(fuel_type, seats);
		this.color = color;
		this.price = price;
		this.model = model;
	}

	public void carDetails() {

		System.out.println("The Car HyundaiVerna color: " + color + "\nCar price is : " + price + "\nModel name is : "
				+ model + "\nFuel Type is: " + fuel_type + "\nSeats capacity is: " + seats);

	}
}

public class Inheritance_07_Hierachical {

	public static void main(String[] args) {

		HyundaiCreta c1 = new HyundaiCreta("Desiel Engine", 5, "White", 1000000.00, "C1");
		c1.carDetails();

		System.out.println("--------------------------------------");

		HyundaiVerna c2 = new HyundaiVerna("Petrol Engine", 7, "Navy Blue", 800000.00, "V1");
		c2.carDetails();
	}

}
