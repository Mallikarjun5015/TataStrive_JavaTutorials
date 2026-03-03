package functionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

interface Sum {
	void add();
}

class Demo implements Consumer<String> {

	@Override
	public void accept(String t) {
		System.out.println(t);
	}

}

public class Lambda {

	public static void main(String[] args) {
//		Sum a = () -> System.out.println("");
//		a.add();

		List<String> num = Arrays.asList("MallIkarjun", "Jamadar");
//		num.forEach(i -> System.out.print(i));

		Consumer<String> name = new Demo();
		num.forEach(name);

	}
}
