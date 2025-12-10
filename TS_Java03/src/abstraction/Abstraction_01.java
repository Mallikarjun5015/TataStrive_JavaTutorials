package abstraction;

abstract class Demo {

	int a;
	int b;

	public Demo(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	public abstract void display();

	abstract public void show();

	public void demo() {
		System.out.println("Normal Method...");
	}
}

class Demo_child extends Demo {

	public Demo_child(int a, int b) {
		super(a, b);

	}

	public int sum() {
		return a + b;
	}

	@Override
	public void display() {

		System.out.println("Abstract method implememntation..");
	}

	@Override
	public void show() {

		System.out.println("Abstarcted method...");
	}
}

public class Abstraction_01 {

	public static void main(String[] args) {

		Demo_child d = new Demo_child(1, 4);

		System.out.println("The sum is : " + d.sum());
		d.display();
		d.show();
		d.demo();
	}

}
