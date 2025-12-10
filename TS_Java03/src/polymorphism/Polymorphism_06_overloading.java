package polymorphism;

class Bank {

	public void bank(String name, String address) {

		System.out.println("The Bank name is :"+name+" and the adress is :"+address);
	}

	public void bank(String name, long accNo, String IFSCcode) {

		System.out.println("The Bank name is "+name+" Account Number : "+accNo+" IFSC Code :"+IFSCcode);
	}
}

public class Polymorphism_06_overloading {

	public static void main(String[] args) {
		
		Bank b = new Bank();
		b.bank("HDFC", "Veerannapalya");
		b.bank("ICICI", 123456789, "ICICI00123");
	}

}
