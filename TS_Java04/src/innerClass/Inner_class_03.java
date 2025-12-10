package innerClass;

class OuterClass{
	void myMethod() {
		int num = 23;
		class MethodInnerClass{
			public void print() {
				System.out.println("method inner class num: "+num);
			}
		}
		
		MethodInnerClass inner = new MethodInnerClass();
		inner.print();
	}
}

public class Inner_class_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OuterClass outer = new OuterClass();
		outer.myMethod();
	}

}
