package encapsulation;

class Person {

	private String name= "Mallikarjun";
	private int age = 23;
	
	

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

}

public class Encapsulation_01_ReadOnly {

	public static void main(String[] args) {

		Person p = new Person();
		System.out.println("Read Only....");
		System.out.println("Name : "+p.getName()+" Age : "+p.getAge());
	}

}
