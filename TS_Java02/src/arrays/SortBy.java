package arrays;

import java.util.Arrays;
import java.util.Comparator;

class Student{
	
	int dNo;
	String name;
	String dName;
	
	public Student(int dNo, String name, String dName) {
		super();
		this.dNo = dNo;
		this.name = name;
		this.dName = dName;
	}

	@Override
	public String toString() {
		return "Student [dNo=" + dNo + ", name=" + name + ", dName=" + dName + "]";
	}
	
}

class SortByDno implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		
		return o1.dNo-o2.dNo;
	}
	
}

public class SortBy {

	public static void main(String[] args) {
		
		Student[] students = {
	            new Student(6, "Ram", "MP"),
	            new Student(2, "Shyam", "UP"),
	            new Student(3, "Harini", "Del"),
	            new Student(5, "Harish", "elhi"),
	            new Student(4, "Harina", "hi"),
	            new Student(1, "Harima", "De")
	        };

	        // Sort using custom comparator
	        Arrays.sort(students, new SortByDno());

	        // Print sorted students
	        for (Student s : students)
	            System.out.println(s);
	}

}
