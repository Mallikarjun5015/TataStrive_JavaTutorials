package multiThreading;

class Cooking extends Thread{
	
	private String item;
	
	Cooking(String item){
		
		this.item=item;		
	}
	
	@Override
	public void run() {
		super.run();
		System.out.println("The item "+this.item+" is prepared by the chef "+Thread.currentThread().getName());
	}
}
public class Thread_03 {

	public static void main(String[] args) {
		Cooking c1 = new Cooking("Pasta");
		Cooking c2 = new Cooking("Salad");
		Cooking c3 = new Cooking("Veg Rice");
		Cooking c4= new Cooking("Dessert");
		Cooking c5 = new Cooking("Ice Cream");
		
		c1.start();
		c2.start();
		c3.start();
		c4.start();
		c5.start();
	}

}
