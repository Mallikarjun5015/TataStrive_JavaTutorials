package inheritance;
class College {
	String collegeName;
	String address;
	public College(String name, String address) {
		super();
		this.collegeName = name;
		this.address = address;
	}
	public void demo01() {
		System.out.println("Colleage Name : "+collegeName+" And the address is :"+address);
	}
}
class Department extends College {
	String deptName;
	public Department(String name, String address, String deptName) {
		super(name, address);
		this.deptName = deptName;
	}
	public void demo02() {
		System.out.println("Department Name : "+deptName);
	}
}
class Student extends Department {
	String studentName;
	int rollNumber;
	public Student(String name, String address, String deptName, String studentName, int rollNumber) {
		super(name, address, deptName);
		this.studentName = studentName;
		this.rollNumber = rollNumber;
	}
	public void demo03() {
		System.out.println("Student Details....\nCollege Name : " + collegeName + "\nCollege Address : " + address
				+ "\nDepartment Name : " + deptName + "\nStudent Name : " + studentName + "\nRoll Number is : "
				+ rollNumber);
	}
}
public class Inheritance_05_Multilevel {
	public static void main(String[] args) {
		Student s = new Student("Dr AIT", "NagarBhavi", "ISE", "Mallikarjun", 016);
		s.demo03();
	}
}
