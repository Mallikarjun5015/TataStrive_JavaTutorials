package p1;

import p2.Man;

class Main{
	
	protected String firstName="Program";
	
	int dNo= 301;
}

class Test extends Main{
	
//	String name="Dinga";
	private int password=1234;

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}
	
	void display() {
		Man m = new Man();
		m.show();
	}
	
	void details() {
		System.out.println(firstName+" this is using protected ");
	}
		
}

public class Person {

	public static void main(String[] args) {
		
		Test t = new Test();
		System.out.println(t.getPassword()+" this is private acess modifier");
		
		Main m = new Main();
		System.out.println("Using Default "+m.dNo);
		
		t.details();
		
		t.display();
	}

}
