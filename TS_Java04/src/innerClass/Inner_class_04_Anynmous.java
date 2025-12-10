package innerClass;

abstract class AnymousInner{
	public abstract void myMethod();
}

public class Inner_class_04_Anynmous {

	public static void main(String[] args) {
		
		AnymousInner inner = new AnymousInner() {
			public void myMethod() {
				System.out.println("Anonymous inner class");
			}
		};
		
		inner.myMethod();
	}

}
