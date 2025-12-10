package inheritance;

class GrandParent{
	public void demo01() {
		System.out.println("Im Grand Parent...");
	}
}
class Parent extends GrandParent{
	public void demo02() {
		System.out.println("Im Parent..");
	}	
}
class Child extends Parent{
	public void demo03() {
		System.out.println("Im Child...");
	}
}
public class Inheritance_03_Multilevel {

	public static void main(String[] args) {
		Child c = new Child();
		c.demo01();
		c.demo02();
		c.demo03();
	}
}
