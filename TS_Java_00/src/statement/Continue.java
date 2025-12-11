package statement;

public class Continue {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			if (i == 4) {
				continue;
			}
			System.out.println(i); // 0 to 9 but skips i=4
		}

		int i = 1;
		while (i <= 10) {
			if (i == 5) {
				i++;
				continue;
			}
			System.out.println("number is : " + i);
			i++;
		}
	}
}