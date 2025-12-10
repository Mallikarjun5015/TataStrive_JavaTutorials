package polymorphism;

class Interest {

	public int findInterest(int p, int r) {

		int i = (p * r) / 100;

		return i;
	}
	
	public int findInterest(int p, int r, int t) {

		int i = (p * t* r) / 100;

		return i;
	}
}

public class Polymorphism_05_overloading {

	public static void main(String[] args) {
		
		Interest i = new Interest();
		
		System.out.println("Interest One is : "+i.findInterest(50000, 5)+" Rupees only...");
		
		System.out.println("Interest Two is : "+i.findInterest(10000, 8, 2)+" Rupees only...");

	}

}




