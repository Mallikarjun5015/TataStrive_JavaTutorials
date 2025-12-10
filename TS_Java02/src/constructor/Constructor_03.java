package constructor;

class Person {
	String name;
	int rollNumber;
	String Department;
	int sem;

	public Person(String name, int rollNumber, String department, int sem) {
		this.name = name;
		this.rollNumber = rollNumber;
		this.Department = department;
		this.sem = sem;
	}

	public void detail() {
		System.out.println("My Details ");
		System.out.println("--------------------------");
		System.out.println("Name is     : " + name);
		System.out.println("Roll Number : " + rollNumber);
		System.out.println("Department  : " + Department);
		System.out.println("Semester is : " + sem + "th sem");
	}
}

public class Constructor_03 {

	public static void main(String[] args) {
		new Person("Mallikarjun", 23, "ISE", 8).detail();
	}
}
