package abstraction;

abstract class Person{
	
	abstract void person(String name, int age);
}

class Person01 extends Person{

	@Override
	void person(String name, int age) {
		
		System.out.println("Name : "+name+" Age : "+age);
	}
	
}

public class Abstraction_02 {

	public static void main(String[] args) {

		Person01  p = new Person01();
		p.person("Mallikarjun", 23);
	}

}
