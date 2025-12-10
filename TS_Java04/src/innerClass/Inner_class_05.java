package innerClass;

class OuterDemo{
	public static class Inner {
		void display() {
			System.out.println("Inner static class");
		}
	}
}

public class Inner_class_05 {

	public static void main(String[] args) {
		
		OuterDemo.Inner i = new OuterDemo.Inner();
		i.display();
		
	}

}
