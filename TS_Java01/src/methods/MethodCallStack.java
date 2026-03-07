package methods;

public class MethodCallStack {
	
	private static void methodFour() {
		
		System.out.println("Inside method four..");
	}

	private static void methodThree() {
		System.out.println("Inside method Three..");		
	}
	
	private static void methodTwo() {
		methodThree();
		System.out.println("Inside method two");
	}

	private static void methodOne() {
		int num = 100;
		methodTwo();
		System.out.println("Insode method one..");
	}

	public static void main(String[] args) {
		methodOne();
		methodFour();
	}
}
