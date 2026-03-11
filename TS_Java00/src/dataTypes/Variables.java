package dataTypes;

public class Variables {

	// Instance variable outside the method and inside the class
	static int b = 20;
	
	String name="Dinga";
	
	void detail() {
		System.out.println(b);
		System.out.println(name);
	}

	public static void main(String[] args) {
		// Local variable inside the method
		int a = 10;
		System.out.println(a);
		System.out.println(b);
		Variables v = new Variables();
		v.detail();
		
	}
}
