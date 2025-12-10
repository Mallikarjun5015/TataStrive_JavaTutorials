package interfaces;

interface demo {
	int sum(int a, int b);
}

class Demo01 implements demo {

	@Override
	public int sum(int a, int b) {
		return a + b;
	}
}

public class Interface01 {

	public static void main(String[] args) {
		
		Demo01 d = new Demo01();
		System.out.println(d.sum(15, 23));
	}
}
