package methods;

public class CallStack {

	private static void D() {
		System.out.println("Inside D");
	}

	private static void C() {
		int c = 30;
		System.out.println("Inside C");
	}

	private static void B() {
		int b = 20;
		C();
		System.out.println("Inside B");
	}

	private static void A() {

		int a = 10;
		B();
		System.out.println("Inside A");

	}

	public static void main(String[] args) {
		A();
		D();
		double num = Math.PI;
		double n = Math.random();
		System.out.println("Num " + num + " and n " + n);
		
		CallStack.D();
		
		CallStack c = new CallStack();
		System.out.println("HashCode "+c.hashCode());
	}

}
