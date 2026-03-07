package arrays;

class Person {

	String name;
	int id;

	public Person(String name, int id) {

		this.name = name;
		this.id = id;
	}
}

public class Arrayy {

	public static void main(String[] args) {
		
		Person[] arr;
		arr = new Person[5];
		
		arr[0]= new Person("Dinga", 201);
		arr[1]= new Person("Dingi", 202);
		arr[2]= new Person("Gunda", 203);
		arr[3]= new Person("Gundi", 204);
		arr[4]= new Person("Manga", 205);
		
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Person at "+(i+1)+" position is "+arr[i].name+" with person id "+arr[i].id);
		}
		
		//System.out.println(arr[5]); //Array Index out of box
		

	}

}
