package dataTypes;

class Me {

	String name;
	int age;

	Me(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	void detail() {
		System.out.println("My name is "+this.name+" and my age is "+this.age);
	}
}

public class MyDetails {

	public static void main(String[] args) {
		
		System.out.println("My deatils");
		Me m = new Me("Mallikarjun", 23);
		m.detail();

	}

}
