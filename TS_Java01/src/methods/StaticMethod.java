package methods;

class StaticClass{
	
	static int num1=200;
	
	public int num2 = 300;
	
	void display() {
		System.out.println("Num 01: "+num1+" and num 02: "+num2);
	}
	
	static void show() {
			System.out.println("Num 01: "+num1);
			//And num 02:"+ num2 => Static Method Cannot Access Instance Variables
	}
	
	static void staticMethod() {
		System.out.println("Static method.");
	}
	
	void instanceMethod() {
		System.out.println("showing static from instace");
		staticMethod();
	}
}


public class StaticMethod {

	public static void main(String[] args) {

		StaticClass m = new StaticClass();
		m.display();
		StaticClass.show();
		
		m.instanceMethod();
		StaticClass.staticMethod();// Static Methods Accessed from Both Static and Non-Static Methods
		
	}
}
