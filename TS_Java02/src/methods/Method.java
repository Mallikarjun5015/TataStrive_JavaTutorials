package methods;

import java.util.Scanner;

class Company {
	void Employee(String name, Long sal, String role) {

		System.out.println("Employee name is " + name + " have the salary " + sal 
				+ " doing the role of " + role);
	}

	int Department(String D_name, int D_id) {

		System.out.println("Department name: " + D_name + " and ID is " + D_id);
		return 0;
	}
}

public class Method {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Employee details.... ");

		String E_name = sc.nextLine();
		String Role = sc.nextLine();
		Long Salary = sc.nextLong();
		
		
		System.out.println("Enter the Department details.... ");

		int D_id = sc.nextInt();
		String D_name = sc.next();
		

		Company c1 = new Company();

		c1.Employee(E_name, Salary, Role);
		c1.Department(D_name, D_id);

	}

}
