package methods;

class Instance{
	
	String name= "Ninja";
	void greet() {
		
		System.out.println("Hello Developers..!! I am "+name+"..");
	}
	
	void add(int a, int b) {
		System.out.println("Sum is "+(a+b));
	}
	
	private int age=24;
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	
}

public class InstanceMethod {

	public static void main(String[] args) {
		
		Instance m = new Instance();
		m.greet();
		m.add(12, 8);
		System.out.println("age before "+m.getAge());
		m.setAge(25);
		System.out.println("age after "+m.getAge());

	}

}
