package polymorphism;

class MethodOverloading {

	public void show() {

	}

	public void show(int a) {

		System.out.println("This is Integer " + a);
	}

	public void show(int a, int b) {

		System.out.println("This is sum of " + a + " & " + b + " is " + (a + b));
	}

	public void show(float a, int b) {

		System.out.println("This is addition of float and int value : "+(a+b));
	}
}

public class Polymorphism_01_Compile {

	public static void main(String[] args) {

		MethodOverloading m = new MethodOverloading();
		m.show();
		m.show(4);
		m.show(15, 5);
		m.show(2.3f, 4);
	}

}
