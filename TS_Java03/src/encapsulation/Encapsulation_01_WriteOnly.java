package encapsulation;

class Person01 {

	private String name = "Mallikarjun";
	private int age = 23;

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

}

public class Encapsulation_01_WriteOnly {

	public static void main(String[] args) {

		Person01 p = new Person01();
		System.out.println("Write only...");
		System.out.println("Name : " + p.getName() + " Age : " + p.getAge());

		p.setName("Sachin");
		p.setAge(22);

		System.out.println("Name : " + p.getName() + " Age : " + p.getAge());

	}

}
