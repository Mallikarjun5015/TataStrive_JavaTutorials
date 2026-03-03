package functionalInterface;

interface VTU{
	
	void demo();
	
	default void location() {
		System.out.println("VTU location");
	}
	
	static void fee() {
		System.out.println("VTU fee stucture..");
	}
}

class College implements VTU{

	@Override
	public void demo() {
		System.out.println("VTU Demo..");
	}
	
}

public class Main {

	public static void main(String[] args) {
		College c = new College();
		c.demo();
		VTU.fee();
		VTU v = new College();
		v.location();
	}

}
