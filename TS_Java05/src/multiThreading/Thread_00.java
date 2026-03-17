package multiThreading;

class Test extends Thread{
	
	@Override
	public void run() {
		super.run();
		for(int i = 0; i<=5; i++)
		System.out.println("Inside Test Thread for "+i+" time ");
	}
}
public class Thread_00 {

	public static void main(String[] args) throws InterruptedException {
		
		Test t = new Test();
		t.start();
		for(int i = 0; i<=5; i++)
		System.out.println("Inside main Thread for "+i+" time ");
		Thread.sleep(1);
	}

}
