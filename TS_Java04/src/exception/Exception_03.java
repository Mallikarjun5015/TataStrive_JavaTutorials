package exception;

public class Exception_03 {

	public static void main(String[] args) {

		String name = null;

		try {

			try {
				int a = 10 / 0; // This causes ArithmeticException
			} catch (ArithmeticException e) {
				System.out.println("Inner catch: " + e);
			}

			System.out.println(name.length());
		} catch (Exception e) {

			System.out.println(e);
		}
		
		try {
            // Outer try block
            System.out.println("Outer try block started");

            // Inner try block 1: handles ArithmeticException
            try {
                int n = 10;
                int res = n / 0;  // This will throw ArithmeticException
            } catch (ArithmeticException e) {
                System.out.println("Caught ArithmeticException in inner try-catch: " + e);
            }

            // Inner try block 2: handles NullPointerException
            try {
                String s = null;
                System.out.println(s.length());  // This will throw NullPointerException
            } catch (NullPointerException e) {
                System.out.println("Caught NullPointerException in inner try-catch: " + e);
            }

        } catch (Exception e) {
            // Outer catch block (optional general handler)
            System.out.println("Caught exception in outer try-catch: " + e);
        } finally {
            // Finally block executes in most cases
            System.out.println("Finally block executed");
        }

        System.out.println("Program continues after nested try-catch");

	}

}
