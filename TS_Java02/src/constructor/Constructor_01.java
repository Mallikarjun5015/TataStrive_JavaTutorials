package constructor;

class Main {

	public Main() {
		System.out.println("Hello");
	}
	
	public Main(int a) {
		System.out.println("Hello !!!");
	}
	
	public Main(int a, int b) {
		this(2);
		System.out.println(a+" "+b);
	}
	
	
}

public class Constructor_01 {

	public static void main(String[] args) {
		//new Main();
		new Main(1,4);
	}

}
