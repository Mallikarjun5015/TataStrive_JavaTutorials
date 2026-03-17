package exception;

class IllegalAgeException extends Exception {

	IllegalAgeException(String msg) {
		super(msg);
	}
}

class VotingCard {

	String name;
	int age;

	VotingCard(String name, int age) throws IllegalAgeException {
		if (age < 18)
			throw new IllegalAgeException("Age is less than 18");
		this.name = name;
		this.age = age;
		System.out.println(this.name + " is " + this.age + " year old and he can vote");
	}
}

public class UserDefined {

	public static void main(String[] args) {
		VotingCard v1 = null;
		try {
			v1 = new VotingCard("Dinga", 18);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.exit(0);
		}
		System.out.println(v1 + " adress");

		v1 = null;
		try {
			v1 = new VotingCard("Gunda", 12);
		} catch (IllegalAgeException e) {
			System.out.println(e.getMessage());
		}

		finally {
			System.out.println("Finally block");
		}
		System.out.println(v1);

	}

}
