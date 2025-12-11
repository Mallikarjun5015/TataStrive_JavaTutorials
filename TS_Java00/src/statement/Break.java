package statement;

public class Break {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			if (i == 4) {
				break;
			}
			System.out.println(i); // 0 to 3
		}
	}

}
