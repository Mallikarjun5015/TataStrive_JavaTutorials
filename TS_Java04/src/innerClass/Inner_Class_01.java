package innerClass;

// Inner class

class Outer_class{
	int num;
	private class Inner_class{
		public void innerDemo() {
			System.out.println("This is inner class method..");
		}
	}
	
	void displayInner() {
		Inner_class i = new Inner_class();
		i.innerDemo();
	}
}
public class Inner_Class_01 {

	public static void main(String[] args) {
		
		Outer_class o = new Outer_class();
		o.displayInner();
	}

}
