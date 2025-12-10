package polymorphism;

class Parent {

	public void mobileDetails(String name, String model, String ram, String rom, String processor) {

		System.out.println("Parent Mobile name : " + name + "\nModel name: " + model + "\nRAM details : " + ram
				+ "\nROM Details : " + rom + "\nProcessor Details :  " + processor+"\n");

	}
}

class Child extends Parent {

	@Override
	public void mobileDetails(String name, String model, String ram, String rom, String processor) {

		super.mobileDetails("Samsung", "A14", "6GB", "128GB", "Exynos XYZ");
		
		System.out.println("Child Mobile name : " + name + "\nModel name: " + model + "\nRAM details : " + ram
				+ "\nROM Details : " + rom + "\nProcessor Details :  " + processor);

	}

	public void laptop_details(String name, String model, String graphicscard) {

		System.out.println("Laptop Device name:"+name+"\nModel Name : "+model+"\nGraphics Card : " +graphicscard);
	}
}

public class Polymorphism_04_Override {

	public static void main(String[] args) {

		Child c = new Child();
		c.mobileDetails("Vivo T3 Pro", "T3 Pro 5G", "8GB", "128GB", "Qualcomm Snapdragon 7 Gen 3");
		
		System.out.println();
		
		c.laptop_details("DELL", "Vostro 3420", "Intel Arc Graphics");

	}

}
