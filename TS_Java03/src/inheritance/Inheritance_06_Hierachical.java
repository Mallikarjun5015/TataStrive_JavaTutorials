package inheritance;

class Parent01{
	
	public void parent() {
		System.out.println("Im parent class");
	}
}

class Child01 extends Parent01{
	public void child01(){
		System.out.println("Im child01 class");
	}
}

class Child02 extends Parent01{
	public void child02() {
		System.out.println("Im child02 class");
	}
}

public class Inheritance_06_Hierachical {

	public static void main(String[] args) {
		Parent01 p = new Parent01();
		p.parent();
//		p.child01(); error
//		p.child02(); error
		
		Child01 c1 = new Child01();
		c1.parent();
		c1.child01();
//		c1.child02(); error
		
		Child02 c2 = new Child02();
		c2.parent();
//		c2.child01();
		c2.child02(); 
	}

}
