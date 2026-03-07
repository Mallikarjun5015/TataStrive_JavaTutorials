package methods;

abstract class Abstract{
	abstract void display();
	
	static void demo() {
		System.out.println("Static method called by class name..");
	}
}

public class Method extends Abstract{
	
	@Override
	void display() {
		System.out.println("Abstarct method implemented..");	
	}
	
	void show() {
		System.out.println("instance method called by object");
	}
	

	public static void main(String[] args) {
		
		Method m = new Method();
		m.show();
		m.display();
		
		System.out.println("Class name with inbuild method: "+m.getClass()+" at memory location "+m.hashCode());
		
		Abstract.demo();
	}
}
