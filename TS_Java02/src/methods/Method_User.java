package methods;

import java.util.Scanner;

class Person{
	public void details(String name, int age) {
		System.out.println(name+" "+age);
	}
}
public class Method_User {

	public static void main(String[] args) {
		Person p1 = new Person();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the person details..");
		String name=sc.nextLine();
		int age=sc.nextInt();
		
		p1.details(name, age);
		
	}

}
