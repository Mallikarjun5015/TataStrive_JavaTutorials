package constructor;

import java.util.Scanner;

class Vehicle {

	String name;
	String register_no;
	double price;

	public Vehicle(String V_name, String V_register_no, double V_price) {

		name = V_name;
		register_no = V_register_no;
		price = V_price;
	}

	public void Vehicle_Details(String color) {
		System.out.println("The Vehicle details...!!");
		System.out.println("--------------------------");
		System.out.println("The Vehicle name  : " + name);
		System.out.println("The Register No.  : " + register_no);
		System.out.println("The Vehicle Price : " + price);
		System.out.println("The vehicle color : " + color);
	}

}

public class Constructor_00 {
	public static void main(String[] args) {

		new Vehicle("Hunter 350", "KA 32 M 5015", 255000.00).Vehicle_Details("White");

	}
}
