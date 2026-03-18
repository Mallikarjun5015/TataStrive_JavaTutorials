package multiThreading;

class MyThread implements Runnable{

	@Override
	public void run() {
		System.out.println("Runnable Thread");
	}

	public void start() {
		// TODO Auto-generated method stub
		
	}
	
}

class Cooking extends Thread{
	
	private String item;
	
	Cooking(String item){
		
		this.item=item;		
	}
	
	@Override
	public void start() {
		super.start();
		System.out.println("Overriden start");
	}
	
	@Override
	public void run() {
		super.run();
		System.out.println("The item "+this.item+" is prepared by the chef "+Thread.currentThread().getName());
	}
}
public class Thread_03 {

	public static void main(String[] args) throws InterruptedException {
		
		Runnable r = () -> System.out.println("Running...");
		MyThread c = new MyThread();
		c.start();
		Cooking c1 = new Cooking("Pasta");
		Cooking c2 = new Cooking("Salad");
		Cooking c3 = new Cooking("Veg Rice");
		Cooking c4= new Cooking("Dessert");
		Cooking c5 = new Cooking("Ice Cream");
		
		c1.start();
		c2.start();
		c3.start();
		c3.join();// main waits here
		System.out.println("Main start again");
		c4.start();
		Thread.yield(); // hint to wait for same or higher prio thread
		c5.start();
	}

}
