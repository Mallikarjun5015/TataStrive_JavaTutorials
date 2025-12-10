package inheritance;

//Parent Class..
class Dog {
	String color;
	String breed;

	public Dog(String color,String breed) {
		super();
		this.color = color;
		this.breed=breed;
	}

	public void demo01() {
		System.out.println(color+" "+breed);
	}
}

//Child Class..
class BabyDog extends Dog {

	String name;

	public BabyDog(String color, String name, String breed) {
		super(color,breed);
		this.name = name;
	}

	public void demo02() {
		System.out.println("Name : "+name + "\nColor: "+color+"\nBreed: "+breed);
	}
}

public class Inheritance_01_Single {

	public static void main(String[] args) {

		new BabyDog("Golden", "Charlie","Retriver").demo02();
	}
}
