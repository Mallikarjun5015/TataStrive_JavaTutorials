package com.mallu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employee{
	int id;
	String name;
	int age;
	String gender;
	String department;
	int yearOfJoining;
	double salary;
	
	public Employee(int id, String name, int age, String gender,String department, int yearOfJoining, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.department = department;
		this.yearOfJoining = yearOfJoining;
		this.salary = salary;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getYearOfJoining() {
		return yearOfJoining;
	}
	public void setYearOfJoining(int yearOfJoining) {
		this.yearOfJoining = yearOfJoining;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}

public class Demo_Emp {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(10,"Mallikarjun",22,"male","Developer",2012,50000.00));
		list.add(new Employee(11,"Harshitha",21,"female","HR",2010,40000.00));
		list.add(new Employee(12,"Nirmala",22,"female","QA",2011,35000.00));
		list.add(new Employee(13,"Vikesh",21,"male","sales",2013,20000.00));
		list.add(new Employee(14,"Abhi",22,"male","product",2014,25000.00));
		list.add(new Employee(15,"Kiran",24,"male","Marketing",2010,40500.00));
		
//		Map<String, List<Employee>> temp = list.stream().collect(Collectors.groupingBy(Employee::getDepartment));
//		System.out.println(temp);
		
		//Collectors.groupingBy()
		//Collectors.avaragingInt(),Double(),
		//Collectors.maxBy();
		//Collectors.counting();
		
		//Comparator.comparingDouble()
		//
		
		
		//list.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);
		
		
		List<String> lang= Arrays.asList("C","C++","Python","Java","Java","C");
		List<String> fetch= Arrays.asList("html","css","js","react");
		List<List<String>> developer = Arrays.asList(lang,fetch);

		//developer.stream().forEach(System.out::println);
		
		lang.stream().skip(2).forEach(System.out::println);
		
		//Stream<List<String>> s1 = developer.stream();
		//s1.flatMap(s->s.stream()).forEach(System.out::println);
	}
}
